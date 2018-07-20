package MavenSeleniumAutomation123.SeleniumAutomation123;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;
 
public class LogIn_PG_POF {
 
	final WebDriver driver;
 
	@FindBy(how = How.ID, using = "log")
 
	public WebElement txtbx_UserName;
 
	@FindBy(how = How.ID, using = "pwd")
 
	public WebElement txtbx_Password;
 
	@FindBy(how = How.NAME, using = "submit")
 
	public WebElement btn_Login ;
 
	public LogIn_PG_POF(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
 
// This method will take two arguments ( Username nd Password)
 
	public void LogIn_Action(String sUserName, String sPassword){
 
		txtbx_UserName.sendKeys(sUserName);
 
		txtbx_Password.sendKeys(sPassword);
 
		btn_Login.click();
 
	}
 
}
