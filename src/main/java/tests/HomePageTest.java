package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.HomePage;
import SetUp.Generic_methods;

public class HomePageTest extends Generic_methods  {
	HomePage oHomePage;
	@BeforeSuite
	public void setUpBrowser() throws Exception{
		String browserType=getVal("browser");
		setBrowserType(browserType);	
	}
	@Test(priority=1,description="Validating company logo is displayed ")
	public void homePageTest() throws Exception{
		String env=getVal("envirnment");
		if(env.equalsIgnoreCase("prod")){
			String url=getVal("ProdUrl");
			getUrl(url, 50);
		}
		else if(env.equalsIgnoreCase("stage")){
			String url=getVal("StageUrl");
			getUrl(url, 50);
		}
		oHomePage=new HomePage(driver);
	    boolean comLogo=isDisplayed(oHomePage.logo);
		Assert.assertTrue(comLogo, "Yahoo logo is not displayed in home page");
		oHomePage.signIn.click();
		Thread.sleep(2000);
		oHomePage.signUp.click();
		closeBrowser();
	}
	
}
