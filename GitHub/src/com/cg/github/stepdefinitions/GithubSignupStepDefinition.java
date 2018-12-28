package com.cg.github.stepdefinitions;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.SignUp;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubSignupStepDefinition {
    
    private WebDriver driver;
    private SignUp signup;

    
    @Before
    public void setUpStepEnv(){
          System.setProperty("webdriver.chrome.driver","C:\\BDD cucumber\\chromedriver.exe");
}
    
@Given("^User is on GitHub signUp Page$")

    public void user_is_on_GitHub_login_Page() throws Throwable {
         driver=new ChromeDriver();
         driver.get("https://github.com/join?source=experiment-header-dropdowns");
         signup=PageFactory.initElements(driver,SignUp.class);
   
}

@When("^User enter username and password less than (\\d+) characters$")
public void user_enter_username_and_password_less_than_characters(int arg1) throws Throwable {
    signup.setUsername("saichait");
    signup.setPassword("Cha");
    signup.clickSignin();

}

@Then("^' atleast (\\d+) characters are required' message should display$")
public void atleast_characters_are_required_message_should_display(int arg1) throws Throwable {
     String expectedErrorMessege="Incorrect Username or Password";
        Assert.assertEquals(expectedErrorMessege,signup.getActualErrorMessage());
        driver.close();
}

@When("^User enter valid username and password$")
public void user_enter_valid_username_and_password() throws Throwable {
    signup.setUsername("karthikraj555");
    signup.setPassword("Shivaraj@5");
    signup.clickSignin();
        
  
}

@Then("^user should succesfully create his GitHub account$")
public void user_should_succesfully_create_his_GitHub_account() throws Throwable {
     String actualTitle=driver.getTitle();
        String expectedTitle="karthikraj555";
        Assert.assertEquals(expectedTitle, actualTitle);
      driver.close();

}

@When("^User enter Invalid mailId$")
public void user_enter_Invalid_mailId() throws Throwable {
    signup.setUsername("karthikraj@@.com");
    signup.clickSignin();
   
}

@Then("^' Invalid Email Id' Message should display$")
public void invalid_Email_Id_Message_should_display() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

@When("^User enter valid mailId$")
public void user_enter_valid_mailId() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}



}
