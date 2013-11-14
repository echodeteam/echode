
package echode.api;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**A base interface for all Echode echode.programs. Required to be implemented by all echode.programs
 * @author Marks
 *
 */
public interface Program {
    
        Map<String, ?> vars = new HashMap<>();
	/**Called when help is invoked on the program.
	 * 
	 * @return the help message to be printed.
         *
	 */
	public String help();
	/**
	 * Called when the program is run. The program shall <i>NEVER</i> print directly to System.out OR System.err,
	 * instead use the output stream.
         * @param o the output stream.
         * @param args the arguments 
	 */
	public void run(PrintStream o, String[] args);
        
        /**Not used now.
         * 
         */
        public void init();
}
