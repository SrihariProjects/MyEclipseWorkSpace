package day2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateingPostReqDataUsingPOJO {
	String id;
	//Post request body using POJO class
	@Test(priority=1)
	void testPostUsingPOJO() {
	POJO_PostRequest data=new POJO_PostRequest();
	data.setName("Srihari");
	data.setAge(24);
	data.setGender("male");
	String courcesArr[]= {"Java","Python"};
	data.setCources(courcesArr);
	
	id=given()
	.contentType("application/json")
	.body(data)   //tostring required for only json library
	
	.when()
	.post("http://localhost:3000/students")
	.jsonPath().getString("id");
	
	}
	
	@Test(priority = 2)
	void deleteUser() {
		given()
		
		.when()
		.delete("http://localhost:3000/students/"+id)
		
		.then()
		.statusCode(200);
	}
}
