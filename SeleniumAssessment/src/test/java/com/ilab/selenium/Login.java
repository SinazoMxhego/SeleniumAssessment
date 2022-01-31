package com.ilab.selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test
public class Login {
	public void login() {
		SetUp.driver.findElement(By.id(Locators.usernameTextbox)).clear();
		SetUp.driver.findElement(By.id(Locators.usernameTextbox)).sendKeys(InputValues.UserNamelogin);
		SetUp.driver.findElement(By.id(Locators.passwordTextbox)).clear();
		SetUp.driver.findElement(By.id(Locators.passwordTextbox)).sendKeys(InputValues.Password);
		SetUp.driver.findElement(By.id(Locators.LoginButton)).click();
		//validation 1
		if(SetUp.driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println();
			System.out.println(SetUp.driver.findElement(By.id("menu_admin_viewAdminModule")).getText());
			SetUp.driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			if(SetUp.driver.getCurrentUrl().contains("admin/viewSystemUsers")) {
				if(SetUp.driver.findElement(By.id("searchBtn")) != null) {
					System.out.println("Search Button Exists");
				}
				if(SetUp.driver.findElement(By.id("resetBtn")) != null) {
					System.out.println("reset Button Exists");
				}
				if(SetUp.driver.findElement(By.id("btnAdd")) != null) {
					System.out.println("add Button Exists");
				}
				if(SetUp.driver.findElement(By.id("btnDelete")) != null) {
					System.out.println("Delete Button Exists");
				}
			}
		}
		//validations missing
	}
}

