package com.aumni.testcases;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aumni.base.TestBase;

public class BlogPageValidation extends TestBase {

	
	@Test(priority = 2)
	public void BlogPageValidation() throws InterruptedException, IOException{
		
		//Automated investment analytics for venture capital firms

		click("blogBtn_XPATH");
		Assert.assertTrue(driver.getTitle().contains("ital fir"));
		driver.findElement(By.xpath("//*[@id=\"img_comp-kd5rxn5h\"]/img")).click();
	}
	
}
