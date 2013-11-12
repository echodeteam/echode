package echode.api;

import com.google.common.eventbus.EventBus;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import echode.Program;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

public class Echode {
	 Scanner scan;
	private  String in;
	private  List<Class> loaded = new ArrayList<>();
	 Class<?> c;
	boolean started = false;
	private PrintStream out;
        private Map<String, Map<String, ?>> vars = new HashMap<>();
        public final EventBus EVENT_BUS = new EventBus();
        
        //begin eventbus-specific stuff
        public abstract class ProgramLoadedEvent {
            Class program;
            String name;
            public ProgramLoadedEvent(Class program, String name) {
                this.program = program;
                this.name = name;
            }
        }

	/**
	 * @param args
	 * @throws ReflectiveOperationException 
	 */
	
	public Echode(PrintStream out   ) {
		this.out = out;
	}

	// welcome message
	public  void intro() throws ReflectiveOperationException, MalformedURLException {
		
		out.println("Welcome to ECHODE version 0.3\nLoading echode.programs...");
                resetLoaded();
                loadBuiltins();
		load();
	}

	private  void load() throws ReflectiveOperationException, MalformedURLException {
                String currentDir = System.getProperty("user.dir");
                //System.out.println(currentDir);
		File dir = new File(currentDir + "\\programs\\");
                if (!dir.isDirectory()) {
                    boolean mkdir = dir.mkdir();
                    if (!mkdir) {
                        throw new RuntimeException("Making the directory failed.");
                    }
                }
                URL url = new URL("file", currentDir, "programs/");
		//out.println(dir);
                URL[] urls = new URL[1];
                urls[0] = url;
                URLClassLoader loader = new URLClassLoader(urls);
		for (File f: dir.listFiles()) {
			//out.println(f); Debugging
			if (f.getName().trim().endsWith(".class")) {
				String name = f.getName();
                                name = name.replaceAll(".class", "");
                                name = name.replace(dir.getAbsolutePath(), "");
                                name = name.replaceAll("/", ".");
                                name = name.replaceAll("\\\\", ".");
                                //out.println();
				//out.println(name);
				Class c = loader.loadClass(name);
                                //System.err.println(c);
				for (Class<?> i:c.getInterfaces()) {
                                    //System.err.println(c);
					if (i.equals(Program.class)) {
						add(c);
					
				}
				}
			}
		}
		

		
	}

	

	public  void parse(String in2) throws ReflectiveOperationException {
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
                //Help may be reimplemented at a later date
		case "version":
			out.println("0.3");
			break;
                
		default:
                    Class noparams[] = {};
			for (Class c:loaded) {
				if(c.toString().equalsIgnoreCase(result[0])) {
                                    String[] argv = new String[result.length - 1];
                                    for(int i = 0;i<result.length;i++) {
                                        if (!(i == 0)) {
                                            argv[i-1] = result[i];
                                        }
                                    }
                                        
					c.getDeclaredMethod("run", PrintStream.class, String[].class).invoke(c.getConstructors()[0].newInstance(noparams), out, argv); 
                                                
				}
			}
			break;
		}
	}

    private void resetLoaded() {
        loaded.clear();
    }

    private void add(Class c) {
        loaded.add(c);
        EVENT_BUS.post(new ProgramLoadedEvent(c, c.getName()) {
        });
        out.println("Loaded " + c.getCanonicalName());
    }

    private void loadBuiltins() {
    }
}
