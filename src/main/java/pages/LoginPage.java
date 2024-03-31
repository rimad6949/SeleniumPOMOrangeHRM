package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "username")
	public WebElement username_Name;

	@FindBy(name = "password")
	public WebElement password_Name;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement loginBtn_LinkText;

	
	public void loginIntoApp() {

		username_Name.sendKeys("Admin");
		password_Name.sendKeys("admin123");
		loginBtn_LinkText.click();
		

	}

}
