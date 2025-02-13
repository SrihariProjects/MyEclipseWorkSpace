package day7;

import org.testng.annotations.Test;
//import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

public class BearerTokenAuthentication {

	@Test(priority=1)
	void testBearerTokenAuth() {
		String bearerToken="You need to provide github tocken";

		given()
			.header("Authorization","Bearer"+bearerToken)

		.when()
			.get("https://github.com/SrihariProjects")
		.then()
			.statusCode(200)
			.log().all();
	}
}
