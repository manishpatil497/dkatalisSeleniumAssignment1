package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E2E_Test {
	private static WebDriver driver;
	
		//System.setProperty("webdriver.chrome.driver","C:\\ToolsQA\\Libs\\Drivers\\chromedriver.exe");
		
	 	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/manish/Desktop/Manish/Workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.midtrans.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='btn buy']")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
		driver.switchTo().frame(driver.findElement(By.id("snap-midtrans")));
		driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='list with-promo']")).click();
		
		driver.findElement(By.name("cardnumber")).sendKeys("4811111111111114");
		driver.findElement(By.xpath("//div/input[@placeholder='MM / YY']")).sendKeys("12/24");
		driver.findElement(By.xpath("//div/input[@placeholder='123']")).sendKeys("123");
		driver.findElement(By.xpath("//div[@class='button-main show']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@placeholder='112233']")).sendKeys("112233");
		driver.findElement(By.xpath("//div/button[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(5000);		
		driver.switchTo().defaultContent(); 
		
		}

		
}
