package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCartByDepartment;
import com.bestbuy.pages.OrderConformationPage;

public class OrderConformationTest  extends OrderConformationPage {

@Test
public void sucessfullOrder() {
		
		try {
			
			launchBrowser("https://www.bestbuy.com/");
			
			OrderConformationPage conformation = PageFactory.initElements(driver, OrderConformationPage.class);
			conformation.unitedStatesButton();
			conformation.menuClick();
			conformation.appliancesClick();
			conformation.washersanddryerClick();
			conformation.dryerClick();
			conformation.loadWasherClick();
			conformation.cartClick();
			conformation.cartCount();
			conformation.checkOutButton();
			conformation.continueAs();
			conformation.fNmae("alex");
			conformation.lastNmae("ruza");
			conformation.streetAddress("1090 Adamsville Road");
			conformation.enterCityNmae("Mcallen");
			conformation.selectState("TX");
			conformation.enterZip("78501");
			//pay.useAs();
			conformation.applyClick();
			conformation.typeEmail("suganit37@gmail.com");
			conformation.enterNumber("7358638444");
			conformation.continueAsGuest();
			
			String itemTitle = "Checkout - Best Buy";
			Assert.assertEquals(driver.getTitle(), itemTitle);
			closeBrowser();
			
}
catch(Exception e) {
	
	
	e.printStackTrace();
	
}
		
		
}


}

