/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Pizza.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lk.ijse.Pizza.model.Item;

/**
 *
 * @author kad
 */
public interface ItemController extends Remote{
    public boolean AddItem(Item item)throws RemoteException,SQLException,ClassNotFoundException;
    
    
    
    
}
