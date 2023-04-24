package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.AddToCartByDepartment;
import com.bestbuy.pages.PaymentPage;

public class PaymentTest extends PaymentPage {

	@Test
public void paymentToCart() {
		
		try {
			
			launchBrowser("https://www.bestbuy.com/");
			
			//SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			//AddToCartByDepartment deptCart = PageFactory.initElements(driver, AddToCartByDepartment.class);
			PaymentPage pay = PageFactory.initElements(driver, PaymentPage.class);
			
			pay.unitedStatesButton();
			pay.menuClick();
			pay.appliancesClick();
			pay.washersanddryerClick();
			pay.dryerClick();
			pay.loadWasherClick();
			pay.cartClick();
			pay.cartCount();
			pay.checkOutButton();
			pay.continueAs();
			pay.fNmae("alex");
			pay.lastNmae("ruza");
			pay.streetAddress("1090 Adamsville Road");
			pay.enterCityNmae("Mcallen");
			pay.selectState("TX");
			pay.enterZip("78501");
			//pay.useAs();
			pay.applyClick();
			pay.typeEmail("suganit37@gmail.com");
			pay.enterNumber("7358638444");
			pay.continueAsGuest();
			
			
			
			
			
			
			//String myTitle = driver.getTitle();
			//System.out.println("the title is : " + myTitle);
			String itemTitle = "Checkout - Best Buy";
			Assert.assertEquals(driver.getTitle(), itemTitle);
			closeBrowser();
			
			
}
catch(Exception e) {
	
	
	e.printStackTrace();
	
}

		closeBrowser();
	
}
}
