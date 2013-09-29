
package echode;

import java.io.PrintStream;

/**A base interface for all Echode echode.programs. Required to be implemented by all echode.programs
 * @author Marks
 *
 */
public interface Program {
	/**Called when help is invoked on the program.
	 * 
	 * @return the help message to be printed.
	 */
	public String help();
	/**
	 * Called when the program is run. The program shall <i>NEVER</i> print directly to System.out OR System.err,
	 * instead use the output stream.
	 * @param o the output stream.
	 */
	public void run(PrintStream o);
	/**
	 * Called when the program is loaded.
	 */
	public void init();
}
