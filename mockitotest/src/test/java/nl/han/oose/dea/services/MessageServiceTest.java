package nl.han.oose.dea.services;

import nl.han.oose.dea.dao.Message;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.ws.rs.core.Response;
import java.util.ArrayList;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {
    @InjectMocks
    private MessageService service;

    @Mock
    private Message dao;

    @Test
    public void zeroShouldReturnHello() {
        // "program" the mock
        when(dao.getMessage(0)).thenReturn("Hello");

        // execute method to be tested
        Response response = service.getMessage(0);

        // Note: these examples do not make much sense here,
        // it is just to show what is possible
        // verify how many times methods have been called
        verify(dao, times(1)).getMessage(0);
        verify(dao, times(0)).getMessage(42);

        // do the "normal" assertion, check if result is as expected
        String actual = (String) response.getEntity();
        String expected = "Hello";
        Assert.assertEquals(actual, expected);
    }

        @Test(expected=IllegalArgumentException.class)
        public void negativeShouldThrow() {
            // "program" the mock
            when(dao.getMessage(-1)).thenThrow(new IllegalArgumentException());

            // execute method to be tested
            Response response = service.getMessage(-1);
    }
}