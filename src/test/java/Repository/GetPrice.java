package Repository;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetPrice 
{
	Response response;
	
	public String getpricevalue(double amount, String symbol, String convert) throws Exception
	{
		
		
	 response = given().header("X-CMC_PRO_API_KEY", "622a0ab9-b089-42ac-86b2-c5ded192828c")
			   .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
			   .header("Accept-Encoding", "deflate, gzip")
			   .queryParam("amount", amount)
			   .queryParam("symbol", symbol)
	           .queryParam("convert", convert)
	           .when().get("/v1/tools/price-conversion")
	       	   .then().extract().response();
	
	 String str = response.asString();
	
	       	   
	       	//To Parse JSON Array for fetching Price value 
			JsonPath js = new JsonPath(str);
			String cnvert = convert;
			String var = "data."+"quote."+ cnvert +".price";
			String value = js.getString(var);
			return value;
	}
			public int getResponseCode()
			{
				 int statuscode=response.getStatusCode();
				 System.out.println("status code is "+statuscode);
				 Assert.assertEquals(statuscode, 200);
				 return statuscode;
				 }
			

	}
