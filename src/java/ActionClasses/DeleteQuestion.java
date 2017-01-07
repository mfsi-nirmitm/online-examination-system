/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.Statement;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class DeleteQuestion extends ActionSupport {
    private String ques;
    private String subject;
    public void setSubject(String subject)
    {
        this.subject=subject;
    }
    public String getSubject()
    {
        return this.subject;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }
    
    @Override
    public String execute() {
        try {
            Connection conn;
            Statement stmt;
            DatabaseConnection dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            String query= "delete from questions where ques='"+ques+"'";
            int i=stmt.executeUpdate(query);
            conn.close();
        } catch(Exception e) {
            
        }
        addActionMessage("Question deleted Successfully");
        return SUCCESS;
    }
    
}
