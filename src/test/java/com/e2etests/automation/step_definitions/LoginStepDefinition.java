package com.e2etests.automation.step_definitions;


import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	private LoginPage loginPage;
	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
	}
	@Given("browser is open")
	public void browserIsOpen() {
		Setup.driver.get("https://example.testproject.io/web/");
	}
	@When("user enters username  {string}")
	public void userEntersUsername(String username) {
		loginPage.fillUsername(username);
	}
	@When("user enters password {string}")
	public void userEntersPassword(String password) {
		loginPage.fillPassword(password);
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnbtnLogin();
	}
	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	    
	}





	
}
