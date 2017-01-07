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
public class DisplayExams extends ActionSupport {
    private List<Exams> examlist;

    public List<Exams> getExamlist() {
        return examlist;
    }

    public void setExamlist(List<Exams> examlist) {
        this.examlist = examlist;
    }
    
    @Override
    public String execute() {
        try {
            examlist= new ArrayList<Exams>();
            Connection conn;
            Statement stmt;
            ResultSet res;
            DatabaseConnection dbconn= new DatabaseConnection();
            conn= dbconn.setConnection();
            stmt= conn.createStatement();
            String query= "select * from exams";
            res= dbconn.getResultSet(query, conn);
            while(res.next()) {
                Exams exam = new Exams();
                exam.setSubject(res.getString(1));
                examlist.add(exam);
            }
            res.close();
            
        }catch(Exception e) {
            
        }
        return SUCCESS;
    }
    
}
