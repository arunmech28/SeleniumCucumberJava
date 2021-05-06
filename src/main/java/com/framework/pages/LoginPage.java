package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	@FindBy(name="username")
	WebElement txtbox_username;
	
	@FindBy(name="password")
	WebElement txtbox_password;
	
	@FindBy(xpath="//*[text()='LOGIN']")
	WebElement btn_login;

	
	
	public void login(String username, String password) {
	
	}
}
