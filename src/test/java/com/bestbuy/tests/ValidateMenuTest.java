package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.SelectCountryPage;
import com.bestbuy.pages.ValidateMenuPage;
import com.bestbuy.utils.BaseTest;

public class ValidateMenuTest extends ValidateMenuPage{

	@Test
	
	public void validateTitle() {
		launchBrowser("https://www.bestbuy.com/");	
		ValidateMenuPage mPage = PageFactory.initElements(driver, ValidateMenuPage.class);
		mPage.unitedStatesButton();
		mPage.topdealButton("Top Deals and Featured Offers on Electronics - Best Buy");
		mPage.dealClick("Deal of the Day: Electronics Deals - Best Buy");
		mPage.totalTech("Best Buy Totaltech™ – Best Buy");
		mPage.cardDetails("Best Buy Credit Card: Rewards & Financing");
		mPage.giftCardDetails("Gifts Cards and E-Gift Cards - Best Buy");
		mPage.giftIdeaDetails("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		
		closeBrowser();
		}
	
	@Test
	public void menuVerify() {
		try {
			launchBrowser("https://www.bestbuy.com/");	
			SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			sPage.unitedStatesButton();
			ValidateMenuPage menu = PageFactory.initElements(driver, ValidateMenuPage.class);
			
			
			menu.menuLinkValidation("https://www.bestbuy.com/?intl=nosplash");
			
			String menuLinkTitle = "Best Buy | Official Online Store | Shop Now & Save";
			Assert.assertEquals(driver.getTitle(), menuLinkTitle);
			System.out.println("Test completed- menu verified");
			
			/*String myTitle=driver.getTitle();
			
			Assert.assertTrue(myTitle.contains("Sales and Promotions at Best Buy"));
			System.out.println("Test completed- psge verified");*/
			
			closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
}
