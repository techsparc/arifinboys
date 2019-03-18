package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactory {
	static WebDriver driver;
	
	public static void openbrowser(String url) {
		
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser opened");
	}
	
	public static void SendValue(String val, String locator) {
		WebElement ele = driver.findElement(By.xpath(locator));
		ele.clear();
		ele.sendKeys(val);
	}
	public static void clickmethod(String locatorforClick) throws InterruptedException {
		System.out.println("Clicking on search button");
		driver.findElement(By.xpath(locatorforClick)).click();
		Thread.sleep(5000);
	}
	
	public static void close() {
		System.out.println("Closing thge Browser");
		driver.close();
	}

}
