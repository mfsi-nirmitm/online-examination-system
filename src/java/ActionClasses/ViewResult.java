/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.ExamDetails;
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
public class ViewResult extends ActionSupport {
    private List<ExamDetails> list= new ArrayList<ExamDetails>();
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<ExamDetails> getList() {
        return list;
    }

    public void setList(List<ExamDetails> list) {
        this.list = list;
    }
    
    @Override
    public String execute() {
        try {
            Connection conn;
            Statement stmt;
            ResultSet res;
            DatabaseConnection dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            String query= "select * from "+subject+" order by point desc";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                ExamDetails ed= new ExamDetails();
                ed.setUsername(res.getString(1));
                ed.setPoint(res.getInt(2));
                ed.setFeedback(res.getString(3));
                list.add(ed);
            }
            res.close();
        } catch(Exception e) {
            
        }
        return SUCCESS;
    }
    
}
