package com.aumni.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aumni.base.TestBase;

public class brokenLinkValidation extends TestBase {

	@Test(priority = 0)
	public void brokenLinkValidation() throws InterruptedException, IOException {

		String url;
		HttpURLConnection huc;
		int respCode;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {

			url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			huc = (HttpURLConnection) (new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode = huc.getResponseCode();
			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}
		}
	}

}
