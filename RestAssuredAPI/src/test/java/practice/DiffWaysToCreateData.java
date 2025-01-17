package practice;


import org.json.JSONObject;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

public class DiffWaysToCreateData {

	String id;
	@Ignore
	@Test(priority = 1)
	public void usingHashMap() {
		HashMap data=new HashMap();
		data.put("name", "Srihari");
		data.put("age", 24);
		data.put("gender", "male");
		String courceArr[]= {"c","c++"};
		data.put("courses", courceArr);
		
		id=given()
			.contentType(ContentType.JSON)
			.body(data)
		
		.when()
			.post("http://localhost:3000/students")
			.jsonPath().getString("id");
		
			
	}
	
	@Test(priority = 2)
	void usingOrgJson() {
		
		JSONObject data=new JSONObject();
		data.put("name","ghos");
		data.put("age", 24);
		
		String courcesArr[]= {"C","Java"};
		data.put("Cources", "courcesArr");
		
		given()
			.contentType(ContentType.JSON)
			.body(data.toString())
		.when()
			.post("http://localhost:3000/students")
		
		.then()
			.statusCode(201)
			.body("name",equalTo("ghos"))
			.body("age",equalTo(24))
			.log().all();
	}
	
	
	@Test(priority=3)
	void usingPOJOClass() {
		
	}
	
	@Ignore
	@Test(priority=2, dependsOnMethods= {"usingHashMap"})
	void deleteData() {  
		given()
		
		.when()
			.delete("http://localhost:3000/students/"+id)
		
		.then()
			.statusCode(200)
			.log().all();
		
	}
}
