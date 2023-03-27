package stepDefinations;

import static automationFramework.StartDriver.driver;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import static automationFramework.DataReader.getParameterString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class LoginPageStepDef {

	LoginPage loginPage=new LoginPage(driver);
	
	@Given("naviagte to google")
	public void naviagte_to_google() throws Exception {
		loginPage.navigateToGoogle();
	}


	}
