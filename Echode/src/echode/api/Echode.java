package echode.api;

import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import echode.EchodeGUI;
import echode.Program;

public class Echode {
	 Scanner scan;
	private  String in;
	private  List<Class> loaded = new ArrayList<>();
	 Class<?> c;
	boolean started = false;
	private PrintStream out;

	/**
	 * @param args
	 * @throws ReflectiveOperationException 
	 */
	
	public Echode(PrintStream out) {
		this.out = out;
	}

	// welcome message
	public  void intro() throws ReflectiveOperationException {
		
		out.println("Welcome to ECHODE version 0.3\nLoading echode.programs...");
		load();
	}

	private  void load() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		File dir = new File(new File("\\programs\\Test.java").getParent());
		out.println(dir);
		for (File f: dir.listFiles()) {
			out.println(f);
			if (f.getName().trim().endsWith(".class")) {
				String name = f.getName().replace(".class", "");
				out.println(name);
				c = Class.forName("echode.programs." + name);
				for (Class<?> i:c.getInterfaces()) {
					if (i.equals(Program.class)) {
						loaded.add(c);
						out.println("Loaded " + c);
					
				}
				}
			}
		}
		

		
	}

	

	public  void parse(String in2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		/**
		 * Commented this out, in case needed.
		 * 
		 * if (in2.equalsIgnoreCase("about")) { out.println(
		 * "Echode version 0.2.2\nMade by Erik Konijn and Marks Polakovs"); }
		 * else { if (in2.equalsIgnoreCase("kill")){
		 * out.println("Echode shut down successfully."); System.exit(0);
		 * } else{ out.println("Not implemented yet."); } }
		 **/
		String[] result = in2.split(" ");
		switch (result[0]) {
		case "about":
			out
					.println("Echode version 0.3\nMade by Erik Konijn and Marks Polakovs");
			break;
		case "kill":
			out.println("Echode shut down succesfully.");
			System.exit(0);
			break;
		case "help":
			out
					.println("List of commands:\n"
							+ "about ----------------------------------- Gives some info about ECHODE\n"
							+ "help ---------------------------------------------- Lists all commands\n"
							+ "kill ---------------------------------------- Quits the ECHODE console\n"
							+ "version ------------------------ Outputs current Echode version number\n"
							+ "time <all|date|digital> --------------------------------- Outputs time\n");
			break;
		case "version":
			out.println("0.3");
			break;
		case "time":
			try {
				switch (result[1]) {
				case "all":
					String alltime = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss").format(Calendar
							.getInstance().getTime());
					out.println(alltime);
					break;
				case "date":
					String datetime = new SimpleDateFormat(
							"yyyy-MM-dd").format(Calendar
							.getInstance().getTime());
					out.println(datetime);
					break;
				case "digital":
					String digitaltime = new SimpleDateFormat(
							"HH:mm:ss").format(Calendar
							.getInstance().getTime());
					out.println(digitaltime);
					break;
				default:
					out.println("Usage: 'time <all|date|digital>'");
					break;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				out.println("Usage: 'time <all|date|digital>'");
			}
			break;
		default:
			for (Class c:loaded) {
				if(c.getName().equals(result[0])) {
					c.getMethod("run", PrintStream.class).invoke(Echode.class, out); //out is temporary until we get our own PrintWriter
				}
			}
			break;
		}
	}
}
