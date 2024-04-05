package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage{
	
	WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	public WebElement admin_Username;
	
	
	 
	public WebElement admin_User_role;
	
	
	public WebElement admin_Emp_Name;
	
	public WebElement admin_Status;
	

}
