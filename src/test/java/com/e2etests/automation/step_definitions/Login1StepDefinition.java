package com.e2etests.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1StepDefinition {

	

	@Given("user is on login page")
	public void userIsOnLoginPage() {
		System.out.println("Inside Step - user is on login page");
	}
	@When("user enters username and password")
	public void userEntersUsernameAndPassword() {
		System.out.println("Inside Step -user enters username and password");
	}
	@When("clicks on login button")
	public void clicksOnLoginButton() {
		System.out.println("Inside Step -clicks on login button");
	}
	@Then("user is navigated to the home page")
	public void userIsNavigatedToTheHomePage() {
		System.out.println("Inside Step -user is navigated to the home page");
	}



}
