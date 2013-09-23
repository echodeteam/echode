package com.marksomnian.echode;

import java.util.Scanner;

public class Echode {
	static Scanner scan;
	private static String in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		mainLoop();

	}
	private static void mainLoop() {
		while(true) {
			System.out.print("->");
			in = scan.nextLine();
			parse(in);
		}
	}
	private static void parse(String in2) {
		if (in2.equalsIgnoreCase("about")) {
			System.out.println("Echode version 0.2\nMade by Erik Konijn and Marks Polakovs");
		} else {
			System.out.println("Not implemented yet.");
		}
		
	}

}
