package com.meetmyservice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
static {
	System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://meetmyservice.com/");
	driver.findElement(By.xpath("//a[.='SIGN UP']")).click();
	driver.findElement(By.xpath("//div[.='As user']")).click();
	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Demo");
	driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("purpose");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("demopurpose001@gmail.com");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9951714865");

	
	
}
}
