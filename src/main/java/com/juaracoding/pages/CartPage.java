package com.juaracoding.pages;

import com.juaracoding.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement CartIcon;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    private WebElement atcProduct;

    //@FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    //private WebElement rmvBtn;

    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    private WebElement productValidation;

    public void AddToCart(){
        atcProduct.click();
        CartIcon.click();
    }

    public String getTxtCartIcon(){
        return productValidation.getText();
    }

}
