package com.w2a.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLogin extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		log.debug("hay hay");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
	}

}
