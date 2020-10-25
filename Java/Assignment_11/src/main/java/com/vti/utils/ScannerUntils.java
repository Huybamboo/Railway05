package com.vti.utils;

import java.util.Scanner;

public class ScannerUntils {

	private static Scanner scanner = new Scanner(System.in);

	private static void printErrString(String errString) {
		System.out.println(errString);
	}

	public static int inputInt(String errString) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static float inputFloat(String errString) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static double inputDouble(String errString) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static String inputString(String errString) {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				if (input != null && !input.isEmpty()) {
					return input;
				}
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}
	
	public static int inputId() {
		while (true) {
			int id = inputInt("Please input a id as int, please input again.");
			if (id > 0) {
				return id;
			}
			// else
			System.out.println("Please input a id as int which must be greater than > 0, please input again.");
		}
	}
}
