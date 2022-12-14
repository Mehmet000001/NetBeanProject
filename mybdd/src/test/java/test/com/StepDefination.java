/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author suphi
 */
public class StepDefination {
      private static WebDriver driver;
    private String baseUrl="https://www.indeed.com";  
    @Given("^user is already on Home Page$")
public void user_is_already_on_Home_Page() throws Throwable {
     System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get(baseUrl);
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^title of Home Page is Indeed$")
public void title_of_Home_Page_is_Indeed() throws Throwable {
    Assert.assertEquals("Job Search | Indeed", driver.getTitle());
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^user enters data jobTitle and city$")
public void user_enters_data_jobTitle_and_city() throws Throwable {
        driver.findElement(By.xpath(".//*[@name='q']")).click();
    driver.findElement(By.xpath(".//*[@name='q']")).clear();
    driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("Java");
    driver.findElement(By.xpath(".//*[@name='l']")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"Chicago, IL");
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^user clicks on FindJobs button$")
public void user_clicks_on_FindJobs_button() throws Throwable {
    driver.findElement(By.xpath(".//*[@type='submit']")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^user is on SearchRsults Page$")
public void user_is_on_SearchRsults_Page() throws Throwable {
    Assert.assertTrue(driver.getTitle().contains("Java Jobs, Employment in Chicago"));
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
     driver.close();
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}
    
}
