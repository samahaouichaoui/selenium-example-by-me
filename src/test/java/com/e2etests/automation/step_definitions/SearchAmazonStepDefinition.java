package com.e2etests.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAmazonStepDefinition {
	

	@Given("I have a search field on Amazon Page")
	public void iHaveASearchFieldOnAmazonPage() {
	   
	}
	@When("I search for a product with name {string} and price {int}")
	public void iSearchForAProductWithNameAndPrice(String string, Integer int1) {
	  
	}
	@Then("Product with name {string} should be displayed")
	public void productWithNameShouldBeDisplayed(String string) {
	    
	}



}
