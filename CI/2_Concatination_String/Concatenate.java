import java.rmi.*;

public interface Concatenate extends Remote {
    String concatenateStrings(String str1, String str2) throws RemoteException;
}
