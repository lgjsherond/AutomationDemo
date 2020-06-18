package StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    public WebDriver driver;

//    @Before()
//    public void setup(){
//        System.out.println("Setup Class");
//        WebDriverManager.chromedriver().setup();
////        WebDriverManager.chromiumdriver().setup();
////        driver = new EdgeDriver();
//        driver = new ChromeDriver();
//
//    }

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Browser is open");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on google search page");
        driver.navigate().to("https://google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("User enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("JacPLUS");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user navigate to search page")
    public void user_navigate_to_search_page() {
        System.out.println("User navigate to search page");
        System.out.println("You landed on "+driver.getTitle());
        driver.close();
        if(driver!= null)
            driver.quit();
    }

}
