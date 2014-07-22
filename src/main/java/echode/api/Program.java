
/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

package echode.api;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**A base interface for all Echode echode.programs. Required to be implemented by all echode.programs
 * @author Marks
 *
 */
public abstract class Program {
    
        Map<String, Object> vars = new HashMap<>();
	/**Called when help is invoked on the program.
	 * 
	 * @return the help message to be printed.
         *
	 */
	public abstract String help();
	/**
	 * Called when the program is run. The program shall <i>NEVER</i> print directly to System.out OR System.err,
	 * instead use the output stream.
         * @param o the output stream.
         * @param args the arguments 
	 */
	public void run(PrintStream o, String[] args) {
            o.println("Okay, your raw application is now ready for coding."
                    + "Edit your class's run method to change this code.");
        }
        
        /**Not used now.
         * 
         */
        public abstract void init();
        
        /**
         * Puts a variable
         * @param name
         * @param var 
         */
        protected void putVariable(String name, Object var) {
            vars.put(name, var);
        }
        /**
         * Gets a variable
         * @param name
         * @return the variable
         */
        protected Object getVariable(String name) {
            return vars.get(name);
        }
        public abstract String getName();
}
