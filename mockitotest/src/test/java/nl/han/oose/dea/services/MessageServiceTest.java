package nl.han.oose.dea.services;

import org.junit.Assert;

import javax.ws.rs.core.Response;

public class MessageServiceTest {

    @org.junit.Test
    public void zeroShouldReturnHello() {
        MessageService service = new MessageService();
        Response response = service.getMessage(0);
        String actual = (String) response.getEntity();
        String expected = "Hello";
        Assert.assertEquals(actual, expected);
    }
}