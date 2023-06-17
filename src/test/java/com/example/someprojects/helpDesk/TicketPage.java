package com.example.someprojects.helpDesk;

import com.example.someprojects.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/table/caption")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/table/tbody/tr[3]/td")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/table/tbody/tr[6]/td")
    private WebElement description;


    public TicketPage(){
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return title.getText();
    }

    public String getEmail() {
        return email.getText();
    }

    public String getDescription() {
        return description.getText();
    }
}
