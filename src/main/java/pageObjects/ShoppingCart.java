package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

	 WebDriver driver;
	 
	 public ShoppingCart(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='cart-checkout']") 
	 private WebElement checkoutBtn;

	 public void checkoutBtnClick() {
		 checkoutBtn.click();
	 }
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='button-main-content']") 
	 private WebElement continueBtn;

	 public void continueBtnClick() {
		 continueBtn.click();
	 }
	 
}
