package com.example.someprojects.practiceForm_DEMOQA;

import com.example.someprojects.core.BaseSeleniumPage;
import com.example.someprojects.readProperties.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
    private WebElement forms;

    public MainPage(){
        driver.get(ConfigProvider.URL_DEMOQA);
        PageFactory.initElements(driver, this);
    }

    public FormPage openFormPage() throws InterruptedException {
        forms.click();
        Thread.sleep(1000);

        return new FormPage();
    }

}
