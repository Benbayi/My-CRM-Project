package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public void LogInPage(WebDriver driver) {
		this.driver = driver;

	}
	// Element Library
	
	
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;

	// Methods to interact with the elements.
	public void login(String userName, String passWord) {
		UserName.sendKeys(userName);
		Password.sendKeys(passWord);
		SignInButton.click();

	}

	public String getPageTitle() {
		
		return driver.getTitle();
	}

}
