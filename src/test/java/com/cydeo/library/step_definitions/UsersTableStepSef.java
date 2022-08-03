//package com.cydeo.library.step_definitions;
//
//import com.cydeo.library.pages.UsersPage;
//import com.cydeo.library.utilities.BrowserUtils;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.WebElement;
//
//import java.util.List;
//import java.util.Locale;
//
//public class UsersTableStepSef {
//    UsersPage userspage=new UsersPage();
//
//
//    @Given("I click on {string} link")
//    public void i_click_on_link(String link) {
//
//        BrowserUtils.waitForVisibility(userspage.dashboardLink,10);
//
//        switch (link.toLowerCase()){
//            case "dashboard":
//                userspage.dashboardLink.click();
//                break;
//            case "users":
//                userspage.usersLink.click();
//                break;
//            case "books":
//                userspage.booksLink.click();
//                break;
//        }
//    }
//
//
//    @Then("table should have following column names:")
//    public void table_should_have_following_column_names(List<String> expectedTableHeader) {
//
//        List<String> actualTableHeader = BrowserUtils.getElementsText((List<WebElement>) userspage.elementThead);
//        Assert.assertEquals(expectedTableHeader,actualTableHeader);
//    }
//
//}
