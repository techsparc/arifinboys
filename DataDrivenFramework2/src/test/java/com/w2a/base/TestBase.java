package com.w2a.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class TestBase {

	public static WebDriver driver;

	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	
	@BeforeSuite
	public void setUp() throws IOException {

		if (driver == null) {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/config.properties/");
			config.load(fis);
			log.debug("Config file loaded !!!!");
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/OR.properties/");
			OR.load(fis);
			log.debug("OR file loaded !!!!");

		}
		if (config.getProperty("browser").equals("chrome")) {

			driver = new ChromeDriver();
			log.debug("Chrome launched");
		} else if (config.getProperty("browser").equals("firefox")) {

			driver = new FirefoxDriver();
		}

		driver.get(config.getProperty("testsiteurl"));
		log.debug("Navigated to....,!!"+config.getProperty("testsiteurl") );
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);

	}

	
	@AfterSuite
	public void tearDown() {
		if(driver!= null) {
			driver.quit();
		}

	}

}
