package com.sqa.mr.adactin;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.sqa.mr.auto.*;

public class AdactinTest extends AbstractLoginTest {

	public AdactinTest() {
		super("http://adactin.com/HotelApp");
	}

	@BeforeClass
	public void adactinLogin() {
		System.out.println("Before class:  login");
		login("sqabcjune12", "sqaadmin2017");
	}

	@AfterClass
	public void adactinLogout() {
		System.out.println("After class:  logout");
		logout();
	}

	@Override
	public void login(String username, String password) {
		WebElement usernameField = getDriver().findElement(By.id("username"));
		WebElement passwordField = getDriver().findElement(By.id("password"));
		WebElement loginButton = getDriver().findElement(By.id("login"));
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		loginButton.click();
	}

	@Override
	public void logout() {
		this.takeScreenshot("Pre logout");
		WebElement logoutField = getDriver().findElement(By.linkText("Logout"));
		logoutField.click();
		this.takeScreenshot("Post logout");
	}
}
