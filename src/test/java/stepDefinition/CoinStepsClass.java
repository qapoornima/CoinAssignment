package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import Pages.CoinPageLocators;
import Repository.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class CoinStepsClass {

	WebDriver driver; 
	CoinPageLocators locators;
	Utility utility;

	private static Logger Log = Logger.getLogger(CoinStepsClass.class.getName());


	@Before
	public void setup() throws Exception
	{
		utility = new Utility();
		System.setProperty("webdriver.chrome.driver",utility.getChromeDriver()); 
		driver = new ChromeDriver();
		locators=PageFactory.initElements(driver, CoinPageLocators.class);
		DOMConfigurator.configure(utility.getLog4jConfigure());


	}

	@Given("^coin market application is launching$")
	public void openTheCoinMarketApplication() throws Throwable {

		driver.get(utility.getApplicationUrl());
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("scroll(0,300)");
		Thread.sleep(2000);
	}

	@When("^content is shown by (\\d+)$")
	public void selectRow(int arg1) throws Throwable {
		locators.MoveToRow();
		locators.row();
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("scroll(0,1500)");

	}

	@Then("^caputre required page content$")
	public void captureRequiredPageContent() throws Throwable {

		List<WebElement> availableName=driver.findElements(locators.ava_name);
		Log.info("Number of available names are:"+availableName.size());
		for(WebElement name:availableName) { 

			String availableNameDetail=name.getText(); 
			Thread.sleep(5000);
			Log.info("Available names are :"+availableNameDetail); 
		}

		List<WebElement> availablePrice=driver.findElements(locators.ava_price);
		Log.info("Number of available prices are:"+availablePrice.size());
		for(WebElement price:availablePrice) {

			String availablePriceDetail=price.getText();
			Thread.sleep(5000);
			Log.info("Available prices are :"+availablePriceDetail); 
		}
	}

	@When("^set filter on the page by Algorith PoW$")
	public void SetfilterByAlgorithPow() throws Throwable {
		locators.ClickOnfilters();
		locators.algorithm();
		locators.MoveToElementPow(driver);
		locators.ClickOnPow();
	}

	@When("^apply filter with Mineable,Coins and price range$")
	public void applyFilterWithMineableCoinsAndPriceRange() throws Throwable {
		locators.CliOnAddFilter();
		locators.mineable();
		Thread.sleep(2000);
		locators.allCryptocurrencies(); 
		locators.coins();
		locators.price();
		locators.priceText1();
		locators.priceText2();
		locators.applyFilter();
		Thread.sleep(2000);
		locators.showresults();    
	}
	@Then("^capture filter content and compare with the previous content$")
	public void captureFilterContentAndCompareWithThePreviousContent() throws Throwable {
		List<WebElement> filterName=driver.findElements(locators.filter_name);
		Log.info("Number of Filter names are:"+filterName.size());
		for(WebElement name:filterName) {
			String filterNameDetail=name.getText();
			String availableNameDetail="Ethereum"; 

			if(filterNameDetail.contentEquals(availableNameDetail)) { 
				Log.info(filterNameDetail + "available from 20 row list");
			}
			else{
				Log.info(filterNameDetail+ " Does not available from the list of 20 rows");
			}
		}
	}
		
		@After
		public void tearDown() throws Exception
		{
			driver.close();


		}
		
	}

