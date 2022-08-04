package com.e2etests.automation.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefinition {
	
  public WebDriver driver;
 
	@Given("I've a valid set of data and access")
	public void iVeAValidSetOfDataAndAccess() {
	   
		System.out.println("Valid User");
		driver =  new FirefoxDriver();
		System.out.println("Test Environment Set up Tagname :  Registration");

	}
	@When("Registration page Display")
	public void registrationPageDisplay() {
	   WebDriverWait wait = new WebDriverWait(driver, null, null);
	   wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER")));
	   WebElement register= driver.findElement(By.linkText("REGISTER"));
	   JavascriptExecutor js =(JavascriptExecutor) driver;
	   js.executeScript("arguments[0].setAttribute('target','_self');",register);
	register.click();
	}
	@Then("enter valid Data")
	public void enterValidData() {
	
	}
	@Then("Click on Submit")
	public void clickOnSubmit() {
	
	}
	@Then("Click signoff")
	public void clickSignoff() {
	  
	}
	@Then("Close")
	public void close() {
	   
	}



}
