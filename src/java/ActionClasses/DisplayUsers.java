/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Users;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class DisplayUsers extends ActionSupport {
    private List<Users> list;
    private List<Users> usr;
    private String username;
    
    Connection conn;
    Statement stmt,stmt1;
    ResultSet res;
    DatabaseConnection dbconn;
    String query;

    public List<Users> getList() {
        return list;
    }

    public void setList(List<Users> list) {
        this.list = list;
    }

    public List<Users> getUsr() {
        return usr;
    }

    public void setUsr(List<Users> usr) {
        this.usr = usr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public DisplayUsers() {
        list= new ArrayList<Users>();
        try {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "select * from users";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Users user = new Users();
                user.setUsername(res.getString(1));
                list.add(user);
            }
            res.close();
        } catch(Exception e) {
            
        }
    }
    
    @Override
    public String execute() {
        usr= new ArrayList<Users>();
        try {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "select * from users where username='"+username+"'";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Users user = new Users();
                user.setUsername(res.getString(1));
                user.setFirst(res.getString(3));
                user.setLast(res.getString(4));
                user.setGender(res.getString(5));
                user.setDob(res.getString(6));
                user.setEmailid(res.getString(7));
                user.setMobno(res.getString(8));
                user.setCourse(res.getString(9));
                user.setEdu(res.getString(10));
                user.setYop(res.getString(11));
                user.setCollege(res.getString(12));
                usr.add(user);
            }
            res.close();
        } catch(Exception e) {
            
        }
        return SUCCESS;
    }
    
    public String display() {
        return NONE;
    }
    
}
