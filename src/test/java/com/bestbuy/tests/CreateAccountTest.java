package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.pages.CreateAccountPage;
import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.SelectCountryPage;

public class CreateAccountTest extends CreateAccountPage {
	
	@Test
	public void newAccount() {
		
		try {
			
			launchBrowser("https://www.bestbuy.com/");
			CreateAccountPage accountPage = PageFactory.initElements(driver, CreateAccountPage.class);
			SelectCountryPage sPage = PageFactory.initElements(driver, SelectCountryPage.class);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			
			
			
			accountPage.unitedStatesButton();
			accountPage.clickAccountButton();
			accountPage.Account();
			accountPage.fname("suganya");
			accountPage.lname("suseendhar");//local mailId not accepted
			accountPage.email("suganit37@gmail.com");
			accountPage.password1("Gsugan@1234");
			accountPage.password2("Gsugan@1234");
			accountPage.mobileNumber("7358638444");
			accountPage.backupMail();
			accountPage.newAccount();
			accountPage.skipNow();
		
		
		
		
		String createAccountTitle = "Account Home - Best Buy";
		Assert.assertEquals(driver.getTitle(), createAccountTitle);
		
		closeBrowser();
		}
		catch(Exception e) {
			
			
			e.printStackTrace();
			System.out.println("problem occur while create account");
			
		}
		
		
	}

}
