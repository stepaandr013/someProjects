package com.example.someprojects.cactusMdTests;

import com.example.someprojects.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id=\"catalog-items-cnt\"]/div[1]/div/h1")
    private WebElement searchElement;

    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }

    public String getSearchElement(){
        return searchElement.getText();
    }

}
