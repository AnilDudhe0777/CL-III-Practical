import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            // DO NOT create registry here if rmiregistry is already running
            ConcatenationServiceImpl service = new ConcatenationServiceImpl();
            Naming.rebind("ConcatenationService", service);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
