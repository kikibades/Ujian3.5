package com.juaracoding.pages;

import com.juaracoding.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement CheckoutBtn;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    private WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    private WebElement LastName;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    private WebElement PostCode;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"finish\"]")
    private WebElement finishBtn;

    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    private WebElement bckHomeBtn;



    public void CheckoutProduct(){
        CheckoutBtn.click();
        FirstName.sendKeys("Mochamad");
        LastName.sendKeys("Rifki Bayu Destara");
        PostCode.sendKeys("16436");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        continueBtn.click();
        finishBtn.click();
        bckHomeBtn.click();
    }

}
