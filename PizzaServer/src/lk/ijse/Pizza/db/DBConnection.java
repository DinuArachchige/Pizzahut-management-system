/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Pizza.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kad
 */
public class DBConnection {
    public static Connection getConnection()throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection.connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pizzahut", "root", 1234);
        
    }
    
}
