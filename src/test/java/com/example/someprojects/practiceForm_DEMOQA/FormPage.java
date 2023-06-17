package com.example.someprojects.practiceForm_DEMOQA;

import com.example.someprojects.core.BaseSeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")
    private WebElement practiceFormBtn;

    public FormPage(){
        PageFactory.initElements(driver, this);
    }

    public PracticeFormPage practiceFormPage() throws InterruptedException {
        practiceFormBtn.click();
        Thread.sleep(2000);
        return new PracticeFormPage();
    }

}
