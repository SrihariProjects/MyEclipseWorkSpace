package practice;

import org.json.JSONObject;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class TestCookies {

	@Test
	void testCookie() {
		
		given()
		
		.when()
			.get("https://www.youtube.com/")
		.then()
			.cookie("GPS","1")
					
			.log().cookies();
	}
}
