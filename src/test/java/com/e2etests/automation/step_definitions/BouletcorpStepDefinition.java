package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {
	private BouletcorpPage bouletcorpPage;
	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();
	}

	@Given("I connect to website")
	public void iConnectToWebsite() {
		Setup.driver.get("http://www.bouletcorp.com");
	}
	@When("I click buton aleatoire")
	public void iClickButonAleatoire() {
		bouletcorpPage.clickOnbtnLoginAleatoire();
	}
	@Then("check link facebook")
	public void checkLinkFacebook() {
		bouletcorpPage.clickonfacebookIcon();
	}
	@Then("check link twitter")
	public void checkLinkTwitter() {
	    bouletcorpPage.clickontwitterIcon();
	}
	@Then("check link tumblr")
	public void checkLinkTumblr() {
		 bouletcorpPage.clickOnbtnLogin();
	}



}
