package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.w2a.base.TestBase;

public class TestProperties {
	
	public static void main(String[] args) throws IOException {
		
		System.getProperty("user.dir");
		Properties config = new Properties();
		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(("user.dir")+"/src/test/resources/properties/config.properties/");
		config.load(fis);
		fis = new FileInputStream(("user.dir")+"/src/test/resources/properties/OR.properties/");
		OR.load(fis);
	}
	

}
