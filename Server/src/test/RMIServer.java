package test;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//import java.rmi.server.UnicastRemoteObject;

import com.interf.test.Constant;

public class RMIServer {

	public static void main(String[] args) throws AccessException, RemoteException, AlreadyBoundException {
		// TODO Auto-generated method stub
		RemoteImpl impl = new RemoteImpl();
		Registry registry = LocateRegistry.createRegistry(Constant.RMI_PORT);
		registry.bind(Constant.RMI_ID, impl);
		System.out.println("Server started");
		
//		if(registry != null){
//			UnicastRemoteObject.unexportObject(registry, true);
//		}
	}

}
