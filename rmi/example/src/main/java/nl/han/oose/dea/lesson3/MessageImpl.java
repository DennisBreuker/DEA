package nl.han.oose.dea.lesson3;

import java.rmi.RemoteException;

public class MessageImpl implements Message {
    public String getMessage() throws RemoteException {
        return "Hello, world";
    }
}
