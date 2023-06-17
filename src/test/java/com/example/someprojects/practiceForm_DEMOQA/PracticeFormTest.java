package com.example.someprojects.practiceForm_DEMOQA;

import com.example.someprojects.core.BaseSeleniumTest;
import com.example.someprojects.helpers.TestValues;
import org.junit.Test;

public class PracticeFormTest extends BaseSeleniumTest {

    @Test
    public void checkForm() throws InterruptedException {

        PracticeFormPage practiceFormPage = new MainPage()
                .openFormPage()
                .practiceFormPage()
                .sentForm(TestValues.FIRST_NAME, TestValues.LAST_NAME, TestValues.EMAIL, TestValues.MSISDN,
                        TestValues.ADDRESS);

    }

}
