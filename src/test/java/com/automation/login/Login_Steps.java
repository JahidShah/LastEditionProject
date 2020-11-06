package com.automation.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.UTILITIES.AppProperties;
import com.automation.UTILITIES.DRIVER;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Steps extends DRIVER {

	
	private int timeOutInSeconds = 15;
	
	
	@Given("User navigate to home page")
	public void userNavigateToHomePage () {
		driver.get(AppProperties.AUTOMATION_PRACTICE_BASE_URL);
	}
	
	@When("User clicks on sign_in link")
	public void userClicksOnSignInLink () {
		driverHelper.click(By.xpath("//a[contains(text(),'Sign in')]"), timeOutInSeconds);
	}

	
	@And("User input email address and password")
	public void user_input_email_address_and_password() {
		driverHelper.sendKeys(By.id("email"), "abc213@mailinator.com", timeOutInSeconds);
		driverHelper.sendKeys(By.id("passwd"), "abc1234", timeOutInSeconds);
	}

	@And("User clicks on sign_in button")
	public void user_clicks_on_sign_in_button() {
		driverHelper.click(By.id("SubmitLogin"), timeOutInSeconds);
	}

	@Then("User is on account page")
	public void user_is_on_account_page() {
		String accountHeader = driverHelper.getText(By.xpath("//h1[@class = 'page-heading']"), timeOutInSeconds);
		Assert.assertEquals("AUTHENTICATION", accountHeader);
	}
	
//	@Then("New feature validation")
//	public void new_feature_validation() {
//	    System.out.println("New feature validation");
//	}


}
