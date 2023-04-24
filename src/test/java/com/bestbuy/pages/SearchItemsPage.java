package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class SearchItemsPage extends BaseTest {
	
	
	//@FindBy (xpath="//input[@id=\'gh-search-input\'][@value=\'air cooler\']")
	//@FindBy  (By.id( "gh-search-input"))
	@FindBy(xpath="(//*[starts-with(text(),'United States')])[1]")
	WebElement us;
	
	public void unitedStatesButton() {

		waitForElement(us);
		clickAction(us);

	}
	
	
	@FindBy (id="gh-search-input")
	WebElement searchBox;
	
	public void clickSearch(String search) {
		
		waitForElement(searchBox);
		//clickAction(searchBox);
		typeText(searchBox, search);
		
		
	}
	
	//@FindBy (xpath="(//*[local-name()='svg'][@class='w-300 h-300 inline-align-middle'])[1]")
	@FindBy  (xpath="//button[@class='header-search-button']")
	WebElement searchBoxIcon;
	
	public void clickSearchBox() {
		
		waitForElement(searchBoxIcon);
		clickAction(searchBoxIcon);
		
		
	}
	
	
	
	@FindBy (xpath="//a[contains(text(), 'Honeywell - 194 CFM')]")
	WebElement pressLink;
	
	public void pressLinkAircooler() {
		
		waitForElement(pressLink);
		clickAction(pressLink);
		
		
	}
	

	@FindBy (xpath="//button[contains(text() ,'Add to Cart')]")
	WebElement addToCart;
	
	public void cart() {
		
		waitForElement(addToCart);
		clickAction(addToCart);
		
		
	}
	
	/*public void learnJavaClick() {

		for (WebElement learnJava : learn) {
			if (learnJava.getText().equals("Learn Java")) {
				// clickAction(learnJava);
				jsClick(learnJava);
			}
		}*/

	}
	
	


