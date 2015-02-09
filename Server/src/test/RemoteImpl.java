package test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.simpleInterface;

public class RemoteImpl extends UnicastRemoteObject implements simpleInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected RemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String HelloWorld() throws RemoteException {
		String hello = "hey!";
		return hello;
	}
	
	public int compute(int a, int b) throws RemoteException{
		int result =0;
		
		result = a + b;
		
		return result;
	}

}
