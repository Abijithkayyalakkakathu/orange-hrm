package hrmlogin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Trackers {
	@Test
	public void Track() throws IOException, InterruptedException {
		
		WebDriver driver=null;
		FileInputStream stream=new FileInputStream("login.properties");
		Properties properties=new Properties();
		properties.load(stream);
		
		String Location=properties.getProperty("location");
		String MainURL=properties.getProperty("mainURL");
		String Username=properties.getProperty("username");
		String Password=properties.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver",Location);
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.navigate().to(MainURL);
		
		PageFactory.initElements(driver, LoginPOM.class);
		
		LoginPOM.username.sendKeys(Username);
		LoginPOM.password.sendKeys(Password);
		LoginPOM.loginbutton.click();
		
		//from here
		
		String TRACKERNAME=properties.getProperty("trackername");
		String EMPLOYNAME=properties.getProperty("employname");
		
		LoginPOM.perf.click();
		LoginPOM.con.click();
		LoginPOM.tracks.click();
		LoginPOM.tadd.click();
		LoginPOM.tcancel.click();
		LoginPOM.tadd.click();
		
		LoginPOM.trackername.sendKeys(TRACKERNAME);
		Thread.sleep(3000);
		LoginPOM.employname.sendKeys(EMPLOYNAME);
		Thread.sleep(3000);
		LoginPOM.employname.sendKeys(Keys.ENTER);
		
		LoginPOM.availreviewers.click();
		LoginPOM.aadd.click();
		LoginPOM.ssave.click();
	}

}
