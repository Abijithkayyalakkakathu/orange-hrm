package hrmlogin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Configure {

	@Test
	public void confi() throws IOException, InterruptedException{
		
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
		
		String KPI=properties.getProperty("kpi");
		String MAX=properties.getProperty("maxrating");
		String MIN=properties.getProperty("minrating");

		
		LoginPOM.perf.click();
		LoginPOM.con.click();
		LoginPOM.kpis.click();
		Thread.sleep(3000);
		LoginPOM.add.click();
		Thread.sleep(3000);
		LoginPOM.cancel.click();
		Thread.sleep(3000);
		LoginPOM.add.click();
		
		Select select=new Select(LoginPOM.jobtitle);
		select.selectByVisibleText("Sales Executive");
		Thread.sleep(3000);
		
		LoginPOM.kpi.sendKeys(KPI);
		LoginPOM.minrating.clear();
		LoginPOM.minrating.sendKeys(MIN);
		LoginPOM.maxrating.clear();
		LoginPOM.maxrating.sendKeys(MAX);
		LoginPOM.mdc.click();
		
		LoginPOM.save.click();
		
		Thread.sleep(3000);
		
		Select select1=new Select(LoginPOM.job);
		select1.selectByVisibleText("Sales Executive");
		
		LoginPOM.search.click();
				
		LoginPOM.del.click();
		Thread.sleep(3000);
		LoginPOM.delete.click();
		Thread.sleep(3000);
		LoginPOM.ok.click();
		
	
		
	}
}
