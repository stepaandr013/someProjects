package com.example.someprojects.practiceForm_DEMOQA;

import com.example.someprojects.core.BaseSeleniumPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends BaseSeleniumPage {

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    private WebElement gender;

    @FindBy(id = "userNumber")
    private WebElement msisdn;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateBirthField;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
    private WebElement dateBirthMonthField;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[9]")
    private WebElement dateBirthMonthChoose;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")
    private WebElement dateBirthYearField;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[103]")
    private WebElement dateBirthYearChoose;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[6]")
    private WebElement dateBirthChoose;

    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div")
    private WebElement subject;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]/label")
    private WebElement hobby;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(xpath = "//*[@id=\"state\"]/div/div[1]")
    private WebElement selectStateList;

    @FindBy(xpath = "//*[@id=\"city\"]/div/div[1]")
    private WebElement selectCity;

    @FindBy(id = "submit")
    private WebElement submitBtn;


    public PracticeFormPage(){
        PageFactory.initElements(driver, this);
    }

    public SubmittingForm sentForm(String firstNameValue, String lastNameValue, String emailValue, String msisdnValue,
                                     String currentAddressValue) throws InterruptedException {

        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        email.sendKeys(emailValue);
        gender.click();
        msisdn.sendKeys(msisdnValue);
        dateBirthField.click();
        dateBirthMonthField.click();
        dateBirthMonthChoose.click();
        dateBirthYearField.click();
        dateBirthYearChoose.click();
        dateBirthChoose.click();
        hobby.click();
        currentAddress.sendKeys(currentAddressValue);
        submitBtn.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        submitBtn.click();
        Thread.sleep(2000);


        return new SubmittingForm();
    }

}
