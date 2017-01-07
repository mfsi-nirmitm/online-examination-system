/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Course;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.Connection;
import java.sql.Statement;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class AddCourse extends ActionSupport implements ModelDriven {
    private Course cou= new Course();

    public Course getCou() {
        return cou;
    }

    public void setCou(Course cou) {
        this.cou = cou;
    }
    
    @Override
    public String execute() {
        try {
            String query;
            Connection conn;
            Statement stmt;
            DatabaseConnection dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "insert into course values ('"+cou.getName()+"','"+cou.getLink()+"')";
            int i= stmt.executeUpdate(query);
            conn.close();
            } catch(Exception e) {
            
        }
        return SUCCESS;
    }

    @Override
    public Object getModel() {
        return cou;
    }
    
}
