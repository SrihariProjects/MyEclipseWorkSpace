package day4;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ParsingJsonRespnseData {

	@Ignore
	@Test(priority = 1)
	void testJsonResponse() {

		given().contentType(ContentType.JSON).when().get("http://localhost:3000/store") // Adjust the endpoint if
																							// needed
				.then().statusCode(200).header("Content-Type", "application/json").log().body()
				.body("products[1].name", equalTo("Milk")) // Validate JSON path for "Milk"
				.log().all(); // Log the response
	}

	@Ignore
	@Test(priority = 2)
	void testWithAssertion() {
		Response res = given()
					.contentType(ContentType.JSON)
				.when()
					.get("http://localhost:3000/store");

		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.getHeader("Content-Type"), "application/json");
		
		String bookName=res.jsonPath().get("products[1].name").toString();
		System.out.println(bookName);
		Assert.assertEquals(bookName, "Milk");
	}
	
	@Test(priority = 3)
	void testParticularObject() {
	Response res=given()
				.contentType(ContentType.JSON)
			.when()
				.get("http://localhost:3000/store");
		//By using Json Object we can check 
	
		JSONObject jo=new JSONObject(res.asString());
		
		boolean status=false;
		for(int i=0; i<jo.getJSONArray("products").length(); i++) {
			String productName=jo.getJSONArray("products").getJSONObject(i).get("name").toString();
			System.out.println(productName);
			
			if(productName.equals("Milk")) {
				status=true;
				break;
			}
			
		}
		Assert.assertEquals(status, true);
		
		//validate total quantity
		double totalPrice = 0;
		for(int i=0; i<jo.getJSONArray("products").length();i++) {
			String quantity=jo.getJSONArray("products").getJSONObject(i).get("quantity").toString();
			
			totalPrice=+Double.parseDouble(quantity);
		}
		System.out.println(totalPrice);
		Assert.assertEquals(totalPrice, 20.0);
	}
	
}
