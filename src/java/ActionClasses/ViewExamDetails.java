/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Question;
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
public class ViewExamDetails extends ActionSupport {
    private String subject;
    private ArrayList<Question> Ques= new ArrayList<Question>();

    public ArrayList<Question> getQues() {
        return Ques;
    }

    public void setQues(ArrayList<Question> Ques) {
        this.Ques = Ques;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
            String query= "select * from questions where subject='"+subject+"'";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Question q= new Question();
                q.setSubject(res.getString(1));
                q.setQues(res.getString(2));
                q.setOp1(res.getString(3));
                q.setOp2(res.getString(4));
                q.setOp3(res.getString(5));
                q.setOp4(res.getString(6));
                Ques.add(q);
            }
            res.close();
        } catch(Exception e) {
            
        }
        return SUCCESS;
    }
}