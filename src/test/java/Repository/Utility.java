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
}
