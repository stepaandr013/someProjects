package com.example.someprojects.core;

import org.openqa.selenium.WebDriver;

public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }

}
