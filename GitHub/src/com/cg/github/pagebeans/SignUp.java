package com.cg.github.pagebeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
    
    private final WebDriver driver;
    @FindBy(how=How.ID,id="login_field")
    private WebElement username;
    
    @FindBy(id="verify_email")
    private WebElement email;


    @FindBy(how=How.ID,id="password")
    private WebElement password;
    

    @FindBy(className="btn")
    private WebElement button;
    
    public SignUp(final WebDriver driver){
        
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how=How.XPATH,xpath="//*[@id=\"js-flash-container\"]/div/div")
    private WebElement actualErrorMessage;

    

    public String getUsername() {
        return username.getAttribute("value");
        
    }

    public void setUsername(String username) {
        this.username.sendKeys(username);
    }

    public String getPassword(){
        return password.getAttribute("value");
    }


    public void setPassword(String password){
        
    this.password.sendKeys(password);
    }

    public String getActualErrorMessage(){
        return actualErrorMessage.getText();
    }

    public void clickSignin(){
         button.submit();
    }
    
     public void checkEmail(final String emailAddress){
            this.email.sendKeys(emailAddress);
     }
    
    

}
