package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OTPPage {
WebDriver driver;
		 
		 public OTPPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }
		 
		 @FindBy(how = How.XPATH, using = "//div/input[@placeholder='112233']") 
		 private WebElement OTP;

		 public void OTPEnter() {
			 OTP.sendKeys("112233");
		 }
		 
		 @FindBy(how = How.XPATH, using = "//div/button[@class='btn btn-sm btn-success']") 
		 private WebElement OTPSubmit;

		 public void OTPSubmitClick() {
			 OTPSubmit.click();
		 }
	
}
