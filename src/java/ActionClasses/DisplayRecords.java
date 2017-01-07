/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Admin;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class DisplayRecords extends ActionSupport {
    ArrayList<Admin> list = new ArrayList<Admin>();
    
    Connection conn;
    Statement stmt;
    ResultSet res;
    DatabaseConnection dbconn;
    String query;

    public ArrayList<Admin> getList() {
        return list;
    }

    public void setList(ArrayList<Admin> list) {
        this.list = list;
    }
    
    
    @Override
    public String execute() {
        try {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "select * from admin";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Admin user = new Admin();
                user.setUsername(res.getString(1));
                user.setFirst(res.getString(3));
                user.setLast(res.getString(4));
                user.setGender(res.getString(5));
                user.setDob(res.getString(6));
                user.setEmailId(res.getString(7));
                user.setMobno(res.getString(8));
                list.add(user);
            }
            res.close();
        }catch(Exception e) {
            
        }
        return SUCCESS;
    }
}
