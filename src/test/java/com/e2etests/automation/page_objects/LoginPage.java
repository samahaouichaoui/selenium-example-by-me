package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LoginPage {
	/*@FindBy WebElement*/
	@FindBy(how = How.ID, using = "name")
	public static WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.ID, using = "login")
	public static WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	/*Create methods*/
	public void fillUsername(String txt_username) {
		username.sendKeys(txt_username);
	}
	
	public void fillPassword(String txt_password) {
		password.sendKeys(txt_password);
	}
	
	public void clickOnbtnLogin() {
		btnLogin.click();
	}

}
