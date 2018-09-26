package ClientCode;

import java.rmi.RMISecurityManager;

public class Client {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        System.out.println("Hello");
    }
}
