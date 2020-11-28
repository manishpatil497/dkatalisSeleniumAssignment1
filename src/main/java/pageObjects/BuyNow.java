package pageObjects;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class BuyNow {

	 WebDriver driver;
	 
	 public BuyNow(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='btn buy']") 
	 private WebElement buyNowBtn;

	 public void buyNowBtnClick() {
		 buyNowBtn.click();
	 }
	 
}
