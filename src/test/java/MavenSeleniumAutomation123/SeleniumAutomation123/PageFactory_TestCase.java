package MavenSeleniumAutomation123.SeleniumAutomation123;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

public class PageFactory_TestCase {

	static WebDriver driver;

	Home_PG_POF HomePage;

	LogIn_PG_POF LoginPage;

  @BeforeMethod

  public void beforeMethod() {

	  //System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
	  
	  System.setProperty("webdriver.chrome.driver", ".//src//main//java//Drivers//chromedriver.exe");

	  driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://www.store.demoqa.com");
      
      driver.manage().window().maximize();

      HomePage = PageFactory.initElements(driver, Home_PG_POF.class);

      LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);

  }

  @Test

  public void test() {

      HomePage.lnk_MyAccount.click();

      LoginPage.LogIn_Action("testuser2018July", "qU4oPUoDHE6IWIUe");

      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

      HomePage.lnk_LogOut.click();

  }

  @AfterMethod

  public void afterMethod() {

	  driver.quit();

  }

}
