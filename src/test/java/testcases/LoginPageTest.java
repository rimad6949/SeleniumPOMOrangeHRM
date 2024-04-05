package testcases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTest() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp();
		log.info("Logged in successfully");
		Thread.sleep(2000);
		
	}
	


}
