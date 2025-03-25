package basic;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MySampleGoogleTest {

	public static void main(String[] args) {


		Response res = RestAssured.given().get("https://www.google.co.in/");
		System.out.println("Output "+res.statusCode());

	}

}
