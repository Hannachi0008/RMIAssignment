import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String reverse(String s)
    {
        String res ="";
        for(int i=s.length()-1 ; i>=0 ; i--){
            res=res+s.charAt(i);
        }
        return res;
    }

    public char minASCII(String s){
        int min=(int)s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)<min)
            {
                min=(int)s.charAt(i);
            }
        }
        return (char)min;
    }

    /*  J'ai un probléme ici on me dit "can't resolve la methode isUpperCase
    j'ai fais plusieurs test mais ca sert à rien

     public String MajMin(String s){
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i).isUpperCase()){
                res=res+s.charAt(i).toLowerCase();
            }
            else{
                res=res+s.charAt(i).toUpperCase();
            }
        }
    }*/
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();



        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }


}
