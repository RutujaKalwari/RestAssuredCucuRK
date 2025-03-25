package basic;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateGoogleSD {
	
	String url;
	Response res = null;
	
	@Given("Prepare URL {String}")
	public void prepare_url(String url) throws InterruptedException
	{
		Thread.sleep(3000);
		this.url = url;
		res = RestAssured.given().get(url);
	}
	
	@When("hit site")
	public void hitGoogleWebsite()
	{
		res = RestAssured.given().get("xyz/");
	}
	
	@Then("Check valid status {int} ok")
	public void Check_valid_status_ok(int expStatCode) throws InterruptedException
	{	
		Thread.sleep(2000);
		int actualstatusCod = res.statusCode();
		Assert.assertTrue("Status code is not matching", actualstatusCod == expStatCode);
	}
	
//	@When("hit amazon site")
//	public void hitAmazonWebsite()
//	{
//		res = RestAssured.given().get("https://www.amazon.in/");
//	}
//	
//	@Then("Check valid status {int} ok")
//	public void Check_valid_status_ok() throws InterruptedException
//	{	
//		Thread.sleep(2000);
//		int statusCod = res.statusCode();
//		Assert.assertTrue("Status code is not matching", statusCod == 200);
//	}

}
