Echode Language Specification
============================
## Main
The Echode language is a language that is designed to be simple. It compiles to Java (source, which compiles to bytecode).
It is strongly static typed.
Everything must be closed with an _end_ statement. Statements are newline-based. Between keywords there must be at least
one bit of whitespace, further whitespace is ignored.

## Program Syntax
The core of a program is written as
> program _programname_
>
> ...
>
> end program

Each program must have a block of code marked with a _starthere_ block, for example
> program _name_
>
> __starthere__
>
> ...
>
> __end starthere__
>
> end program

The command line arguments are made available with the _argv_ list
## Variables and Literals
Variables are declared with the _let_ statement and the _declare_ statement. The difference is that a let statement
assigns a variable at the same time as it is declared, while a declare statement simply declares it's name
> declare _type_  _name_

or

> let _type_ _name_ be _expression_

An exception is when a variable has already been declared, in which case the let statement is used without the type:

> let _name_ be _expression_

### Variable Types
There are several variable types

 * Number: (Max value: 2**2**40*10**2**32) (Syntax: __3.1415__)
 * String (syntax: __"stringvalue"__)
 * Boolean (syntax: __true__ or __false__)
 * List (syntax: __[type]{obj1, obj2, obj3}__) (see later)

## Functions

Functions are declared as
> function _name_
>
> ...
>
> end function

and called with
> call _name_

A function with parameters are declared as

> function _name_ with (_partype_ _parname_ = _default_, _par2type_ _par2name_ = _par2default_)
>
> ...
>
> end function

and called with
> call _name_ with (_parname_ = _parvalue_, _par2name_ _par2value_)

Parameter names MUST be included, except if there is only one parameter. In addition, parameters can be in __any__ order