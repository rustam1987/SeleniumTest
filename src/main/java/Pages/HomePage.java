package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='uh-search-box']")
	public WebElement search;
	
	@FindBy(id="uh-logo")
	public WebElement logo;
	
	@FindBy(id="uh-signin")
	public WebElement signIn;
	@FindBy (xpath="//*[@id='createacc']")
	public WebElement signUp;
	
	
	

}
