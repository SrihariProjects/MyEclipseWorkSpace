package day6;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class JSONSchemaValidations {
	
	@Test(priority=1)
	void jsonschemavalidation() {
		given()
		
		.when()
			.get("http://localhost:3000/store");
//		.then()
//			.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("storeJsonSchema.json"));
		
		
	}
}