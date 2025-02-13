package day7;

import org.testng.annotations.Test;
//import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;


public class Oauth1 {
	
	//to test this we don't have any API's so just to get knowledge
	void testOauth1Authentication() {
		
		given()
			.auth().oauth("consumerKey", "consumerSecrat", "accessToken", "tokenSecrat")
			
		.when()
			.get("URL")
		.then()
			.statusCode(200)
			.log().all();
	}
}
