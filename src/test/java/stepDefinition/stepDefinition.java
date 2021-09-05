package stepDefinition;

import static io.restassured.RestAssured.given;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import variables.AddPlaceObject;
import static org.junit.Assert.*;


@RunWith(Cucumber.class)
public class stepDefinition {

	AddPlaceObject place;
	Response addPlaceresponse;
	
	static RequestSpecification req = new RequestSpecBuilder().setContentType(ContentType.JSON)
			.setBaseUri("https://rahulshettyacademy.com").build();

	static ResponseSpecification res = new ResponseSpecBuilder().expectContentType(ContentType.JSON)
			.expectStatusCode(200).build();

	@Given("Add Place Payload")
	public void add_place_payload() {

		place = given().header("content-type", "application/json").expect().defaultParser(Parser.JSON).when()
				.get("https://345da1ba-184e-4a5f-a782-800c873a9c6e.mock.pstmn.io/getMyPlace").then().assertThat()
				.statusCode(200).extract().as(AddPlaceObject.class);

	}

	@When("User calls {string} API with POST HTTP request")
	public void user_calls_api_with_post_http_request(String string) {

		addPlaceresponse = given().spec(req).body(place).when().post("/maps/api/place/add/json").then().spec(res)
				.extract().response();

	}

	@Then("API call is success with status code {int}")
	public void api_call_is_success_with_status_code(Integer int1) {
		
		assertEquals(addPlaceresponse.getStatusCode(), 200);
		
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
		
		String response = addPlaceresponse.asString();
		JsonPath js = new JsonPath(response);
		
		String actualvalue = js.get(key);
		assertEquals(value, actualvalue);
	}

}
