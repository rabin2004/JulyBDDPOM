package step_definition;

import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginSuccessPage;

public class LoginFunctionalityTest extends Main{
	HomePage hp = new HomePage();
	LoginSuccessPage lsp = new LoginSuccessPage();
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
	    Assert.assertEquals(hp.captureHomePageUrl(), prop.getProperty("HomePageUrl"));
	}

	@When("user enters valid {string} and valid {string}")
	public void user_enters_valid_username_and_valid_password(String username, String password) {
		hp.enterUserName(username);
		hp.enterPassword(password);
	}

	@And("click submit button")
	public void click_submit_button() {
		hp.clickSubmitBtn();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		Assert.assertEquals(lsp.captureLoginSuccessMsg(), prop.getProperty("ExpectedLoginSuccessMsg"));
		Assert.assertEquals(lsp.captureLoginSuccessPageTitle(), prop.getProperty("ExpectedPageTitle"));
	}
	
	@When ("user enters invalid {string} and invalid {string}")
	public void user_enters_invalid_usernam_and_invalid_password(String username, String password) {
		hp.enterUserName(username);
		hp.enterPassword(password);
	}
	
	@Then ("user should not be able to login")
	public void user_should_not_be_able_to_login() {
		Assert.assertEquals(hp.captureLoginErrorMsg(), prop.getProperty("ExpectedLoginErrorMsg"));
	}
}
