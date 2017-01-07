/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nirmit
 */
public class UserExamFeedbackService 
{
    public void addfeedback(String feedback,String username,String userexam) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="update "+userexam+" set feedback = '"+feedback+"' where username = '"+username+"'";
        stmt.executeUpdate(str);
    }
}
