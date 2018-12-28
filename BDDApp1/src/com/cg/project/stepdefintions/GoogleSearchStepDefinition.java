package com.cg.project.stepdefintions;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchStepDefinition {
    private WebDriver driver;

    
    @Given("^User is on Google HomePage$")
    public void user_is_on_Google_HomePage() throws Throwable {
        
    System.setProperty("webdriver.chrome.driver","C:\\BDD\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("https://www.google.com");
        
        
    }

    @When("^User search for 'Agile Methodology'$")
    public void user_search_for_Agile_Methodology() throws Throwable {
        
        WebElement searchTxt=driver.findElement(By.name("q"));
        searchTxt.sendKeys("Agile Methodology");
        searchTxt.submit();
        
    }

    @Then("^All links should display with 'Agile Methodology'$")
    public void all_links_should_display_with_Agile_Methodology() throws Throwable {
        
        String actualTitle = driver.getTitle();
        String expectedTitle="AgileMethodology-Google Search";
        Assert.assertEquals(expectedTitle, actualTitle);
        
        driver.close();
        
        
    }
}
    