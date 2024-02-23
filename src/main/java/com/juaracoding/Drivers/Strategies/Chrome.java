package com.juaracoding.Drivers.Strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy{

     @Override
    public WebDriver setStrategy(){
         String path = "C:\\mytools\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver",path);
         ChromeOptions options = new ChromeOptions();
         options.setExperimentalOption("useAutomationExtension", false);
         options.addArguments("--no-sanbox");
         return new ChromeDriver(options);
     }

}
