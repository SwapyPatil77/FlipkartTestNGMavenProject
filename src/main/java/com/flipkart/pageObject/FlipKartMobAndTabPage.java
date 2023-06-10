package com.flipkart.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.action.Action;
import com.flipkart.base.FlipkartBase;

public class FlipKartMobAndTabPage extends FlipkartBase {

	
Action action=new Action();
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchBox;
	


	public FlipKartMobAndTabPage() {
	
		PageFactory.initElements(driver, this);
	}
	
	public SearchResultPage searchProduct(String productName) throws Exception {
		Thread.sleep(2000);

		action.click(driver, searchBox);
		Thread.sleep(2000);
		action.type(searchBox, productName);
		Thread.sleep(2000);

		return new SearchResultPage();
		
		
		
	}
}
