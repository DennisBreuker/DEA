package nl.han.oose.dea.lesson3;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);

            MessageImpl msg1 = new MessageImpl();
            Message stub = (Message) UnicastRemoteObject.exportObject(msg1, 1099);
            registry.rebind("Msg", stub);
            System.out.println("Stub 'Msg' registered");

            MessageImpl2 msg2 = new MessageImpl2();
            Message stub2 = (Message) UnicastRemoteObject.exportObject(msg2, 1099);
            registry.rebind("Msg2", stub2);
            System.out.println("Stub 'Msg2' registered");

            System.out.println("Server ready");
        } catch (RemoteException ex) {
            System.err.println("Server exception occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
