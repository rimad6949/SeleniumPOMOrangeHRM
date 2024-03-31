package testcases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTest() {
		
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp();
		log.info("Logged in successfully");
	}
	


}
