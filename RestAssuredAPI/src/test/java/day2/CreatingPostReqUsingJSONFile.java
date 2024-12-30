package day2;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CreatingPostReqUsingJSONFile {

	String id;

	@Test(priority = 1)
	void testPOSTUsingExternalJsonFile() throws FileNotFoundException {
		
		File f = new File(".\\body.json"); // '.' represents current project in the path location
		
		FileReader fr = new FileReader(f);

		JSONTokener jt = new JSONTokener(fr);

		JSONObject data = new JSONObject(jt);

		id = given().contentType("application/json").body(data.toString())  //when we use JSON library then we need to use toString to convert from JSON format to string format

				.when().post("http://localhost:3000/students").jsonPath().getString("id");
	}

	@Test(priority = 2, dependsOnMethods = { "testPOSTUsingExternalJsonFile" })
	void deleteUser() {
		when().delete("http://localhost:3000/students/" + id)

				.then().statusCode(200).log().all();

	}
}
