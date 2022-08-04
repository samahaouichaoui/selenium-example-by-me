package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AddPostPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPostStepDefinition {

	private AddPostPage addPostPage;
public AddPostStepDefinition() {
	this.addPostPage = new AddPostPage();
}
	@Given("Je me connect a l application OrangeHRM")
	public void jeMeConnectALApplicationOrangeHRM() {
		addPostPage.goToURL();
	}
	@When("Je saisis Username")
	public void jeSaisisUsername() {
		addPostPage.fillUsername(null);
	}
	@When("Je saisis le password")
	public void jeSaisisLePassword() {
		addPostPage.fillPassword(null);
	}




	@When("Je clique sur le module Buzz")
	public void jeCliqueSurLeModuleBuzz() {

	}

	@When("Je saisis un message dans le champ mind")
	public void jeSaisisUnMessageDansLeChampMind() {

	}

	@When("Je clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() {

	}

	@Then("Je verifie l affichage de message")
	public void jeVerifieLAffichageDeMessage() {

	}

	@Then("Je me deconnecte de l application OrangeHRM")
	public void jeMeDeconnecteDeLApplicationOrangeHRM() {

	}

}
