package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.AmazonHomePage;
import Pages.HomePage;
import SetUp.Generic_methods;

public class AmazonCreateAccounTest extends Generic_methods {
	AmazonHomePage oAmazonHomePage;
	@BeforeSuite
	public void setUpBrowser() throws Exception{
		String browserType=getVal("browser");
		setBrowserType(browserType);	
	}
	@Test
	public void creatAcc(){
		oAmazonHomePage.signIn.click();
		oAmazonHomePage.creatAcc.click();
		boolean pageAcc=pageContain("Create account");
		Assert.assertTrue(pageAcc, "page contains create account");
		closeBrowser();
	}
	
	

}
