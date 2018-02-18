package nl.han.oose.dea.lesson3;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);

            for (String s: registry.list()) {
                System.out.println(s);
            }

            Message stub = (Message) registry.lookup("Msg2");
            String message = stub.getMessage();
            System.out.println("Message received: " + message);
        } catch (Exception ex) {
            System.out.println("Client exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
