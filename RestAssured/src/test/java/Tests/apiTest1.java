package Tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apiTest1 {
@Test	
public void test() {
	System.out.println("Test case");
}
	
@Test
public void getUsers() {
	RestAssured.baseURI="https://reqres.in/api";
	Response response= 
			given()
			.when()
			.get("users/2");
	
	response.then().statusCode(200);
			
	response.then().assertThat()
	.body("data.id", equalTo(2))
	.body("data.email",equalTo("janet.weaver@reqres.in"))
	.body("data.first_name", equalTo("Janet"));
}
	
}
