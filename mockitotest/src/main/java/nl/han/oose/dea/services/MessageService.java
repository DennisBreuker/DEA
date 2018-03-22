package nl.han.oose.dea.services;

import nl.han.oose.dea.dao.Message;
import nl.han.oose.dea.dao.MessageDao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class MessageService {
    @Inject
    private Message dao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/message")
    public Response getMessage(int id) {
        String message = dao.getMessage(id);
        return Response.ok(message).build();
    }
}
