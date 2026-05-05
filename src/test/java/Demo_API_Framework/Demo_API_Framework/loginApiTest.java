package Demo_API_Framework.Demo_API_Framework;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class loginApiTest {

	public static final String BASEURI = "http://64.227.160.186:8080";


	public void loginTest() {


		Response rs = given()
				.baseUri("http://64.227.160.186:8080")
		.header("Content-Type", "application/json")
		.body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}")

			.when()
			.post("/api/auth/login")
			.then()
			.statusCode(200)
			.log().all()
			.extract().response();
		
		Assert.assertEquals(rs.getStatusCode(), 200);
		System.out.println(rs.asPrettyString());

	}
}
