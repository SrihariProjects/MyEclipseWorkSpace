package day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;

public class CreatingPostReqDataWithJson {
	
	String id;
	//using org.json
	@Ignore
	@Test(priority = 1)
	void testPostusingJsonLibrery() {
		JSONObject data=new JSONObject();
		data.put("name", "Queen");
		data.put("age", 23);
		data.put("gender", "female");
		
		String GradesArr[]= {"PHP","python"};
		data.put("grades", GradesArr);
		
		id=given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("http://localhost:3000/students")
		.jsonPath().getString("id");
		
//		.then()
//		.statusCode(201)
//		.log().all();
	}
	
	@Ignore
	@Test(priority=2)
	void getUsers() {
		when()
		.get("http://localhost:3000/students")
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority = 3,dependsOnMethods = {"testPostusingJsonLibrery"})
	void deleteUser() {
		when()
		.delete("http://localhost:3000/students/"+id)
		
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
}
