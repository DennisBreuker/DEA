package nl.han.oose.dea.services;

import org.junit.Assert;

import javax.ws.rs.core.Response;

public class MessageServiceTest {

    @org.junit.Test
    public void shouldReturnHello() {
        MessageService service = new MessageService();
        Response result = service.getMessage();
        Assert.assertEquals(Response.Status.OK.getStatusCode(), result.getStatus());
    }
}