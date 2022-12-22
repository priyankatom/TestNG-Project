package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;

 public void browserIntialization() throws IOException {

  // To read the properties file-
  FileInputStream fis = new FileInputStream(
    "C:\\Users\\Ankur\\eclipse-workspace\\SeleniumProject1\\src\\main\\java\\Resources\\data.properties");

  // To access the properties file
  Properties prop = new Properties();
  prop.load(fis);

  String browserName = prop.getProperty("browser");

  if (browserName.equalsIgnoreCase("chrome")) {
	  
	  System.setProperty("webdriver.chrome.driver",
			     "C:\\Users\\Ankur\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  

    driver = new ChromeDriver();

  } else if (browserName.equalsIgnoreCase("firefox")) {

   // firefox code

  } else {

   System.out.println("please enter valid browser name");
  }

 }

}