import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object in the RMI registry
            Concatenate remoteObj = (Concatenate) Naming.lookup("rmi://localhost/ConcatenateService");

            // Take input from the user
            System.out.print("Enter first string: ");
            String str1 = System.console().readLine();

            System.out.print("Enter second string: ");
            String str2 = System.console().readLine();

            // Call the remote method to concatenate the strings
            String result = remoteObj.concatenateStrings(str1, str2);

            // Output the concatenated result
            System.out.println("Concatenated Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
