package com.aumni.testcases;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.aumni.base.TestBase;

public class resourcePageValidation extends TestBase {

	
	@Test(priority = 3)
	public void resourcePageValidation() throws InterruptedException, IOException{
		//Aumni Investment Analytics Resources
		click("resourceBtn_XPATH");
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("ics Resour"));
		
	
	}
	
}
