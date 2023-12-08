package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdefLogin extends BaseClass {

	@Given("I enter {string} using {string} {string}")
	public void i_enter_using(String url, String username, String password) {
		driver.get(url);
		loginPage.enterEmailID(username);
		loginPage.enterPassword(password);
	}

	@When("I click on Signin button")
	public void i_click_on_signin_button() {
		loginPage.clickOnSignIn();
	}

	@Then("I am able to see welcome title {string}")
	public void i_am_able_to_see_welcome_title(String Title) {
		loginPage.see_Welcome_Username(Title);
		//driver.quit();
	}
}
