package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCartByDepartment;
import com.bestbuy.pages.SelectItemByBrand;

public class SelectItemByBrandTest extends SelectItemByBrand{

	@Test
	public void byBrand() {
	
		
		try {
			launchBrowser("https://www.bestbuy.com/");
			
			//SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			SelectItemByBrand ipad = PageFactory.initElements(driver, SelectItemByBrand.class);
			
			
			ipad.unitedStatesButton();
			ipad.menuClick();
			ipad.brandClick();
			ipad.appleClick();
			ipad.ipadClick();
			ipad.ipadMiniClick();
			ipad.appleIpadAddToCart();
			ipad.viewAddToCart();
			
			
			
			
			//String myTitle = driver.getTitle();
			//System.out.println("the title is : " + myTitle);
			String itemTitle = "Cart - Best Buy";
			Assert.assertEquals(driver.getTitle(), itemTitle);
			
			closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
		



}

	
	
	
}
