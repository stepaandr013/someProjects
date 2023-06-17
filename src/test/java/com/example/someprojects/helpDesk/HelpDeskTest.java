package com.example.someprojects.helpDesk;

import com.example.someprojects.core.BaseSeleniumTest;
import com.example.someprojects.helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;

public class HelpDeskTest extends BaseSeleniumTest {

    @Test
    public void checkTicket(){


        TicketPage ticketPage = new MainPage()
                .createTicket(TestValues.SHORT_PROBLEM_DESCRIPTION, TestValues.PROBLEM_DESCRIPTION, TestValues.EMAIL)
                .ticketPage();

        Assert.assertTrue(ticketPage.getTitle().contains(TestValues.SHORT_PROBLEM_DESCRIPTION));
        Assert.assertEquals(ticketPage.getDescription(), TestValues.PROBLEM_DESCRIPTION);
        Assert.assertEquals(ticketPage.getEmail(), TestValues.EMAIL);
    }

}
