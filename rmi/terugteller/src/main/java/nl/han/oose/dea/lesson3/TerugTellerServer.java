package nl.han.oose.dea.lesson3;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TerugTellerServer {
    public static void main(String[] args) {
        ITerugTeller teller;
        try {
            Registry r = LocateRegistry.createRegistry(1099);

            teller = new TerugTeller();
            ITerugTeller stub = (ITerugTeller) UnicastRemoteObject.exportObject(teller, 1099);
            r.bind("terugteller", stub);
        } catch (Exception e) {
            System.err.println("Er ging iets mis in de Server");
            e.printStackTrace();
        }
    }
}
