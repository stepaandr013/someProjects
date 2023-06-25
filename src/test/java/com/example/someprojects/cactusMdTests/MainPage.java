package com.example.someprojects.cactusMdTests;

import com.example.someprojects.core.BaseSeleniumPage;
import com.example.someprojects.readProperties.ConfigProvider;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "/html/body/section[1]/div/div/div/div/div/div/div[1]/input")
    private WebElement searchInput;


    public MainPage(){
        driver.get(ConfigProvider.URL_CACTUS);
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage searchResultPage(String search){
        searchInput.sendKeys(search, Keys.ENTER);

        return new SearchResultPage();
    }

}
