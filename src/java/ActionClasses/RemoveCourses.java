/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Course;
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
public class RemoveCourses extends ActionSupport {
    private List<String> courselist;

    public List<String> getCourselist() {
        return courselist;
    }

    public void setCourselist(List<String> courselist) {
        this.courselist = courselist;
    }

    public List<String> getRemlist() {
        return remlist;
    }

    public void setName(String[] names) {
        for(String name: names) {
            remlist.add(name);
        }
    }
    private List<String> remlist=new ArrayList<String>();
    
    Connection conn;
    Statement stmt;
    ResultSet res;
    DatabaseConnection dbconn;
    String query;
    
    public RemoveCourses() {
        courselist= new ArrayList<String>();
        try {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "select name from course";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Course cou = new Course();
                cou.setName(res.getString(1));
                courselist.add(cou.getName());
            }
            res.close();
        } catch(Exception e) {
            
        }
    }
    
    @Override
    public String execute() {
        try {
            for(String item:remlist) {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "delete from course where name='"+item+"'";
            int i=stmt.executeUpdate(query);
            }
            conn.close();
        } catch(Exception e) {
            
        }
        return SUCCESS;
    }
    
    public String display() {
        return NONE;
    }
    
}
