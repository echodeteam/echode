/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package echode.api;

/**
 *
 * @author Marks
 */
public class Variable {
    // T stands for "Type"
    private Object t;

    public void set(Object t) { this.t = t; }
    public Object get() { return t; }
    public Class getType() { return t.getClass(); }
    public Variable(Object initial) {t = initial;}
            
    
}
