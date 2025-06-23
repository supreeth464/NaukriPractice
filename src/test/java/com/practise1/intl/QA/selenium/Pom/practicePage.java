package com.practise1.intl.QA.selenium.Pom;

import com.practise1.intl.QA.selenium.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicePage {
    WebDriver driver;

    // Constructor
    public practicePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements
    }

    @FindBy(id = "usernameField")
    WebElement txtUsername;

    @FindBy(id = "passwordField")
    WebElement txtPassword;

    @FindBy(xpath = "//button[contains(text(), \"Login\")][1]")
    WebElement btnLogin;

    @FindBy(xpath = "//div[@class=\"view-profile-wrapper\"]//a")
    WebElement viewProfile;
    @FindBy(xpath = "//div[@id=\"lazyResumeHead\"]//span[2]")
    WebElement editResumeHeadline;
    @FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
    WebElement saveButton;

    public void enterUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        WaitUtils.waitForElementVisible(driver, btnLogin, 10);
        btnLogin.click();
    }
    public void clickEditResumeHeadline() {
        WaitUtils.waitForElementVisible(driver, editResumeHeadline, 10);
        editResumeHeadline.click();
    }
    public void clickSaveButton() {
        WaitUtils.waitForElementVisible(driver, saveButton, 10);
        saveButton.click();
    }
    public String getPageTitle() {
        return driver.getTitle();
    }
    public void loginToApplication(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
    public void clickViewProfile(){
        WaitUtils.waitForElementVisible(driver,viewProfile, 10 );
        viewProfile.click();
    }
}
