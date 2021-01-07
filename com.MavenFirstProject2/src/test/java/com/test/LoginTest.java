package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.MavenFirstProject.LoginPage1;

public class LoginTest {
	WebDriver driver;
	LoginPage1 lp = null;	

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/seleniumm/Offlinewebsite/index.html");

		lp = new LoginPage1(driver);
		
		 
		lp.enterUserName("kiran@gmail.com");
		lp.enterPassword("123456");
		lp.clickLoginButton();
		 

	}

	
}

