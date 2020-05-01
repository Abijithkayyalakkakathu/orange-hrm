package hrmlogin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;





public class HRMlogin {
	
	static Logger logger=Logger.getLogger(HRMlogin.class);
    @Test
	public void login() throws IOException {
		
		WebDriver driver=null;
		FileInputStream stream=new FileInputStream("login.properties");
		Properties properties=new Properties();
		properties.load(stream);
		
		String Location=properties.getProperty("location");
		String MainURL=properties.getProperty("mainURL");
		String Username=properties.getProperty("username");
		String Password=properties.getProperty("password");
		
		PropertyConfigurator.configure("login.properties");
		
		System.setProperty("webdriver.chrome.driver",Location);
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.navigate().to(MainURL);
		
		PageFactory.initElements(driver, LoginPOM.class);
		
		LoginPOM.forgotpassword.click();
		LoginPOM.cancelbutton.click();
		
		LoginPOM.username.sendKeys(Username);
		LoginPOM.password.sendKeys(Password);
		LoginPOM.loginbutton.click();
		
		if(LoginPOM.logo.getAttribute("naturalHeight").equals("0"))
			logger.error("logo is broken");
		else
			logger.info("logo is not broken");
		
		driver.close();
		
		}

}
