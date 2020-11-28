package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class HomePage {
	WebDriver driver;
	HomePage homePage;
	ConfigFileReader configFileReader;
	PageObjectManager pageObjectManager; 
	WebDriverManager webDriverManager;
	
	 public HomePage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }

	 public void navigateTo_HomePage() {
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		 }
}
