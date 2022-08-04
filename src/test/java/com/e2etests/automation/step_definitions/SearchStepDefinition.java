package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.page_objects.SearchPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {

	private static final String Then = null;
	private SearchPage searchPage;
	public SearchStepDefinition() {
		this.searchPage = new SearchPage();
	}
	

	@Given("I have a search field on Ebay Page")
	public void iHaveASearchFieldOnEbayPage() {
		Setup.driver.get("https://www.ebay.fr/");
	}


	@When("I search for a product with name {string}")
	public void iSearchForAProductWithNameAndPrice(String name_product) {
		searchPage.fillProductname(name_product);
	}
	
	@Then("Click on button Search")
	public void clickOnButtonSearch() {
		searchPage.clickOnbtnSearch();
	}



}
