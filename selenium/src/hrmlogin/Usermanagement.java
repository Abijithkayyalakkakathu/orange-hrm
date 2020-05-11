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

public class Usermanagement {
	@Test
	public void user() throws IOException{
		
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
		
		//String EmpName=properties.getProperty("empname");
		//String UserName=properties.getProperty("usrname");
		//String Pasword=properties.getProperty("pwd");
		
		//LoginPOM.admin.click();
		//LoginPOM.usermanage.click();
		//LoginPOM.users.click();
		//LoginPOM.add.click();
		//LoginPOM.cancel.click();
		//LoginPOM.add.click();
		
		//Select select=new Select(LoginPOM.role);
		//Select.selectByValue("1");
		
		//LoginPOM.empname.sendKeys(EmpName);
		//LoginPOM.usrname.sendKeys(UserName);
		
		//Select status=new Select(LoginPOM.status);
		//status.selectByValue("1");
		
		//LoginPOM.pwd.sendKeys(Pasword);
		//LoginPOM.confirmpwd.sendKeys(Pasword);
		
		//LoginPOM.addbtn.click();
		
	}
	

}
