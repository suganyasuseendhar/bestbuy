package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class ValidateMenuPage extends BaseTest{

    @FindBy(xpath = "(//*[starts-with(text(),'United States')])[1]")
	WebElement us;

	public void unitedStatesButton() {

		waitForElement(us);
		clickAction(us);
		

	}
	
	
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topDeal;

	public void topdealButton(String expectedTitle) {

		waitForElement(topDeal);
		clickAction(topDeal);
		ValidateMenuTitle(expectedTitle);
		System.out.println("Top Deals - verifaction sucessfull");

	}
	
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealOfTheDay;

	public void dealClick(String expectedTitle) {

		waitForElement(dealOfTheDay);
		clickAction(dealOfTheDay);
		ValidateMenuTitle(expectedTitle);
		System.out.println("Deal of the Day - verifaction sucessfull");

	}
	
	
	@FindBy(xpath = "//a[text()='Totaltech Membership']")
	WebElement membership;

	public void totalTech(String expectedTitle) {

		waitForElement(membership);
		clickAction(membership);
		ValidateMenuTitle(expectedTitle);
		System.out.println("Totaltech Membership - verifaction sucessfull");

	}
	
	@FindBy(xpath = "//a[text()='Credit Cards']")
	WebElement creditCards;

	public void cardDetails(String expectedTitle) {

		waitForElement(creditCards);
		clickAction(creditCards);
		ValidateMenuTitle(expectedTitle);
		System.out.println("Credit Cards - verifaction sucessfull");

	}
	
	@FindBy(xpath = "//a[text()='Gift Cards']")
	WebElement  giftCards;

	public void giftCardDetails(String expectedTitle) {

		waitForElement(giftCards);
		clickAction(giftCards);
		ValidateMenuTitle(expectedTitle);
		System.out.println("Gift Cards - verifaction sucessfull");

	}

	@FindBy(xpath = "//a[text()='Gift Ideas']")
	WebElement  giftIdea;

	public void giftIdeaDetails(String expectedTitle) {

		waitForElement(giftIdea);
		clickAction(giftIdea);
		ValidateMenuTitle(expectedTitle);
		System.out.println("Gift Ideas - verifaction sucessfull");

	}
	
}
