/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Pizza.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lk.ijse.Pizza.model.Customer;
import lk.ijse.Pizza.observer.CustomerObserver;

/**
 *
 * @author kad
 */
public interface CustomerController extends Remote{
    public boolean AddCustomer(Customer customer)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean UpdateCustomer(String ID)throws RemoteException,SQLException,ClassNotFoundException;
    public Customer SearchCustomer(String ID)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean DeleteCustomer(Customer customer)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean reserveCustomer (String ID)throws RemoteException;
    public boolean releaseCustomer (String ID)throws RemoteException;
    public void AddCustomerObserver(CustomerObserver customerObserver)throws RemoteException;
    
}
