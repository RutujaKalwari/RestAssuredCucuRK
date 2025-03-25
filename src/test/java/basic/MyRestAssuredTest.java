package basic;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyRestAssuredTest {

	public static void main(String[] args) {


		Response res = RestAssured.given().get("https://mvnrepositorfefdfsdsy.com/artifactssdsss/io.rest-assured");
		System.out.println("Output "+res.statusCode());
		
		Response res1 = RestAssured.given().get("https://www.google.co.in/");
		System.out.println("Output "+res1.statusCode());


	}

}
