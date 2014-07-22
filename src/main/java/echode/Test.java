/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

package echode;

import echode.api.Program;
import java.io.PrintStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marks
 */
public class Test extends Program {
       @Override
	
	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run(PrintStream o, String[] args) {
		o.println("Hehlo!");

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

    @Override
    public String getName() {
        return "Test";
    }
}
