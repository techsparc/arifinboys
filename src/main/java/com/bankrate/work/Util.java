package com.bankrate.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Util {
	
	WebDriver dr;
	
	public Util(WebDriver dr) {
		this.dr = dr;
	}
	
	public void click(By by) {
		dr.findElement(by).click();
	}
	
	public void type(By by, String value) {
		dr.findElement(by).sendKeys(value);
	}
	
	

}
