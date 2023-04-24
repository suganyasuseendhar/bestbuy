package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.LoginPageOpen;
import com.bestbuy.pages.SelectCountryPage;
import com.bestbuy.pages.TakeScreenShot;

public class TakeScreenshotTest extends TakeScreenShot{

	@Test
		public void takeShoot() {
			
			try {
			launchBrowser("https://www.bestbuy.com/");
			
			SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			LoginPageOpen loginOpen = PageFactory.initElements(driver, LoginPageOpen.class);
			TakeScreenShot capturePic = PageFactory.initElements(driver, TakeScreenShot.class);
			sPage.unitedStatesButton();
			loginPage.clickAccountButton();
			loginOpen.signButtonClick();
			loginOpen.enterEmail("moxacor619@ippals.com");
			loginOpen.enterPassword("mox@50987");
			loginOpen.signEnter();
			capturePic.clickPicture();
			capturePic.screenShot("takeShoot");
			
			
			
			
			String signInTitle = "Sign In to Best Buy";
			Assert.assertEquals(driver.getTitle(), signInTitle);
			System.out.println("take screenshot sucessfully");
			
			closeBrowser();
		
			}
		
			catch(Exception e) {
				
				
				e.printStackTrace();
				
			}
			
		}
		
	
	
	
}
