package com.juaracoding.pages;

import com.juaracoding.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//input[@name='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement appLogo;

    public void formLogin(){
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        btnLogin.click();
    }

    // return getText
    public String getTxtAppLogo(){
        return appLogo.getText();
    }

}
