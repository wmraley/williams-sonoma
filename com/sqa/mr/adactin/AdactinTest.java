package com.sqa.mr.adactin;

import org.testng.annotations.Test;



public class AdactinTest extends Core {

	public AdactiTest() {
		
	super("http://adactin.com/HotelApp", new FirefoxDriver());
	}
	
	
		String baseURL = "http://adactin.com/HotelApp");
	
	WebDriver driver = new FirefoxDriver();
	super(baseURL, driver);
	
}


  @Test
  public void test1() {
	  getDriver()
  }
}
