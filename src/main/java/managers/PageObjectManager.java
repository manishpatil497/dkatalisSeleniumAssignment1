package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.BuyNow;

import pageObjects.HomePage;
import pageObjects.OTPPage;
import pageObjects.PaymentPage;
import pageObjects.ShoppingCart;



public class PageObjectManager {
	private WebDriver driver;
	
	private HomePage homePage;
	private BuyNow buyNow;
	private ShoppingCart shoppingCart;
	private PaymentPage paymentPage;
	private OTPPage oTPPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}


	public BuyNow getBuyNow() {
		return (buyNow == null) ? buyNow = new BuyNow(driver) : buyNow;
	}

	public ShoppingCart getShoppingCart() {
		return (shoppingCart == null) ? shoppingCart = new ShoppingCart(driver) : shoppingCart;
	}
	
	public PaymentPage getPaymentPage() {
		return (paymentPage == null) ? paymentPage = new PaymentPage(driver) : paymentPage;
	}
	
	public OTPPage getOTPPage() {
		return (oTPPage == null) ? oTPPage = new OTPPage(driver) : oTPPage;
	}

}