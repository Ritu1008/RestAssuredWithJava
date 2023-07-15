package github;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRepo {

	@Test
	public void test1() {
		
		RestAssured.baseURI = "https://api.github.com/repos/Ritu1008/RestAssuredDemo";
		
        RequestSpecification request = RestAssured.given();
		
		Response response = request.auth().oauth2("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")
				.delete();
		
		System.out.println("Response code is " + response.statusCode());
		Assert.assertEquals(response.statusCode(), 204);
}
}
