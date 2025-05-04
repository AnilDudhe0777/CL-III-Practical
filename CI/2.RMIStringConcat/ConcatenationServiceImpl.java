import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConcatenationServiceImpl extends UnicastRemoteObject implements ConcatenationService {
    protected ConcatenationServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String concatenate(String str1, String str2) throws RemoteException {
        return str1 + str2;
    }
}
