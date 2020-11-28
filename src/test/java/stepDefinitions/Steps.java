package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.BuyNow;
import pageObjects.HomePage;
import pageObjects.OTPPage;
import pageObjects.PaymentPage;
import pageObjects.ShoppingCart;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import static org.testng.Assert.*;

public class Steps {
	WebDriver driver;
	HomePage homePage;
	BuyNow buyNow;
	ShoppingCart shoppingCart;
	PaymentPage paymentPage;
	OTPPage oTPPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	static ExtentTest test;
	static ExtentReports report;

	// System.setProperty("webdriver.chrome.driver","C:\\ToolsQA\\Libs\\Drivers\\chromedriver.exe");

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws InterruptedException {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage(); 
		//driver.get("https://demo.midtrans.com");
		Thread.sleep(5000);	
	}

	@When("^User add items to cart$")
	public void user_add_items_to_cart() throws InterruptedException {
		BuyNow buyNow = new BuyNow(driver);
		buyNow.buyNowBtnClick();;
		Thread.sleep(5000);
	}

	@And("^User proceed to payment with \"(.*)\" and \"(.*)\"$")
	public void user_proceed_to_payment(String ccardNumber, String expiryDate) throws InterruptedException {
		ShoppingCart shoppingCart = new ShoppingCart(driver);
		PaymentPage paymentPage = new PaymentPage(driver);
		shoppingCart.checkoutBtnClick();
		
		driver.switchTo().frame(driver.findElement(By.id("snap-midtrans")));
		shoppingCart.continueBtnClick();
		Thread.sleep(2000);
		paymentPage.creditCardSelectClick();
		paymentPage.cardNumberEnter(ccardNumber);
		paymentPage.cardExpiryEnter(expiryDate);
		paymentPage.cvvNumberEnter();
		paymentPage.PayNowBtnClick();
		Thread.sleep(2000);
	
	}

	@And("^User Enter OTP$")
	public void user_Enter_OTP() throws InterruptedException {
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		//div[@class='form-group']/label[text()='Merchant Name:']
		try {
		if (driver.findElement(By.xpath("//div[@class='form-group']/label[text()='Merchant Name:']")).isDisplayed());
		else
		{ 
			assertTrue(false);
			System.out.println("You entered invalid card details");
			}
		}catch(Exception e) {
			driver.quit();
			Thread.sleep(2000);
		}
		OTPPage oTPPage = new OTPPage(driver);
		oTPPage.OTPEnter();
		oTPPage.OTPSubmitClick();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	

	
}
