package com.ilab.selenium;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
public static WebDriver driver = null;
Logger log;
  @Test
  public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		//log4j2 configuration
		log= LogManager.getLogger(SetUp.class);
		//validate page title
		if(!driver.getTitle().equalsIgnoreCase("OrangeHRM")) {
			System.err.println("Invalid page title");
		}
	}
 
}
