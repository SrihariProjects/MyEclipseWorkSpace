package day7;

import org.testng.annotations.Test;
//import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class Authentications {

	@Test(priority=1)
	void testBasicAuthentication() {
		given()
			.auth().basic("postman", "password") //using auth() we can pass any authentication
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated",equalTo(true))
			.log().all();
	}
	
	@Test(priority = 2)
	void testDigestAuthentication() {
		given()
			.auth().digest("postman", "password") //using auth() we can pass any authentication
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated",equalTo(true))
			.log().all();
	}
	
	@Test(priority = 3)
	void testPreemptiveAuthentication() {
		given()
			.auth().digest("postman", "password") //using auth() we can pass any authentication
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated",equalTo(true))
			.log().all();
	}
	
}
