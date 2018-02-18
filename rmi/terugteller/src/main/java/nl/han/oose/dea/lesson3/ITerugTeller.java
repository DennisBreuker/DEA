package nl.han.oose.dea.lesson3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITerugTeller extends Remote {
    void setValue(int value) throws RemoteException;
    int getValue() throws RemoteException;
    void decrement() throws RemoteException;
    void addCallbackListener(ICallback listener) throws RemoteException;
}
