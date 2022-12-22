package TestCases;

	import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

    import PageObjectModel.LoginInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;

	public class SignUpTestCase extends BaseClass {

	 @Test
	 public void verifySignup() throws IOException, InterruptedException{

	  browserIntialization();
	  driver.get("https://login.salesforce.com/");
	  
	  LoginInPageObjects LPO=new LoginInPageObjects(driver);
	  LPO.clickOnTryForFree().click();
	  
	  SignUpPageObjects SPO=new SignUpPageObjects(driver);
	  
	  Thread.sleep(5000);
	  SPO.enterFirstname().sendKeys("ramesh");
	  
	  Select s=new Select(SPO.selectCompanyEmployees());
	  s.selectByIndex(1);
	  
	

	 }

	
	
}
