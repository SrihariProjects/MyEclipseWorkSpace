package day3;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class LoggingDemo {
	
	@Test(priority=1)
	void testLogs() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
//			.log().all();
//			.log().body()
//			.log().cookies()
			.log().headers();
		
		
		
	}
}