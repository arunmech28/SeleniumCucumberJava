package com.test.stepdefinitions;

import com.framework.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginSteps {


	
	@Given("^I am on login page$")
    public void navigateToLoginPage() throws Throwable {
		System.out.println("in login page");
//		System.out.println("Sceario name is "+Hook.testdata.get("scenarioName"));
		System.out.println("Sceario name is "+new Hook().getCurrentScenario());
	}
	
	@And("^I login using username and password$")
    public void enterUsername_Password() throws Throwable {
		LoginPage loginPage = new LoginPage();
//		loginPage.login(Hook.getData("username"), Hook.getData("password"));
	}
	
	

}
