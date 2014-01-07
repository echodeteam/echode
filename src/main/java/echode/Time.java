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

package echode;

import echode.api.Program;
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
public class Time extends Program {
       @Override
    public String help() {
        return null;
    }

    @Override
    public void run(PrintStream o, String[] args) {
        if (args.length != 0) {
        
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
        } else {
            o.println("Usage: 'time <all|date|digital>'");
        }
			
    }

    @Override
    public void init() {
        
    }

    @Override
    public String getName() {
        return "Time";
    }
}
