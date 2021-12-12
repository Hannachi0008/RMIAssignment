import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    String reverse(String s)throws RemoteException;
    char minASCII(String s)throws RemoteException;
    //String MajMin(String s)throws RemoteException;

}
