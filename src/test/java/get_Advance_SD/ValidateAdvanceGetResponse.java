package get_Advance_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class ValidateAdvanceGetResponse {
	
	String url;
	Response response = null;
	
	@Given("Hit books API")
	public void hit_books_API()
	{
		response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");		
	}
	
	@Then("Validate API returns multiple books json")
	public void validate_API_returns_multiple_books_json()
	{
		System.out.println("All logs "+response.then().log().all());
		int bookCount = response.jsonPath().getList("books").size();
		System.out.println("Total book count "+bookCount);
		Assert.assertTrue("Failed-Multiple books not present", bookCount>1);		
	}
	 
//	@Then("Validate attribute at json path {string} and its value {string}")
//	public void Validate_attribute_at_json_path(String jsonPathStr , String expvalue) {
//		boolean result = false;
//		int bookCount = response.body().jsonPath().getList("books").size();
//		for(int i=0; i< bookCount; i++)
//		{
//			String jsonPathReplace = jsonPathStr.replace("XX", ""+i+"");
//			System.out.println("Newy built json path = "+jsonPathReplace);
//			String actualTitle = response.body().jsonPath().getString(jsonPathReplace);
//			if(actualTitle.equals(expvalue))
//			{
//				System.out.println("Book value is present");
//				result = true; 
//				break;
//			}
//			else
//			{
//				result = false;
//			}
//		}
//		Assert.assertTrue("Failed - Attribute value not matching ", result);
//	}
	
	@Then("Books JSON response should contain a book with title {string}")
	public void Validate_attribute_at_json_path(String expvalue) {
		
		response.then().body("bboks.title", hasItem(expvalue));
		
		}
	
}
