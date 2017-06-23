/**
 * File Name: AppBasics.java<br>
 * Raley, Mike<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 19, 2017
 */
package com.sqa.mr.helpers;

import java.util.*;

import com.sqa.mr.helpers.exceptions.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Raley, Mike
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 *
	 */
	public static void farewellUser(String name) {
		System.out.println("Thanks for using this app.\nHave a great day " + name + "!");
	}

	/**
	 * @return
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " Application.");
		System.out.print("Could I get your name please: ");
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question) {
		boolean isInvalid = true;
		boolean response = false;
		String input = "";
		while (isInvalid) {
			System.out.print(question + " (Yes/No): ");
			input = scanner.nextLine();
			try {
				if (input.equalsIgnoreCase("yes")) {
					isInvalid = false;
					response = true;
				} else if (input.equalsIgnoreCase("no")) {
					isInvalid = false;
					response = false;
				} else {
					throw new InvalidBooleanResponse();
				}
			} catch (InvalidBooleanResponse e) {
				System.out.println("You have an incorrect response (Yes/No) [" + input + "]");
			}
		}
		return response;
	}

	public static char requestChar(String question) {
		boolean isInvalid = true;
		String input = "";
		while (isInvalid) {
			System.out.println(question + " ");
			input = scanner.nextLine();
			try {
				if (input.length() > 1) {
					throw new InvalidCharResponseLength();
				}
				isInvalid = false;
			} catch (InvalidCharResponseLength e) {
				// TODO Auto-generated catch block
				System.out.println("You have entered too many chars [" + input + "]");
			}
		}
		return input.charAt(0);
	}

	public static double requestDouble(String question) {
		double value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Double.parseDouble(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("YOu have not entered a correct formatted number [" + input + "]");
				// TODO: handle exception
			}
		}
		return value;
	}

	public static float requestFloat(String question) {
		float value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Float.parseFloat(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("YOu have not entered a correct decimal formatted number [" + input + "]");
				// TODO: handle exception
			}
		}
		return value;
	}

	public static int requestInt(String question) {
		int value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Integer.parseInt(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("YOu have not entered a correct formatted number [" + input + "]");
				// TODO: handle exception
			}
		}
		return value;
	}

	public static long requestLong(String question) {
		long value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Long.parseLong(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("YOu have not entered a correct decimal formatted number [" + input + "]");
				// TODO: handle exception
			}
		}
		return value;
	}

	public static short requestShort(String question) {
		short value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Short.parseShort(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct decimal formatted number [" + input + "]");
				// TODO: handle exception
			}
		}
		return value;
	}

	public static String requestString(String question) {
		System.out.println(question);
		return scanner.nextLine().trim();
	}
}
