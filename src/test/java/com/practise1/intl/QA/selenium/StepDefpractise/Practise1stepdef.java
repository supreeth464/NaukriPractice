package com.practise1.intl.QA.selenium.StepDefpractise;
import com.practise1.intl.QA.selenium.Hooks.hooks;
import com.practise1.intl.QA.selenium.Pom.practicePage;
import com.practise1.intl.QA.selenium.utils.WaitUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.practise1.intl.QA.selenium.utils.JsonReader.getTestData;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import static org.junit.Assert.assertEquals;

public class Practise1stepdef {
    WebDriver driver;
    static Logger log = Logger.getLogger(Practise1stepdef.class);
    practicePage loginPage;
    public Practise1stepdef() {
        this.driver = hooks.getDriver();
        loginPage = new practicePage(driver);
    }
    @Given("the user should land on to the web application")
    public void the_user_should_land_on_to_the_web_application() {
        log.info("the user should land on to the web application");
        WaitUtils.waitForTitleContains(driver, "Jobseeker's", 10);
        String LoginPageTitle = getTestData("LoginPageTitle");
        assertEquals("Page title mismatch: User is not on the expected login page",loginPage.getPageTitle(), LoginPageTitle);
    }
    @When("the user enter user name and password")
    public void the_user_enter_user_name_and_password() {
        log.info("the user enter user name and password");
        String username = getTestData("username");
        String password = getTestData("password");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        log.info("the user click on login button");
        loginPage.clickLogin();
    }
    @Then("verify to ensure the user lands on to the web application")
    public void verify_to_ensure_the_user_lands_on_to_the_web_application() {
        log.info("verify to ensure the user lands on to the web application");
        String DashboardPageTitle = getTestData("DashboardPageTitle");
        WaitUtils.waitForTitleContains(driver, "Mynaukri", 10);
        assertEquals("Page title mismatch: User is not on the expected login page",loginPage.getPageTitle(), DashboardPageTitle);
    }

    @Then("i click on view profile page")
    public void i_click_on_view_profile_page() {
        loginPage.clickViewProfile();
    }
    @Then("i click on edit resume headline")
    public void i_click_on_edit_resume_headline() {
        loginPage.clickEditResumeHeadline();
    }
    @Then("i click on save button")
    public void i_click_on_save_button() {
        loginPage.clickSaveButton();
    }

}
