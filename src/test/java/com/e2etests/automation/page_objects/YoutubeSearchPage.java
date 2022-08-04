package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubeSearchPage {
	WebDriver driver;
	
	public YoutubeSearchPage( WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="search")
	public WebElement SearchTextbox;
	
	@FindBy(how=How.CSS,using="#search-icon-legacy")
	public WebElement SearchButton;
	
	public void NavigateToResult(String txt_SearchTextbox ) {
		SearchTextbox.sendKeys(txt_SearchTextbox);
		SearchButton.click();
	}
}
