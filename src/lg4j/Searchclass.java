package lg4j;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class Searchclass 
{
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(Pom.class);
	
  @Test
  public void search() 
  {
	  Pom sp=PageFactory.initElements(driver, Pom.class);
	  sp.searchbox("The Immortals of Meluha");
	  sp.searchbutton();
	  log.info("Product is searched");
  }
@Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser)
  {
	  PropertyConfigurator.configure("C:\\Users\\kps\\eclipse-workspace\\Lg4j\\src\\lg4j\\Log.properties");
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  log.info("Chromedriver is started");
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
	      driver=new FirefoxDriver();	
	      log.info("Firefox is started");
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");  
	  log.info("Application is launched");
	  
  }

  @AfterClass
  public void afterClass()
  {
	  
  }

}
