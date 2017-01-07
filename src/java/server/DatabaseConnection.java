/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author NIKHIL
 */
import java.sql.*;

public class DatabaseConnection {
    Connection conn;
    Statement stmt;
    ResultSet res;
    
    public DatabaseConnection() {
        
    }
    
    public Connection setConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
        }catch(ClassNotFoundException | SQLException e) {
            
        }
        return conn;
    }
    
    public ResultSet getResultSet(String sql, Connection nconn) {
        this.conn= nconn;
        try {
            stmt= nconn.createStatement();
            res= stmt.executeQuery(sql);
        }catch(Exception e) {
            
        }
        return res;
    }
    
}
