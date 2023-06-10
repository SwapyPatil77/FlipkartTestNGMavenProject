package com.flipkart.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.action.Action;
import com.flipkart.base.FlipkartBase;

public class FlipkartHomePage extends  FlipkartBase{

	Action action=new Action();
	
	//button[@type='submit']
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[text()='✕']")
	WebElement closeLoginPopup;
	
	@FindBy(xpath="//div[text()='Mobiles & Tablets']")
	WebElement clickMobileTab;
	
	@FindBy(xpath="//div[@title='SAMSUNG']")
	WebElement checkSamsung;
	
	@FindBy(xpath="//div[@title='APPLE']")
	WebElement checkApple;
	
	@FindBy(xpath="//div[@title='realme']")
	WebElement checkRealme;
	
	

	public FlipkartHomePage() {
	
		PageFactory.initElements(driver, this);
	}
	
	
	
	public FlipKartMobAndTabPage clickMobAndTab() throws Exception {
		Thread.sleep(2000);
		action.click(driver, closeLoginPopup);
		Thread.sleep(2000);
		action.click(driver, clickMobileTab);
		return  new FlipKartMobAndTabPage();

	}
	
	public SearchResultPage searchProduct(String productName) throws Exception {
		Thread.sleep(2000);

		action.click(driver, searchBox);
		Thread.sleep(2000);
		action.type(searchBox, productName);
		Thread.sleep(2000);
		action.click(driver, searchButton);

		Thread.sleep(2000);

		return new SearchResultPage();
		
		
		
	}
	
	public SearchResultPage checkMobileProduct() throws Exception {
		Thread.sleep(2000);

		action.click(driver, checkSamsung);
		Thread.sleep(2000);
		//action.scrollByVisibilityOfElement(driver, checkApple);
		//Thread.sleep(2000);
		action.click(driver, checkApple);
		Thread.sleep(2000);
		//action.scrollByVisibilityOfElement(driver, checkRealme);
		//Thread.sleep(2000);
		

		action.click(driver, checkRealme);

		Thread.sleep(2000);

		return new SearchResultPage();
		
		
		
	}
	
	
	
	
}
