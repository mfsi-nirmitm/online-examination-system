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
public class ViewCourses extends ActionSupport {
    private List<Course> list;

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }
    
    @Override
    public String execute(){
        try {
            list= new ArrayList<Course>();
            Connection conn;
            Statement stmt;
            ResultSet res;
            DatabaseConnection dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            String query= "select * from course";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Course cou = new Course();
                cou.setName(res.getString(1));
                cou.setLink(res.getString(2));
                list.add(cou);
            }
            res.close();
            
        }catch(Exception e) {
            
        }
        return SUCCESS;
    }
}
