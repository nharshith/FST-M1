package activities;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity1 {
	String baseUri = "https://petstore.swagger.io/v2/pet";

	@Test(priority = 1)
	public void postRequestTest() {
		String methodBody = """
				{
				"id": 77232,
				"name": "Riley",
				"status": "alive"
				}
				""";

		Response response = 
				given().contentType(ContentType.JSON).body(methodBody)
				.when().post(baseUri);
				
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}
	
	@Test(priority = 2)
	public void getRequestTest() {		
		Response response = given()
				.baseUri(baseUri)
				.when().pathParam("petId", 77232)
				.get("/{petId}");
				
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}
	
	@Test(priority = 3)
	public void deleteRequestTest() {		
		Response response = given()
							.baseUri(baseUri)
							.when().pathParam("petId",77232)
							.delete("/{petId}");

		response.then().statusCode(200);
		response.then().body("message",equalTo("77232"));
	}
}
