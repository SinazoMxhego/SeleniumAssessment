package com.ilab.selenium;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
	public static WebDriver driver = null;
	Logger log;
	static ExtentReports extent;
	static ExtentTest test;
	static boolean result;

	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//extent report configuration

		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/spark.html");
		extent.attachReporter(spark);


		//log4j2 configuration
		log= LogManager.getLogger(SetUp.class);

	}
	@AfterSuite 
	public void CleanUp() { 
		extent.flush();
	}
}