package practice;

import org.json.JSONObject;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class PathAndQueryParameters {
	
	
	//https://reqres.in/api/users?page=2&id=5
	@Test(priority=1)
	void testQueryAndPathParameters() {
		
		given()
			.pathParam("mypath", "users")
			.queryParam("page", 2)
			.queryParam("id", 5)
		.when()
			.get("https://reqres.in/api/{mypath}")
		.then()
			.log().all();
		
		
	}
}
