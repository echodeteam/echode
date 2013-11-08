
import echode.Program;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marks
 */
public class Time implements Program {
       @Override
    public String help() {
        return null;
    }

    @Override
    public void run(PrintStream o, String[] args) {
        try {
				switch (args[0]) {
				case "all":
					String alltime = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss").format(Calendar
							.getInstance().getTime());
					o.println(alltime);
					break;
				case "date":
					String datetime = new SimpleDateFormat(
							"yyyy-MM-dd").format(Calendar
							.getInstance().getTime());
					o.println(datetime);
					break;
				case "digital":
					String digitaltime = new SimpleDateFormat(
							"HH:mm:ss").format(Calendar
							.getInstance().getTime());
					o.println(digitaltime);
					break;
				default:
					o.println("Usage: 'time <all|date|digital>'");
					break;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				o.println("Usage: 'time <all|date|digital>'");
			}
    }

    @Override
    public void init() {
        
    }
}
