package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

 WebDriver driver;
	 
	 public PaymentPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='list with-promo']") 
	 private WebElement creditCardSelect;

	 
	 public void creditCardSelectClick() {
		 creditCardSelect.click();
	 }
	 
	 @FindBy(how = How.NAME, using = "cardnumber") 
	 private WebElement cardNumber;

	 
	 public void cardNumberEnter(String ccardNumber) {
		 cardNumber.sendKeys(ccardNumber);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//div/input[@placeholder='MM / YY']") 
	 private WebElement cardExpiry;

	 
	 public void cardExpiryEnter(String expiryDate) {
		 cardExpiry.sendKeys(expiryDate);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//div/input[@placeholder='123']") 
	 private WebElement cvvNumber;

	 
	 public void cvvNumberEnter() {
		 cvvNumber.sendKeys("123");
	 }
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='button-main show']") 
	 private WebElement PayNowBtn;

	 
	 public void PayNowBtnClick() {
		 PayNowBtn.click();
	 }
}
