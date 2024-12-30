package day3;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class HeadersDemo {
	
	//how to verify the headers
	@Test(priority=1)
	void testHeaders() {
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1")
			.and()  //and() is optional
			.header("Content-Encoding", "gzip")
			.and()
			.header("Server", "gws")
			
			.log().all();
			
			
	}
	
	//how to capture info from headers
	@Test(priority=2)
	void getHeaders()
	{
		Response res=given()
		
		.when()
			.get("https://www.google.com/");
		
		//get single header info
		String headerValue=res.getHeader("Content-Type");
		System.out.println("The value of content Type Header is:"+headerValue);
		
	}
	
	//how to get all headers info
	@Test(priority = 3)
	void getAllHeaders() {
		Response res=given()
				
				.when()
					.get("https://www.google.com/");
				
		Headers myheaders=res.getHeaders();
		
		for(Header hd:myheaders) {
			System.out.println(hd.getName()+"    "+hd.getValue());
		}
		//we can use log().headers()
	}
}
