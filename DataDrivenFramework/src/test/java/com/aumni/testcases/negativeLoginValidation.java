package com.aumni.testcases;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aumni.base.TestBase;

public class negativeLoginValidation extends TestBase {

	
	@Test(priority = 4)
	public void negativeLoginValidation() throws InterruptedException, IOException{
		
		
		driver.findElement(By.xpath("//*[@id=\"comp-kd5ryhsn3label\"]")).click();
		driver.findElement(By.xpath("/html/body/div/form/button")).click();
		
		Thread.sleep(20000);
		type("emailBox_XPATH", "negetiveData@negtive.com");
		//driver.findElement(By.xpath("//*[@id='1-email']")).sendKeys("private.ryan@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class='animated fadeInUp']/child::span")).getText());
	}
	
}
