package ServerCode;

import SharedCode.Operations;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject {

    protected Server() throws RemoteException {
    }

    public static void main(String[] args){
        System.out.println("Server Starting up");
        try {
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Operations",new Operations());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}

