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
