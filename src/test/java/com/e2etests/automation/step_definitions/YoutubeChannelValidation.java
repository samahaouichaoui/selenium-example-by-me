package com.e2etests.automation.step_definitions;

import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.YoutubeChannelPage;
import com.e2etests.automation.page_objects.YoutubeResultsPage;
import com.e2etests.automation.page_objects.YoutubeSearchPage;
import com.e2etests.automation.utils.BrowserUtility;
import com.e2etests.automation.utils.PropertiesFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class YoutubeChannelValidation {

	PropertiesFileReader obj= new PropertiesFileReader();
	private WebDriver driver;
	
	@Given("Open Chrome browser with URL")
	public void openChromeBrowserWithURL()  throws Throwable
	{
        Object properties;
		//BrowserUtility.OpenBrowser(driver,((Object) properties).getProperty("browser.name"),((Object) properties).getProperty("browser.baseURL"));
	}

	@When("Search selenium tutorial")
	public void searchSeleniumTutorial() throws Throwable{

		new YoutubeSearchPage(driver).NavigateToResult(null);
	}

	@When("Click on channel name")
	public void clickOnChannelName() throws Throwable{
		new YoutubeResultsPage(driver).NavigateToChannelName();
	}

	@Then("Validate channel name")
	public void validateChannelName() throws Throwable
	{
		
      String expectedChannelName="Selenium Java TestNG Tutorials -Bakkappa N -Youtube";
      String actualChannelName= new YoutubeChannelPage(driver).getTitle();
      Assert.assertEquals(actualChannelName, expectedChannelName,"Channel names are not matching");
   driver.quit();
	}

}
