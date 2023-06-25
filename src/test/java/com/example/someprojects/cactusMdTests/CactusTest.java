package com.example.someprojects.cactusMdTests;

import com.example.someprojects.core.BaseSeleniumTest;
import com.example.someprojects.helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;

public class CactusTest extends BaseSeleniumTest {

    @Test
    public void cactusTest() throws InterruptedException {

        SearchResultPage searchResultPage = new MainPage()
                .searchResultPage(TestValues.SEARCH_VALUE);

        Assert.assertTrue(searchResultPage.getSearchElement().contains(TestValues.SEARCH_VALUE));
        Thread.sleep(5000);

    }

}
