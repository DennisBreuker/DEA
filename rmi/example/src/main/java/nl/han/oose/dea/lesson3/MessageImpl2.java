package nl.han.oose.dea.lesson3;

import java.rmi.RemoteException;

public class MessageImpl2 implements Message {
    public String getMessage() throws RemoteException {
        return "Hello from impl 2";
    }
}
