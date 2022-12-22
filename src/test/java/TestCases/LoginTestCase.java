package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.LoginInPageObjects;
import Resources.BaseClass;

public class LoginTestCase extends BaseClass{
	
	
	@Test
	public void login() throws IOException {
		
		 browserIntialization();
		driver.get("https://login.salesforce.com/");
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		
		LoginInPageObjects LPO=new LoginInPageObjects(driver);
		  
		  LPO.enterUsername().sendKeys("rahul");
		  LPO.enterPassword().sendKeys("test");
		  LPO.clickOnLogin().click();
	}

}
