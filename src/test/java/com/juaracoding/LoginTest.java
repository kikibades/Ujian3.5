package com.juaracoding;

import com.juaracoding.Drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    private LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testValidLogin(){
        loginPage.formLogin();
        Assert.assertEquals(loginPage.getTxtAppLogo(),"Swag Labs");
    }


//    private CartPage cartPage;
//
//    @BeforeClass
//    public void setUpCart() {
//        DriverSingleton.getInstance("chrome");
//        driver = DriverSingleton.getDriver();
//        String url = "https://www.saucedemo.com/cart.html";
//        driver.get(url);
//        cartPage = new CartPage();
//
//    }
//
//    @Test
//    public void testValidATC(){
//        cartPage.AddToCart();
//        Assert.assertEquals(cartPage.getTxtCartIcon(),"Sauce Labs Backpack");
//    }
//
//    @AfterClass
//    public void finishCart() {
//        DriverSingleton.delay(3);
//        DriverSingleton.closeObjectInstance();
//    }



}


