import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            ConcatenationService service = (ConcatenationService) Naming.lookup("rmi://localhost/ConcatenationService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine();

            String result = service.concatenate(str1, str2);
            System.out.println("Concatenated result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
