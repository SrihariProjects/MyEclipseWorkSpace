package practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.util.List;

public class TestBooksAPI {

	@Test
	public void test() throws Exception {
		Response res=given()
			.body("application/json")
		.when()
			.get("https://simple-books-api.glitch.me/books");
//		.then()
//			.body("[0].id", equalTo(1))
//			.log().all();
		
		
		JsonPath jp=new JsonPath(res.asString());
		
		List<String> names=jp.getList("name");
		for(String name:names) {
			System.out.println(name);
		}
	}
}
