package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.SearchItemsPage;
import com.bestbuy.pages.SelectCountryPage;
import com.bestbuy.utils.BaseTest;

public class FooterTest extends BaseTest {

	
	@Test
public void bottomLinkVerification() {
		
		try {
			launchBrowser("https://www.bestbuy.com/");	
			SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			
			FooterTest footerpage = PageFactory.initElements(driver, FooterTest.class);
			sPage.unitedStatesButton();
			
			footerpage.bootomLinkValidation("https://www.bestbuy.com/?intl=nosplash");
			
			String footerLinkTitle = "Best Buy | Official Online Store | Shop Now & Save";
			Assert.assertEquals(driver.getTitle(), footerLinkTitle);
			System.out.println("Test completed- psge verified");
			
			closeBrowser();
			/*String myTitle=driver.getTitle();
			
			Assert.assertTrue(myTitle.contains("Sales and Promotions at Best Buy"));
			System.out.println("Test completed- psge verified");*/
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
}
