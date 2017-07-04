package com.sqa.mr.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.mr.auto.*;

public class AdactinHomePage extends BasicPage {

	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "login")
	private WebElement loginButton;

	public AdactinHomePage(BasicTest test) {
		super(test);
		// TODO Auto-generated constructor stub
	}

	public void login(String username, String password) {
		this.usernameField.clear();
		this.usernameField.sendKeys(username);
		this.passwordField.clear();
		this.passwordField.sendKeys(password);
		this.loginButton.click();
	}
}
