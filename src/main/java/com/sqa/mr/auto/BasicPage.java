/**
 * File Name: BasicPage.java<br>
 * Raley, Mike<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.mr.auto;

import org.openqa.selenium.support.*;

import com.sqa.mr.adactin.*;

/**
 * BasicPage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Raley, Mike
 * @version 1.0.0
 * @since 1.0
 */
public class BasicPage extends Core {

	/**
	 * @param baseURL
	 * @param driver
	 */
	public BasicPage(BasicTest test) {
		super(test);
		PageFactory.initElements(getDriver(), this);
		// TODO Auto-generated constructor stub
	}
}
