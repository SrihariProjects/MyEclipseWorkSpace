package day3;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

public class CookiesDemo {
	
	@Ignore
	@Test(priority=1)
	void testCookies() {
		given()
		
		.when()
			.get("https://www.google.com/")
		.then()
			.cookie("AEC","AZ6Zc-XElygjXWvdmlTT7_x3teYxCzrPynqmfCHXimYby4yn0jQoME-4wl0")
			.log().all();
	}
	
	@Test(priority=2)
	void getCookiesInfo() {
		Response res=given()
		
		.when()
		.get("https://www.google.com/");
		
		//getsingle cookie responce
//		String cookie_value=res.getCookie("AEC");
//		System.out.println("Value of Cookie is====>"+cookie_value);
		
		//get all cookies info
		Map<String, String> cookies_values=res.getCookies();
		
//		System.out.println(cookies_values.keySet()); //it will return all cookies names
		for(String k:cookies_values.keySet()) {
			String cookie_value=res.getCookie(k);
			System.out.println(k+": "+cookie_value);
		}
	}
}
