/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Exams;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.Connection;
import java.sql.Statement;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class AddExam extends ActionSupport implements ModelDriven {
    private Exams exam= new Exams();

    public Exams getExam() {
        return exam;
    }

    public void setExam(Exams exam) {
        this.exam = exam;
    }
    
    @Override
    public String execute(){
        try {
            String query1,query2;
            Connection conn;
            Statement stmt1,stmt2;
            DatabaseConnection dbconn = new DatabaseConnection();
            conn = dbconn.setConnection();
            stmt1=conn.createStatement();
            stmt2=conn.createStatement();
            query1= "insert into exams values('"+exam.getSubject()+"')";
            int i=stmt1.executeUpdate(query1);
            query2="create table "+exam.getSubject()+" (username varchar2(16),point integer,feedback varchar2(256)) tablespace users";
            int j= stmt2.executeUpdate(query2);
            conn.close();
        } catch(Exception e) {
            
        }
        addActionMessage("Exam added Successfully");
        return SUCCESS;
    }

    @Override
    public Object getModel() {
        return exam;
    }
    
}
