/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nipuna
 */
public class database {
    
    
    public static Connection getconnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    
        try {
            String userName = "root"; // Database server username
            String password = ""; // server password
            String host = "localhost"; // server location
            String port = "3306"; // communication port. default 3306
            String dbName = "lms"; // name of the database
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            String url = "jdbc:mysql://" + host + ":"+port+"/" + dbName; // database URL

            return DriverManager.getConnection(url,userName,password);
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    
    
    }
    
    
    
}
