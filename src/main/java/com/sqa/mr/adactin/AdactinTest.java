package com.sqa.mr.adactin;

import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

import com.sqa.mr.auto.*;

public class AdactinTest extends Core {

	public AdactinTest() {
		super("http://adactin.com/HotelApp", new FirefoxDriver());
	}

	@Test
	public void test1() {
		getDriver().get(getBaseURL());
		this.takeScreenshot();
		this.takeScreenshot("Test Case 01");
		this.takeScreenshot();
		this.takeScreenshot();
		this.testingName = "Adactin";
		this.takeScreenshot("Adactin Test");
		this.takeScreenshot();
		AutoBasics.takeScreenshot("screenshots/Adactin Test 5", "Adactin Test 5", getDriver(), getLog());
	}
}
