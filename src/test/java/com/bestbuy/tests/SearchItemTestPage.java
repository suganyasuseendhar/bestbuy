package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.SearchItemsPage;
import com.bestbuy.pages.SelectCountryPage;

public class SearchItemTestPage extends SearchItemsPage{
@Test
	public void addToCartParticularItem() {
		
		try {
			launchBrowser("https://www.bestbuy.com");	
			SearchItemsPage searchItem = PageFactory.initElements(driver, SearchItemsPage.class);
			
			searchItem.unitedStatesButton();
			searchItem.clickSearch("air cooler");
			searchItem.clickSearchBox();
			searchItem.pressLinkAircooler();
			searchItem.cart();
			//searchItem.closeBrowser();
			
			
				
			
			String myTitle = driver.getTitle();
			Assert.assertTrue(myTitle.contains("Honeywell 194 CFM Indoor Evaporative Air Cooler"));
			System.out.println("Test Completed");
			
			closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		/*String myTitle=driver.getTitle();
		
		Assert.assertTrue(myTitle.contains("Sales and Promotions at Best Buy"));
		System.out.println("Test completed- psge verified");*/
		
		}
	
	
}
