package get_SD;

import java.io.BufferedReader;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utility.SupportingUtility;

public class ValidateGetResponse {
	
	String url;
	Response response = null;
	Response responseFailure = null;
	
	@Given("Hit books API")
	public void hit_books_API()
	{
		response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");	
	}
	
	@Then("Validate API returns multiple books json")
	public void validate_API_returns_multiple_books_json()
	{
//		System.out.println("All logs "+response.then().log().all());
		int bookCount = response.jsonPath().getList("books").size();
		System.out.println("Total book count "+bookCount);
		Assert.assertTrue("Failed-Multiple books not present", bookCount>1);		
	}
	
//	@Then("Validate attribute at json path {string} and its value {string}")
//	public void Validate_attribute_at_json_path(String jsonPathStr , String expvalue) {
//	    String actAttibutValue = response.body().jsonPath().getString(jsonPathStr);
//	    System.out.println("actual atr from response = "+actAttibutValue);
//	    Assert.assertTrue("Failed- atr value Not matching", expvalue.equals(actAttibutValue));
//	}
//	
//	@Then("Verify {string} attribute have numbers only")
//	public void verify_isbn_attribute_have_numbers_only(String jsonPathStr)	{
//		String actIsbn = response.body().jsonPath().getString(jsonPathStr);
//		System.out.println(actIsbn);
//		Assert.assertTrue("Failed- ISBN contains characters", SupportingUtility.isNumber(actIsbn));
//	}
	
//	@When("If end point is not correct")
//	public void if_end_point_is_not_correct() {
//		Response invalidUrl = RestAssured.given().get("https://demoqa.com/BookStore/v1/Book");
//		int statcode = invalidUrl.statusCode();
//		System.out.println("StatusCode is "+statcode);
//		Assert.assertTrue("Incorrect endpoint" , statcode==200);
//		
//	}
//
//	@Then("Verify total {int} attributes are present for each book")
//	public void verify_total_attributes_are_present_for_each_book(int numberOfAtr) {
//		
//		List<Map<String, Object>> books = response.body().jsonPath().getList("books");
//
//        // Verify each book has the expected number of attributes
//        for (Map<String, Object> book : books) {
//            int actualAttributeCount = book.size();
//            Assert.assertEquals("Book does not have 9 attributes " + numberOfAtr + " attributes", numberOfAtr, actualAttributeCount);
//        }
//	}

//	@Then("{string} attribute should be a number")
//	public void page_attribute_should_be_a_number_not_a_character(String numOfPage) {
//		
//		 List<Map<String, Object>> books = response.body().jsonPath().getList("books");
//        for (Map<String, Object> book : books) {
//            Object value = book.get(numOfPage);
//            Assert.assertTrue("Attribute '" + numOfPage + "' is not a number: " + value, value instanceof Number);
//        }
//	}
//	
//	@Then("{string} attributes value should start with {string} and end with {string}")
//	public void website_attributes_value_should_shart_with_and_end_with(String website, String expStartUrl, String expEndUrl) {
//		 List<Map<String, Object>> books = response.body().jsonPath().getList("books");
//		 for (Map<String, Object> book : books) {
//			 Object value = book.get(website);
////			 System.out.println("website value is " +value);
//			 String actStartUrl = ((String) value).substring(0, 7);
//			 System.out.println("actual first chars "+actStartUrl);
//			 Assert.assertTrue("Url is not starting with http:// ", expStartUrl == actStartUrl);
//			 
//			 String lastSixcharOfWebsite = ((String) value).substring(((String) value).length() - 10);
//			 System.out.println("actual last chars "+lastSixcharOfWebsite);
//			 Assert.assertTrue("Url is not starting with index.html ", expEndUrl == lastSixcharOfWebsite);
//		 }
//	}

//
//	@Then("Verify all {int} attributes should not be blank")
//	public void verify_all_attributes_should_not_be_blank(int noOfAttributes) 
//	{	
//		List<Map<String, Object>> books = response.body().jsonPath().getList("books");
////		int bookCount = response.body().jsonPath().getList("books").size();
//		for (Map<String, Object> book : books)			
//		{
//			Object eachBook = book.values();
//			System.out.println(eachBook);
//			if (!((String) eachBook).isEmpty()) {
//                System.out.println("Valid: " + eachBook);
//            } else {
//                System.out.println("Invalid (Blank Value)");
//            }
//		}
//		
//	}
//
//
//	@Then("verify date format {string}")
//	public void verify_date_format(String expDateFormat) {
//		
//		String actDateFormat = response.body().jsonPath().getString(jsonPathStr);
//		BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            StringBuilder jsonContent = new StringBuilder();
//	}
//		JSONObject jsonObject = new JSONObject(jsonContent.toString());
//
//        // Validate each attribute that may contain a date
//        for (String key : jsonObject.keySet()) {
//            String value = jsonObject.optString(key, "").trim();
//	}
//	}
	
	@Then("Validate that {string} publisher has only 2 books namely {string} and {string}")
	public void validate_that_publisher_has_only_2_books(String publisherName, String bookFirst, String bookSecond) {
		List<Map<String, Object>> books = response.body().jsonPath().getList("books");
		int  noOfPublishersBooks = 0;
		for (Map<String, Object> book : books)
		{
			if(book.get("publisher").equals(publisherName))
			{
				noOfPublishersBooks++;
				System.out.println("Book Name1 "+bookFirst);
			}
			
			else {
				continue;
			}
		}
		
				


	}
}
