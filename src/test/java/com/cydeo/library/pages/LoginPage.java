package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//qa2_url=https://library2.cydeo.com/
public class LoginPage {

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement signinBtn;

    // No page elements added

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
