package pageObjects;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static automationFramework.StartDriver.driver;
import static automationFramework.Waits.*;
import static automationFramework.Utils.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static automationFramework.DataReader.*;
import static automationFramework.DynamicWebElements.*;
import static automationFramework.PageActions.*;

public class LoginPage{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	public void navigateToGoogle() throws Exception
	{
		//getParameterString("UatUrl", "environment")
		driver.get("https://www.google.com/");
		log.info("Navigated to google");
	}
}
