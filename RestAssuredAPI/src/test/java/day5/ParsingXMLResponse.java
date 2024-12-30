package day5;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingXMLResponse {
	@Test(priority=1)
	void testXMLResponse() {
		
		//Approrch1
		given()
		
		
		
		.when()
			.get("https://www.w3schools.com/xml/simple.xml")
			
		.then()
			.statusCode(200)
			.header("Content-Type", "text/xml")
			.body("breakfast_menu.food[0].calories",equalTo("650"))
			.body("breakfast_menu.food[4].description", equalTo("Two eggs, bacon or sausage, toast, and our ever-popular hash browns"))
			.log().all();
		
	}
	
	@Test(priority=2)
	void testXMLResponse2() {
		
		//Approch2
		Response res=given()
				
				.when()
				.get("https://www.w3schools.com/xml/simple.xml");
				
			Assert.assertEquals(res.getStatusCode(), 200);
			Assert.assertEquals(res.header("Content-Type"), ("text/xml"));
			
//			String calorie=res.xmlPath().get("breakfast_menu.food[0].calorie").toString();
			
//			System.out.println("Caleries:"+calorie);
//			Assert.assertEquals(Double.parseDouble(calorie), "650");
			
			String description=res.xmlPath().get("breakfast_menu.food[4].description").toString();
			Assert.assertEquals(description, "Two eggs, bacon or sausage, toast, and our ever-popular hash browns");
			
	}
	
	@Test(priority=3)
	void testXMLResponce3() {
		
		Response res=
				given()
				
				.when()
					.get("https://www.w3schools.com/xml/simple.xml");
		
			XmlPath xmlobj=new XmlPath(res.asString()); //if you want to convert response into string then use asString() method
			List<String> foodList  =  xmlobj.getList("breakfast_menu.food");
//			System.out.println(foodList);
			
			Assert.assertEquals(foodList.size(), 5);
			System.out.println(foodList.size());
			
			//verify food name from the food 
			
			List<String> foodName=xmlobj.getList("breakfast_menu.food.name");
				
			boolean status=false;
			for(String name:foodName) {
				
				System.out.println("Food names are: "+name);
				if(foodName.equals("French Toast")) {
					status=true;
					break;
				}
			}
			
			Assert.assertEquals(status,false);
	}

}
