package com.example.someprojects.helpDesk;

import com.example.someprojects.core.BaseSeleniumPage;
import com.example.someprojects.readProperties.ConfigProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//select[@name='queue']")
    private WebElement queueList;

    @FindBy(xpath = "//*[@id=\"id_queue\"]/option[2]")
    private WebElement queue;

    @FindBy(xpath = "//input[@id='id_title']")
    private WebElement shortProblemDescription;

    @FindBy(xpath = "//textarea[@id='id_body']")
    private WebElement problemDescription;

    @FindBy(xpath = "//select[@id='id_priority']")
    private WebElement priorityList;

    @FindBy(xpath = "//*[@id=\"id_priority\"]/option[2]")
    private WebElement priority;

    @FindBy(xpath = "//*[@id=\"id_due_date\"]")
    private WebElement dueDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")
    private WebElement dueDateSelector;

    @FindBy(xpath = "//*[@id=\"id_submitter_email\"]")
    private WebElement email;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-lg btn-block\"]")
    private WebElement sentTicket;

    public MainPage(){
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage createTicket(String shortProblemDescriptionValue, String problemDescriptionValue, String emailValue){
        queueList.click();
        queue.click();
        shortProblemDescription.sendKeys(shortProblemDescriptionValue);
        problemDescription.sendKeys(problemDescriptionValue);
        priorityList.click();
        priority.click();
        dueDate.click();
        dueDateSelector.click();
        email.sendKeys(emailValue);

        return this;

    }

    public TicketPage ticketPage(){
        sentTicket.click();

        return new TicketPage();
    }


}
