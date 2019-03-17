package com.bankrate.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserNav {
	
	WebDriver dr;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ArifinNiamul\\Desktop\\BTC180927\\webdriver\\MicrosoftWebDriver.exe");
		//dr = new EdgeDriver();
		dr = new ChromeDriver();
		dr.get("https://www.bankrate.com/");
		
		
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		dr.quit();
	}

}
