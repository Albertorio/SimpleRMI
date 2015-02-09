package com.interf.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Interface communicates 
public interface simpleInterface extends Remote{
	String HelloWorld() throws RemoteException;
	int compute(int a, int b) throws RemoteException;
}
