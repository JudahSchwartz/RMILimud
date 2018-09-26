package ClientCode;

import SharedCode.Operations;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        System.out.println("Hello");
        try {
            Operations operations = (Operations) Naming.lookup("//localhost/Operations");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
