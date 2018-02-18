package nl.han.oose.dea.lesson3;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class TerugTeller implements ITerugTeller {
    private int value;
    List<ICallback> listeners = new ArrayList();

    public int getValue() throws RemoteException {
        return value;
    }

    public void setValue(int value) throws RemoteException {
        this.value = value;
    }

    public void decrement() throws RemoteException {
        --value;
        System.out.println("Value verlaagd naar " + value);
        if (value % 25 == 0) {
            for (ICallback listener : listeners) {
                listener.notifyChange(value);
            }
        }
    }

    public void addCallbackListener(ICallback listener) throws RemoteException {
        listeners.add(listener);
    }
}
