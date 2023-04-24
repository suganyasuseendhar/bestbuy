package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCartByDepartment;
import com.bestbuy.pages.CreateAccountPage;
import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.SelectCountryPage;


public class ShopDepartmentTest extends AddToCartByDepartment{

@Test	
public void departmentToCart() {
		
		try {
			
			launchBrowser("https://www.bestbuy.com/");
			
			//SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			AddToCartByDepartment deptCart = PageFactory.initElements(driver, AddToCartByDepartment.class);
			
			
			deptCart.unitedStatesButton();
			deptCart.menuClick();
			deptCart.appliancesClick();
			deptCart.washersanddryerClick();
			deptCart.dryerClick();
			deptCart.loadWasherClick();
			deptCart.cartClick();
			deptCart.cartCount();
			String myTitle = driver.getTitle();
			System.out.println("the title is : " + myTitle);
			String itemTitle = "Cart - Best Buy";
			Assert.assertEquals(driver.getTitle(), itemTitle);
			
			closeBrowser();
			
			
			
}
catch(Exception e) {
	
	
	e.printStackTrace();
	
}

}
}