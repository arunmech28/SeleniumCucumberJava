package com.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {



	public  WebDriver driver=null;
//	public DesiredCapabilities capability;

	public Driver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		DriverManager.setWebDriver(driver);
	}


}
