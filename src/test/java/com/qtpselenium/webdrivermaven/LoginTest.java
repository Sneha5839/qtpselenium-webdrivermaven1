package com.qtpselenium.webdrivermaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("snehsaum@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd");
	}
	@AfterSuite
	public void tearDown()
	{
		
		driver.quit();
	}
}
