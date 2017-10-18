package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage {
	private WebDriver driver;
	public AmazonHomePage(WebDriver driver){
		this.driver=driver;
	}
	@FindBy (xpath="//*[@id='nav-link-accountList']/span[1]")
	public WebElement signIn;
	
	@FindBy(id="createAccountSubmit")
	public WebElement creatAcc;
	
	
	

}
