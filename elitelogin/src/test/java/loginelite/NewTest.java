package loginelite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void firstTest() {
	  
	  driver.get("https://www.kobster.com/elite-auth");
	  driver.manage().window().maximize();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  //ChromeOptions chromeOptions= new ChromeOptions();
	  //chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\elitelogin\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("opened successfully");
  }

}
