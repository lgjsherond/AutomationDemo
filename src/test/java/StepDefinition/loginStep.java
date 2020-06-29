package StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class loginStep {


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("I'm calling the given user login");
    }

    @When("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("user enter username and password");
    }

    @And("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
    }

    @Then("user is navigate to home page")
    public void user_is_navigate_to_home_page() {
        System.out.println("user is navigate to home page");
    }

}
