package com.example.someprojects.practiceForm_DEMOQA;

import com.example.someprojects.core.BaseSeleniumTest;
import com.example.someprojects.helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;

public class PracticeFormTest extends BaseSeleniumTest {

    @Test
    public void checkForm() throws InterruptedException {

        SubmittingForm submittingForm = new MainPage()
                .openFormPage()
                .practiceFormPage()
                .sentForm(TestValues.FIRST_NAME, TestValues.LAST_NAME, TestValues.EMAIL, TestValues.MSISDN,
                        TestValues.ADDRESS);

        Assert.assertTrue(submittingForm.getStudentName().contains(TestValues.FIRST_NAME));
        Assert.assertTrue(submittingForm.getStudentName().contains(TestValues.LAST_NAME));
        Assert.assertEquals(submittingForm.getStudentEmail(), TestValues.EMAIL);
        Assert.assertFalse(submittingForm.getGender().isEmpty());
        Assert.assertEquals(submittingForm.getMsisdn(), TestValues.MSISDN);
        Assert.assertFalse(submittingForm.getDateOfBirth().isEmpty());
        Assert.assertFalse(submittingForm.getHobby().isEmpty());
        Assert.assertEquals(submittingForm.getAddress(), TestValues.ADDRESS);
        Assert.assertTrue(submittingForm.getStateCity().isEmpty());


    }

}
