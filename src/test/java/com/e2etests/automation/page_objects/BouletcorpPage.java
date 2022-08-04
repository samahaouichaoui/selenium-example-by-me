package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class BouletcorpPage {
	private ConfigFileReader configFileReader;
	/*@FindBy WebElement*/
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Aléatoire')]")
	public static WebElement aleatoireBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"social_network\"]/ul/li[3]/a/img")
	public static WebElement facebookIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"social_network\"]/ul/li[4]/a/img")
	public static WebElement twitterIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"social_network\"]/ul/li[5]/a")
	public static WebElement tumblrIcon;
	
	public BouletcorpPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	/*Create methods*/
	public void clickonfacebookIcon() {
		facebookIcon.isDisplayed();
	}
	
	public void clickontwitterIcon() {
		twitterIcon.isDisplayed();
	}
	
	public void clickOnbtnLogin() {
		tumblrIcon.isDisplayed();
	}
	public void clickOnbtnLoginAleatoire() {
		aleatoireBtn.click();
	}
	/*
	 * public void goToURL() {
	 * Setup.driver.get(configFileReader.getProperties("home.url")); }
	 */
	
}
