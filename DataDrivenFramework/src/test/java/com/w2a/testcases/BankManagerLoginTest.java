package com.w2a.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		Thread.sleep(3000);
		//log.debug("Inside Login Test");
		click("bmlBtn_CSS");
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not fucking sucessfull");
		
		log.debug("Login successefully executed");
		//Assert.fail("Sumon vai valo hoye jan");
	}
	
	
}
