package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class SearchPage {
	/*@FindBy WebElement*/
	@FindBy(how = How.ID, using = "gh-ac")
	public static WebElement name_product;
	
	
	@FindBy(how = How.ID, using = "gh-btn")
	public static WebElement btnSearch;
	
	public SearchPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	/*Create methods*/
	public void fillProductname(String txt_name_product) {
		name_product.sendKeys(txt_name_product);
	}
	
	
	public void clickOnbtnSearch() {
		btnSearch.click();
	}
}
