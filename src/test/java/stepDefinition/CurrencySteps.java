package stepDefinition;


import Repository.GetPrice;
import Repository.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CurrencySteps {

    
	GetPrice price;
	Utility utility;
	String firstvalue;

	private static Logger Log = Logger.getLogger(CoinStepsClass.class.getName());

	@Before
	public void setup() throws Exception
	{
		
		utility = new Utility();
		price= new GetPrice();
		DOMConfigurator.configure(utility.getLog4jConfigure());


	}

	@Given("^Base URI is launching$")
	public void laumching_the_base_URI() throws Throwable {

		RestAssured.baseURI = "https://pro-api.coinmarketcap.com/";
	}

	@When("^i set the amount and get the first currency conversion value from Guatemalan Quetzal to British pounds$")
	public void i_set_the_amount_get_the_first_currency_conversion() throws Throwable {


		firstvalue = price.getpricevalue(utility.amount(),utility.getSymbol(),utility.getFirstconversionCurrency());
		Log.info("First Conversion from GTQ to GBP is " + " "+ firstvalue +" ");

	}


	@Then("^i get the final conversion of the currency from GBP to doge coin$") public void
	price_is_convert_to_British_Pound() throws Throwable { 
		double FirstConvertedCurrency  = Double.parseDouble(firstvalue);
		String FinalConversion = price.getpricevalue(FirstConvertedCurrency,utility.getFirstconversionCurrency(),utility.getFinalconversionCurrency());
		Log.info( "Final Conversion from GBP to doge coin is " +FinalConversion);
		int responseCode = price.getResponseCode();
		Log.info( "Response code is " +responseCode);
	}
	

}
