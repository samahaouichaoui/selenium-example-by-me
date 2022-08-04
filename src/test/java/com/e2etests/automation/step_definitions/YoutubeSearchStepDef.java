package com.e2etests.automation.step_definitions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.e2etests.automation.utils.PropertiesFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class YoutubeSearchStepDef {

	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();
	
	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable
	{
		Properties properties=obj.getProperty();
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/win/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseURL"));
		Thread.sleep(3000);
	}
	@When("^Enter search creteria$")
	public void enter_search_creteria() throws Throwable
	{
		driver.findElement(By.id("search")).sendKeys("selenium by bakkappa n");
		Thread.sleep(1000);
	}
}
