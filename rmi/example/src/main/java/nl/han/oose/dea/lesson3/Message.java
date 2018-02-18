package nl.han.oose.dea.lesson3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    String getMessage() throws RemoteException;
}
