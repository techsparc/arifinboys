package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class,dataProvider = "dp")

	public void addCustomerTest(String firstName, String lastName, String postCode) throws InterruptedException {

//	driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
//	
//	driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstName);
//	
//	driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastName);
//
//	driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postCode);
//
//	driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();

		// this is called code optimization
		Assert.fail("Failing Test Case");
		click("addCustBtn_CSS");
		type("firstname_CSS", firstName);
		type("lastname_CSS", lastName);
		type("postcode_CSS", postCode);
		click("addBtn_CSS");
		Thread.sleep(2000);

		// Hnadling alerts
		driver.switchTo().alert().dismiss();
	}

//	@DataProvider
//	public Object[][] getData() {
//
//		String sheetName = "AddCustomerTest";
//
//		int rows = excel.getRowCount(sheetName);
//		int cols = excel.getColumnCount(sheetName);
//
//		Object[][] data = new Object[rows - 1][cols];
//
//		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
//
//			for (int colNum = 0; colNum < cols; colNum++) {
//
//				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
//			}
//		}
//		return data;
//
//	}

}
