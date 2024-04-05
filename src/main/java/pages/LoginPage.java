package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
	public WebElement landingPageloginBtn;
	
	@FindBy(name = "email")
	public WebElement email_textbox;
	
	@FindBy(name = "password")
	public WebElement password_textbox;
	
	@FindBy(linkText = "Login")
	public WebElement loginBtn;
	
	
	public void loginIntoApp() {
		
		landingPageloginBtn.click();
		email_textbox.sendKeys("dasrima476@gmail.com");
		password_textbox.sendKeys("Test1234$");
		loginBtn.click();
		//return new HomePage(driver);		
		
	}

}
