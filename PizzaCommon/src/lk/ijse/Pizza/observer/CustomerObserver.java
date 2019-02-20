/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Pizza.observer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import lk.ijse.Pizza.model.Customer;

/**
 *
 * @author kad
 */
public interface CustomerObserver extends Remote{
    public void Add (Customer customer)throws RemoteException;
    public void Update(Customer customer)throws RemoteException;
    
}
