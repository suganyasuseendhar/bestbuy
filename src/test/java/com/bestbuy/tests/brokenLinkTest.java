package com.bestbuy.tests;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.LoginPage;
import com.bestbuy.utils.BaseTest;

public class brokenLinkTest extends BaseTest {

	@Test
	public void checkurl() {
	try {
		launchBrowser("https://www.bestbuy.com/");	
	
	    brokenLinks("https://www.bestbuy.com/");
		
		String launchTitle = "Best Buy International: Select your Country - Best Buy";
		Assert.assertEquals(driver.getTitle(), launchTitle);
		
		closeBrowser();
		
	} catch (Exception e) {
		
		e.printStackTrace();
		System.out.println("problem occurs while testing broken link");
	}
	
	}
	
	
}

	
	
	

