package com.flipkart.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.base.FlipkartBase;
import com.flipkart.pageObject.FlipKartMobAndTabPage;
import com.flipkart.pageObject.FlipkartHomePage;
import com.flipkart.pageObject.SearchResultPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHomeTest extends FlipkartBase {

	private FlipkartHomePage flipkartHomePage ;
	private FlipKartMobAndTabPage flipkartMobAndTabPage;
	private SearchResultPage   flipKartSearchResultPage;
	
	
	
	@BeforeMethod
	public void setUpTest() throws Exception {
		//launchApp(browser);
		WebDriverManager.chromedriver().setup();
		// Set Browser to ThreadLocalMap
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	
	@Test
	public void LoginFlipkartTest() throws Exception {
		flipkartHomePage=new FlipkartHomePage();
		flipkartHomePage.clickMobAndTab();
		flipkartHomePage.searchProduct("Mobiles");
		flipkartHomePage.checkMobileProduct();
	}
}
