package nl.han.oose.dea.lesson3;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TerugTellerClient implements ICallback, Serializable {

    public TerugTellerClient() {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);

            ITerugTeller stub = (ITerugTeller) registry.lookup("terugteller");
            stub.addCallbackListener(this);
            stub.setValue(200);
            for (int i=0; i<100; i++) {
                stub.decrement();
            }
        } catch (Exception e) {
            System.err.println("Er ging iets mis in de Client");
            e.printStackTrace();
        }
    }

    public void notifyChange(int value) throws RemoteException {
        System.out.println("Callback: value is " + value);
    }

    public static void main(String[] args) {
        new TerugTellerClient();
    }
}
