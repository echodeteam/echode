/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

package echode.api.compiler;

import echode.api.Program;

import java.io.PrintStream;

/**
 * Created by Marks on 14.3.1.
 */
public class Compile extends Program {

    @Override
    public String help() {
        return null;
    }

    @Override
    public void run(PrintStream o, String[] args) {
        if(args.length < 1) {
            o.println("Usage: compile {name of program to compile}");
        } else {

        }
    }

    @Override
    public void init() {

    }

    @Override
    public String getName() {
        return "compile";
    }
}
