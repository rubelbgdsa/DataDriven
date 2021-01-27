package com.aumni.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aumni.base.TestBase;

public class partnerLogoValidation extends TestBase {

	@Test(priority = 1)
	public void partnerLogoValidation() throws InterruptedException, IOException {
		List<WebElement> Images = driver.findElements(By.tagName("img"));

		for (WebElement image : Images) {

			Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
					"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
					image);
			if (!ImagePresent) {
				System.out.println("Image not displayed.");
			} else {
				System.out.println("Image displayed.");
			}
		}

	}

}
