package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LogInTest {
	
	@Test
	public void logintest() {
		WebDriver driver = BrowserFactory.startBrowser("http://techfios.com/test/billing/?ng=admin/");
		//driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		
		Assert.assertEquals(loginPage.getPageTitle(), "Login - TechFios Test Application - Billing", "Wrong Page..");
		
		loginPage.login("techfiosdemo@gmail.com", "abc123");
		
		
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		
		
		Assert.assertEquals(dashBoardPage.getPageTitle(), "Dashboard- TechFios Test Application - Billing", "Wrong Dashboard Page..");
		
		
		//Assert.assertEquals(loginPage.getPageTitle(), "Login - TechFios Test Application - Billing", "Page Title does not match");
		
		
		
		
		
		/*DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.waitForPage();*/
	}


}
