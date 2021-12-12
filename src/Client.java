import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");

           Scanner console = new Scanner(System.in);
           System.out.print("Entrez une chaine: ");
           String s = console.nextLine();
           System.out.println("reverse : "+service.reverse(s));
           System.out.println("minimaum ASCII : "+service.minASCII(s));
           // System.out.println("MAJUSminus : "+service.MajMin(s));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
