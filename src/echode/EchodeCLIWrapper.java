package echode;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import echode.api.Echode;
import java.net.MalformedURLException;

public class EchodeCLIWrapper {
	private static Echode instance = new Echode(System.out);
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws ReflectiveOperationException, MalformedURLException {
                instance.intro();
		while(true) {
			//stuff
			System.out.println("-->");
			instance.parse(scan.nextLine());
		}
	}
}
