package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends BasePage{
    @FindBy(tagName = "th")
    public WebElement elementThead;

    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
