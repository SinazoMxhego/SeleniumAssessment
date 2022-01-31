package com.ilab.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class AddUser {
	@Test
	public void add() {
		if(SetUp.driver.findElement(By.id("btnAdd")) != null) {
			SetUp.driver.findElement(By.id("btnAdd")).click();
			if(SetUp.driver.getCurrentUrl().contains("saveSystemUser") && SetUp.driver.findElement(By.id("UserHeading")).getText().equalsIgnoreCase("Add User")) {
				System.out.println(SetUp.driver.findElement(By.id("systemUser_userType")).getText());
				//NB verify status dropdown is Selected
				Select Statuslocation = new Select(SetUp.driver.findElement(By.id("systemUser_status")));
				if (Statuslocation.getFirstSelectedOption().getText().equalsIgnoreCase("Enabled")) {
					Select newLocation = new Select(SetUp.driver.findElement(By.id("systemUser_userType")));
					newLocation.selectByVisibleText("ESS");
					SetUp.driver.findElement(By.id("systemUser_employeeName_empName")).clear();
					SetUp.driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(InputValues.Employee_Name);
					SetUp.driver.findElement(By.id("systemUser_userName")).clear();
					SetUp.driver.findElement(By.id("systemUser_userName")).sendKeys(InputValues.UserName);
					SetUp.driver.findElement(By.id("systemUser_password")).clear();
					SetUp.driver.findElement(By.id("systemUser_password")).sendKeys("Selenium500");
					SetUp.driver.findElement(By.id("systemUser_confirmPassword")).clear();
					SetUp.driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Selenium500");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					SetUp.driver.findElement(By.name("btnSave")).click();
				}
			}
		}
	}
}

