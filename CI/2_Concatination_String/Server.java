import java.rmi.*;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject implements Concatenate {

    public Server() throws RemoteException {
        super();
    }

    // Concatenate the two strings
    @Override
    public String concatenateStrings(String str1, String str2) throws RemoteException {
        return str1 + str2;
    }

    public static void main(String[] args) {
        try {
            // Create and export the server object
            Server server = new Server();
            // Bind the object to the RMI registry
            Naming.rebind("rmi://localhost/ConcatenateService", server);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
