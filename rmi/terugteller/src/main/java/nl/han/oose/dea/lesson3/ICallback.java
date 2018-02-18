package nl.han.oose.dea.lesson3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICallback extends Remote {
    void notifyChange(int value) throws RemoteException;
}
