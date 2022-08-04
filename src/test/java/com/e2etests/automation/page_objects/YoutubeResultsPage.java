package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubeResultsPage {
WebDriver driver;
	
	public YoutubeResultsPage( WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Selenium GRID Full Course by Bakkappa N")
	public WebElement SearchTextbox;
	
	public void NavigateToChannelName() throws InterruptedException {
		
		Thread.sleep(3000);
		SearchTextbox.click();
	}

	public void NavigateToResultPage(Object object) {
		// TODO Auto-generated method stub
		
	}
}
