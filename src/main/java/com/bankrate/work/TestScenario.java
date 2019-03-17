package com.bankrate.work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestScenario {
	
	WebDriver dr;
	
	public TestScenario(WebDriver dr) {
		this.dr = dr;
	}
	
	public void ts1() throws InterruptedException {
		
	WebElement target = dr.findElement(By.xpath("//*[@id=\"csstyle\"]/div[2]/header/nav/ul/li[1]/a"));
	Actions i = new Actions(dr);
	i.moveToElement(target).perform();
	
	WebElement j = dr.findElement(By.xpath("//*[@id=\"csstyle\"]/div[2]/header/nav/ul/li[1]/div/div/div[2]/div/ul/li[1]/a"));
	i.click(j).perform();
	
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
//		JavascriptExecutor scroll = (JavascriptExecutor)dr;
//		scroll.executeScript("window.scrollBy(0,100)", "");
	
	WebElement source = dr.findElement(By.xpath("//*[@id=\"csstyle\"]/main/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/div/input"));
	i.dragAndDropBy(source, 20, 0).perform();
	
	WebElement downpayment = dr.findElement(By.xpath("//*[@id=\"csstyle\"]/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/input"));
	downpayment.clear();
	i.sendKeys(downpayment, "120000").perform();
	
	WebElement dd20years = dr.findElement(By.xpath("//*[@id=\"text36\"]"));
	//WebElement k = dr.findElement(By.xpath("//*[@id=\"text36\"]/option[2]"));
	//WebElement l = dr.findElement(By.xpath("//*[@id=\"text36\"]/option[3]"));
	i.moveToElement(dd20years).perform();
	Thread.sleep(3000);
	Select s = new Select(dd20years);
	s.selectByIndex(2);
	Thread.sleep(3000);
	
		
	WebElement interestrate = dr.findElement(By.xpath("//*[@id=\"csstyle\"]/main/div[2]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/input"));
	i.click(interestrate).perform();
	interestrate.clear();
	i.sendKeys(interestrate, "3.5").perform();
	
	WebElement seeRatesButton = dr.findElement(By.xpath("//*[@id=\"csstyle\"]/main/div[2]/div[2]/div[2]/div/div[2]/div/article/div/div[2]/a"));
	i.click(seeRatesButton).perform();		
	}

}
