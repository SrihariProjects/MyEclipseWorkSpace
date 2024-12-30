package day2;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
/*
 Different ways to create POST request body
1)Hashmap
2)using org.json
3)using POJO(plain old Java Object)
4)using external json file
 */
public class DiffWaysToCreatePostRequestBody {

	String id;
	//POST request using HashMap
	@Test(priority = 1)
	void testPostUsingHashmap() {
		
	HashMap data=new HashMap();
	data.put("name","King");
	data.put("age", 24);
	data.put("gender", "male");
	
	String GradesArr[]= {"C","c++"};
	
	data.put("grades", GradesArr);
	
	
	id=given()
//	given()
	.contentType("application/json")
	.body(data)
	
	.when()
	.post("http://localhost:3000/students")
	.jsonPath().getString("id");
	
//	.then()
//	.statusCode(201)
//	.body("name",equalTo("King"))
//	.body("age",equalTo(24))
//	.body("gender",equalTo("male"))
//	.body("grades[0]", equalTo("C"))
//	.body("grades[1]", equalTo("c++"))
//	.header("Content-Type", "application/json")
//	.log().all();
	}
	
	//deleting student record
	@Test(priority = 2)
	void testDelete() {
		given()
		
		.when()
		.delete("http://localhost:3000/students/"+id) 
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	
	
}
