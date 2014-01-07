
/*
 * Echode
 *     Copyright (C) 2014  Echode Team
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
