package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.OrderConformationPage;
import com.bestbuy.pages.SelectCountryPage;

public class SelectCountryTest extends SelectCountryPage {
	
	@Test
	public void selectCountry() {
		
		try {
			launchBrowser("https://www.bestbuy.com/");
			
			SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			sPage.unitedStatesButton();
			
			
			
				
			
			String selectTitle = "Best Buy[ | Official Online Store | Shop Now & Save]";
			Assert.assertEquals(driver.getTitle(), selectTitle);
			
			closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}

}
