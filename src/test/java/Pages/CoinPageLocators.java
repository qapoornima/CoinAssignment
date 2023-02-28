package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Repository.Utility;

import org.openqa.selenium.interactions.Actions;


public class CoinPageLocators {
	
	
	WebDriver driver;
	Utility utility;
	public CoinPageLocators(WebDriver Idriver)
	 {
		this.driver=Idriver;
		}
	
	@FindBy(xpath="//button[contains(text(),'20')]") 
    WebElement row;
		 	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]")
	WebElement filtersButon;
	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]")
	WebElement algorithm;
	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]")
	WebElement pow;
	
	@FindBy(xpath="//button[text()='Add Filter']")
	WebElement addFilter;
	
	@FindBy(xpath="//label[@id='mineable']")
	WebElement mineable;
	
	@FindBy(xpath="//button[text()='All Cryptocurrencies']")
	WebElement allCryptocurrencies;
	
	@FindBy(xpath="//button[text()='Coins']")
	WebElement coins;
	
	@FindBy(xpath="//button[text()='Price']")
	WebElement price;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement priceText1;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement priceText2;
	
	@FindBy(xpath="//button[text()='Apply Filter']")
	WebElement applyFilter;
	
	@FindBy(xpath="//button[text()='Show results']")
	WebElement showresults;
	
	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]")
	WebElement elementRow;
	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
	WebElement elementRow1;
	
	public By ava_name= By.xpath("//p[contains(text(),'Name')]//following::p[@class='sc-e225a64a-0 ePTNty']");
	public By ava_price= By.xpath("//p[contains(text(),'Price')]//following::div[@class='sc-8bda0120-0 dskdZn']");
	
	public By filter_name= By.xpath("//p[contains(text(),'Price')]//following::div[@class='sc-8bda0120-0 dskdZn']");
	
	
	
	public void MoveToRow() {
		Actions act=new Actions(driver);
		 act.moveToElement(elementRow).click().build().perform();
		 
	}
	
	public void MoveToElementPow(WebDriver driver) {
		Actions act=new Actions(driver);
		 act.moveToElement(elementRow1).click().build().perform();
		 
	}

	public void row()
	{
		row.click();
	}
	
	public void ClickOnfilters()
	{
		filtersButon.click();
	}
	
	public void algorithm()
	{
		algorithm.click();
	}
	
	public void ClickOnPow()
	{
		pow.click();
	}
	
	public void CliOnAddFilter()
	{
		addFilter.click();
	}
	
	public void mineable()
	{
		mineable.click();
	}
	
	public void allCryptocurrencies()
	{
		allCryptocurrencies.click();
	}
	
	public void coins()
	{
		coins.click();
	}
	
	public void price()
	{
		price.click();
	}
	
	public void priceText1()
	{
		priceText1.sendKeys(utility.getFirstPriceValue());
	}
	
	public void priceText2()
	{
		priceText2.sendKeys(utility.getSecondPriceValue());
	}
	
	public void applyFilter()
	{
		applyFilter.click();
	}
	
	public void showresults()
	{
		showresults.click();
	}
	

}
