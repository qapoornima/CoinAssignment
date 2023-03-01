package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class Utility  {
	Properties properties;

	public Utility() throws Exception
	{
		File src=new File("src\\test\\java\\Repository\\TestDataProperties.property");
		FileInputStream file=new FileInputStream(src);
		properties=new Properties();
		properties.load(file);
	}

	

	public String getChromeDriver()
	{
		return properties.getProperty("ChromeDriver");
	}
	public String getApplicationUrl()
	{
		return properties.getProperty("ApplicationURL");
	}
	public String getLog4jConfigure()
	{
		return properties.getProperty("Log4jConfigure");
	}

	public String getFirstPriceValue()
	{
		return properties.getProperty("FirstPriceTextValue");
	}
	public String getSecondPriceValue()
	{
		return properties.getProperty("SecondPriceTextValue");
	}
	public double amount()
	{
		String amount=properties.getProperty("GetAmount");
		double doubleValue=Double.parseDouble(amount);
		return doubleValue;
		}
	/*
	 * public String getamount() { String i= properties.getProperty("GetAmount");
	 * System.out.println( " + i +"); return properties.getProperty("GetAmount"); }
	 */

	public String getSymbol()
	{
		return properties.getProperty("CurrentCurrencySymbol");
	}
	public String getFirstconversionCurrency()
	{
		return properties.getProperty("FirstConversionCurrency");
	}
	
	public String getFinalconversionCurrency()
	{
		return properties.getProperty("FinalCurrencyCurrency");
	}
}
