package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	public Properties config = new Properties();
	public FileInputStream fis;

	@BeforeMethod
	public void setUp() {
		
		if(driver == null) {
			
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(config.getProperty("browser").equals("chrome")) {
				
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				ChromeOptions opts = new ChromeOptions();
				opts.setExperimentalOption("prefs", prefs);
				opts.addArguments("--disable-extensions");
				opts.addArguments("--disable-infobars");
				opts.addArguments("--incognito");
				
				driver = new ChromeDriver(opts);
			}
			else if(config.getProperty("browser").equals("firefox")) {
				
				driver = new FirefoxDriver();
			}
			
			driver.get(config.getProperty("testsiteUrl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			
		}

			
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.quit();	
		}
		

	}

}
