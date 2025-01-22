package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity2 {
	String baseUri = "https://petstore.swagger.io/v2/user";

	@Test(priority = 1)
	public void postRequestTest() throws IOException {
		FileInputStream input = new FileInputStream("src/main/resources/userInfo.json");

		Response response = given()
				.contentType(ContentType.JSON).body(input)
				.when().post(baseUri);		
		input.close();
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("1254"));
	}

	@Test(priority = 2)
	public void getRequestTest() throws IOException {
		File responseOut = new File("output.json");
		FileOutputStream outputStream = new FileOutputStream(responseOut);
		Response response = given()
				.baseUri(baseUri)
				.contentType(ContentType.JSON)
				.when().pathParam("username", "user2")
				.get("/{username}");
				
		response.then().body("id", equalTo(1254));
		response.then().body("username", equalTo("user2"));
		response.then().body("firstName", equalTo("Justin"));
		response.then().body("lastName", equalTo("Case"));
		response.then().body("email", equalTo("justincase@mail.com"));
		response.then().body("password", equalTo("password123"));
		response.then().body("phone", equalTo("9812763450"));
		
		outputStream.write(response.asByteArray());
		outputStream.close();
	}

	@Test(priority = 3)
	public void deleteRequestTest() {
		Response response = given()
				.baseUri(baseUri)
				.when().pathParam("username", "user2")
				.delete("/{username}");
		response.then().statusCode(200);
		response.then().body("message",equalTo("user2"));
	}
}
