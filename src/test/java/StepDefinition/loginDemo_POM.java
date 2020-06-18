package StepDefinition;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginDemo_POM {

//    private WebDriver driver=null;
//    loginPage login;
//
//    @Given("Chrome is open")
//    public void chrome_is_open() {
//        WebDriverManager.chromedriver().setup();
////        WebDriverManager.chromiumdriver().setup();
////        driver = new EdgeDriver();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//    }
//
//    @Given("user is on test login page")
//    public void user_is_on_test_login_page() {
//
//        driver.navigate().to("https://example.testproject.io/");
//    }
//
//
//    // Use "^" and "$" sign to make the regular expression work.
//    @When("^user is enters (.*) and (.*)$")
//    public void user_is_enters_username_and_password(String username,String password) {
//        login=new loginPage(driver);
//        login.enterUsername(username);
//        login.enterPassword(password);
//        login.clickLogin();
//
//    }
//
//    @Then("user is on home page")
//    public void user_is_on_home_page() {
//        System.out.println("I'm on the "+driver.getTitle());
//        login.checkLogoutDisplay();
////        driver.getPageSource().contains("Logout");
//        driver.close();
//    }

}
