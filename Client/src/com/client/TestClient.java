package com.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import com.interf.test.Constant;
import com.interf.test.simpleInterface;

public class TestClient {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		
		int a,b = 0;
		
		Scanner in = new Scanner(System.in);
		
		Registry registry = LocateRegistry.getRegistry("localhost",Constant.RMI_PORT);
		simpleInterface remote = (simpleInterface) registry.lookup(Constant.RMI_ID);
		System.out.println(remote.HelloWorld());
		System.out.println("Enter a: ");
		a = in.nextInt();
		System.out.println("Enter b: ");
		b = in.nextInt();
		System.out.println(remote.compute(a,b));
	}

}
