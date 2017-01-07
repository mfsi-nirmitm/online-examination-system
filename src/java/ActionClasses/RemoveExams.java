/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Exams;
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
public class RemoveExams extends ActionSupport {
    private List<String> examlist;
    private List<String> remlist=new ArrayList<String>();

    public List<String> getRemlist() {
        return remlist;
    }

    public void setSubject(String[] subjects) {
        for(String subject: subjects) {
            remlist.add(subject);
        }
    }
    
    Connection conn;
    Statement stmt,stmt1;
    ResultSet res;
    DatabaseConnection dbconn;
    String query,query1;
    
    public RemoveExams() {
        examlist= new ArrayList<String>();
        try {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "select * from exams";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Exams exam = new Exams();
                exam.setSubject(res.getString(1));
                examlist.add(exam.getSubject());
            }
            res.close();
        } catch(Exception e) {
            
        }
    }

    public List<String> getExamlist() {
        return examlist;
    }

    public void setExamlist(List<String> examlist) {
        this.examlist = examlist;
    }
    
    @Override
    public String execute() {
        try {
            for(String item:remlist) {
            dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            stmt1= conn.createStatement();
            query= "delete from exams where subject='"+item+"'";
            query1= "drop table "+item;
            int i=stmt.executeUpdate(query);
            int j=stmt1.executeUpdate(query1);
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
