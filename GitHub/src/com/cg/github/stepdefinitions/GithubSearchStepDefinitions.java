package com.cg.github.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubSearchStepDefinitions {
    
    private WebDriver driver;
    private LoginPage loginPage;
    
    @Before
    public void setUpStepEnv(){
        System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chromedriver.exe");
    }
  
    @Given("^User is on GitHub LoginPage$")
    public void user_is_on_GitHub_LoginPage() throws Throwable {
    	driver=new ChromeDriver();
        driver.get("https://github.com/login");
        
        loginPage=PageFactory.initElements(driver, LoginPage.class);

        
    }
    
  
    @When("^User enteres Invalid Username and invalid passsword$")
    public void user_enteres_Invalid_Username_and_invalid_passsword() throws Throwable {
    	 loginPage.setUsername("bayripravalikaa");
         loginPage.setPassword("Temp@");
         loginPage.clikSignIn();
         
    }
    
    @Then("^display'invalid User'$")
    public void display_invalid_User() throws Throwable {
    	String expectedErrorMessage="Incorrect username or password";
        Assert.assertEquals(expectedErrorMessage, loginPage.getActualErrorMessage());
        driver.close();
    }
    
    @When("^User enteres Valid Username and Valid passsword$")
    public void user_enteres_Valid_Username_and_Valid_passsword() throws Throwable {
    	 loginPage.setUsername("bayripravalika");
         loginPage.setPassword("Chitti9866@");
    }

    @Then("^open github$")
    public void open_github() throws Throwable {
    	  String actualTitle=driver.getTitle();
          String expectedTitle="bayripravalika";
          Assert.assertEquals(expectedTitle, actualTitle);
          driver.close();
    }

    @When("^User enteres Invalid Username and valid passsword$")
    public void user_enteres_Invalid_Username_and_valid_passsword() throws Throwable {
    	loginPage.setUsername("bayripravalikaa");
        loginPage.setPassword("Chitti9866@");
        loginPage.clikSignIn();
        
    }

    @When("^User enteres valid Username and invalid passsword$")
    public void user_enteres_valid_Username_and_invalid_passsword() throws Throwable {
    	loginPage.setUsername("bayripravalika");
        loginPage.setPassword("Tewmp@");
        loginPage.clikSignIn();
    }

   
}