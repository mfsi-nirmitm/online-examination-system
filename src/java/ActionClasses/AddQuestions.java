/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Question;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.Connection;
import java.sql.Statement;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class AddQuestions extends ActionSupport implements ModelDriven {
    private Question Ques= new Question();
    
    @Override
    public String execute() {
        try {
            String query;
            Connection conn;
            Statement stmt;
            DatabaseConnection dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            query= "insert into questions values ('"+Ques.getSubject()+"','"+Ques.getQues()+"','"+Ques.getOp1()+"','"+Ques.getOp2()+"','"+Ques.getOp3()+"','"+Ques.getOp4()+"')";
            int i= stmt.executeUpdate(query);
            conn.close();
            } catch(Exception e) {
            
        }
        addActionMessage("Question added Successfully");
        return SUCCESS;
    }

    public Question getQues() {
        return Ques;
    }

    public void setQues(Question Ques) {
        this.Ques = Ques;
    }

    @Override
    public Object getModel() {
        return Ques;
    }   
}