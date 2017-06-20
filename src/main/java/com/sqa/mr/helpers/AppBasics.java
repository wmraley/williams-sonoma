/**
 * File Name: AppBasics.java<br>
 * Raley, Mike<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 19, 2017
 */
package com.sqa.mr.helpers;

import java.util.*;

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
}
