/**
 * File Name: Core.java<br>
 * Raley, Mike<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 29, 2017
 */
package com.sqa.mr.auto;

import org.apache.log4j.*;
import org.openqa.selenium.*;

/**
 * Core //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Raley, Mike
 * @version 1.0.0
 * @since 1.0
 */
public class Core {

	private Logger log = Logger.getLogger(this.getClass());

	private String baseURL;

	private WebDriver driver;

	/**
	 * @param baseURL
	 * @param driver
	 */
	public Core(String baseURL, WebDriver driver) {
		super();
		this.baseURL = baseURL;
		this.driver = driver;
	}

	public String getBaseURL() {
		return this.baseURL;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	/**
	 * @return the log
	 */
	public Logger getLog() {
		return this.log;
	}

	public boolean isPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by, getLog());
	}
}
