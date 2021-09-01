package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^User is in landing page$")
	public void login_page() throws Throwable
	{
		System.out.println("Login page");
	}
	 
	@When("User enter correct credendials {string} and {string}")
	public void user_enter_correct_credendials_and(String string, String string2) throws Throwable {
		System.out.println(string + string2);
	}

	@When("Click on Login")
	public void click_on_login() throws Throwable {
		System.out.println("Clicked Login");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page");
	}

	@Then("Home page components are displayed")
	public void home_page_components_are_displayed() {
		System.out.println("Components");
	}

}
