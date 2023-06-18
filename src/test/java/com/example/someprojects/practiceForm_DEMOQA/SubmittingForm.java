package com.example.someprojects.practiceForm_DEMOQA;

import com.example.someprojects.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmittingForm extends BaseSeleniumPage {

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement studentName;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement studentEmail;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[3]/td[2]")
    private WebElement gender;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[4]/td[2]")
    private WebElement msisdn;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[5]/td[2]")
    private WebElement dateOfBirth;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[7]/td[2]")
    private WebElement hobby;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[9]/td[2]")
    private WebElement address;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[10]/td[2]")
    private WebElement stateCity;


    public SubmittingForm() {
        PageFactory.initElements(driver, this);
    }

    public String getStudentName() {
        return studentName.getText();
    }

    public String getStudentEmail() {
        return studentEmail.getText();
    }

    public String getGender() {
        return gender.getText();
    }

    public String getMsisdn() {
        return msisdn.getText();
    }

    public String getDateOfBirth() {
        return dateOfBirth.getText();
    }

    public String getHobby() {
        return hobby.getText();
    }

    public String getAddress() {
        return address.getText();
    }

    public String getStateCity() {
        return stateCity.getText();
    }

}
