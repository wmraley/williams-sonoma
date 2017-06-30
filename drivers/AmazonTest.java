package com.sqa.jf.amazon;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class AmazonTest {

	// Variables: Driver to drive test
	private WebDriver driver;

	// Keep track of the base domain of testing site
	private String baseUrl;

	@BeforeClass(enabled = false)
	public void setUpChrome() throws Exception {
		// Set system property to use Chrome driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// Setup the driver to use Chrome
		this.driver = new ChromeDriver();
		// Set the base URL for this test
		this.baseUrl = "https://www.amazon.com/";
		// Set an implicit wait of up to 30 seconds
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		this.driver.manage().window().maximize();
	}

	@BeforeClass(enabled = true)
	public void setUpFirefox() throws Exception {
		// Setup the driver to use Firefox
		this.driver = new FirefoxDriver();
		// Set the base URL for this test
		this.baseUrl = "https://www.amazon.com/";
		// Set an implicit wait of up to 30 seconds
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		this.driver.manage().window().maximize();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		// quit closes all instances of the browser.
		this.driver.quit();
		// close method would close current instance only.
		// ex: driver.close();
	}

	@Test
	public void testAmazon() throws Exception {
		// Go to base url of domain of site being tested
		this.driver.get(this.baseUrl + "/");
		// Capture the search field in a WebElement
		WebElement searchField = this.driver.findElement(By.id("twotabsearchtextbox"));
		// Clear the search field
		searchField.clear();
		// Type text into the search field
		searchField.sendKeys("dog treats");
		// Capture the search button in a WebElement and click on it
		WebElement searchButton = this.driver.findElement(By.cssSelector("input.nav-input"));
		searchButton.click();
		// Alternatively submit the form for searching
		// searchField.submit();
		// Click on first item in results
		WebElement resultItem = this.driver.findElement(By.xpath("//li[@id='result_0']/div/div[4]/div/a/h2"));
		resultItem.click();
		// Choose option to buy one time as a guest user
		this.driver.findElement(By.xpath("//div[@id='oneTimeBuyBox']/div/div/a/i")).click();
		// Set the quantity to 5
		new Select(this.driver.findElement(By.id("quantity"))).selectByVisibleText("5");
		// Click on the add to cart button
		this.driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(10000);
		// Click on the view cart button
		this.driver.findElement(By.id("hlb-view-cart-announce")).click();
		// delete the item from your cart
		this.driver.findElement(By.name("submit.delete.C2F8NMEOBSVVVF")).click();
	}
}
