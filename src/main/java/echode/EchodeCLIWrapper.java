/*
 * Echode is licensed under the Apache License 2.0. See the full text at
 * http://choosealicense.com/licenses/apache-2.0/
 */

package echode;

import java.util.Scanner;

import echode.api.Echode;
import java.io.IOException;
import java.net.MalformedURLException;

public class EchodeCLIWrapper  {
	private static Echode instance = new Echode(System.out);
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws ReflectiveOperationException, MalformedURLException, IOException {
                instance.intro();
		while(true) {
			//stuff
			System.out.print("-->");
			instance.parse(scan.nextLine());
		}
	}
}
