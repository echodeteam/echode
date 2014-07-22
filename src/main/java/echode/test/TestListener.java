/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package echode.test;

import com.google.common.eventbus.Subscribe;
import echode.api.Echode.ExecEvent;

/**
 *
 * @author Marks
 */
public class TestListener {
    @Subscribe
    public void run(ExecEvent event) {
        //System.err.println("Exec " + event.program );
    }
}
