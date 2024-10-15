
import java.rmi.*;
import java.rmi.server.*;
public class Rmi1  extends UnicastRemoteObject implements Math{
	Rmi1()throws RemoteException{
		super();
		}
	public int add(int a, int b) {
		return(a+b);
	}
	
}
