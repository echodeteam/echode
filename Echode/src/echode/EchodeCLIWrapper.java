package echode;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import echode.api.Echode;

public class EchodeCLIWrapper {
	private static Echode instance = new Echode(System.out);
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		while(true) {
			//stuff
			System.out.println("-->");
			instance.parse(scan.nextLine());
		}
	}
}
