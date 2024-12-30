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

import java.io.File;
import java.util.List;

import javax.mail.Multipart;

import org.json.JSONArray;
import org.json.JSONObject;

public class FileUploadAndDownload {

	@Test(priority = 1)
	void singleFileUpload() {

		File myfile = new File("\"E:\\Bestha Srihari_Resume_New.docx\"");

		given().multiPart(myfile).contentType("multipart/form-data").when().post("") // need to download
																						// file-upload-RestAPI file and
																						// run it in CMD and give the
																						// URL

				.then().statusCode(200).body("fileName", equalTo("Test1.txt"));

	}

	void multifileUpload() {

		File myfile = new File("\"E:\\Bestha Srihari_Resume_New.docx\"");
		File myfile2 = new File("\"E:\\Bestha Srihari_Resume_New.docx\"");

		given().multiPart(myfile).multiPart(myfile2).contentType("multipart/form-data")

				.when().post()

				.then().statusCode(200).body("[0].fileName", equalTo("Test1.txt"))
				.body("[1].fileName", equalTo("Test2.txt")).log().all();

	}

	@Test(priority = 3)
	void multifileUpload2() {

		File myfile = new File("\"E:\\Bestha Srihari_Resume_New.docx\"");
		File myfile2 = new File("\"E:\\Bestha Srihari_Resume_New.docx\"");

//		String filearr[] = {"myfile","myfile2"};  //won't work for every API
		
		given()
		.multiPart(myfile)
		.multiPart(myfile2)
		.contentType("multipart/form-data")

				.when()
					.post()

				.then().statusCode(200).body("[0].fileName", equalTo("Test1.txt"))
				.body("[1].fileName", equalTo("Test2.txt")).log().all();

	}
	
	@Test(priority=4)
	void fileDownload() {
		given()
		
		.when()
			.get()  //specify the download file url 
			
		.then()
			.statusCode(200)
			.log().all();
	}

}
