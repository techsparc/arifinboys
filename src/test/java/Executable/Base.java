package Executable;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	@BeforeSuite
	public void open() throws IOException {
		
		if (driver == null) {
			FileInputStream fis  = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
			config.load(fis);
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/OR.properties");
			OR.load(fis);
			
		}
		if (config.getProperty("browser").equals("chrome")) {

			driver = new ChromeDriver();
			
		} else if (config.getProperty("browser").equals("firefox")) {

			driver = new FirefoxDriver();
		}

		driver.get(config.getProperty("testsiteurl"));
		
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
