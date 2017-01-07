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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nirmit
 */
public class UserExamService 
{
    public List<String> returnlist() throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        
        Statement stmt= con.createStatement();
        List<String> list=new ArrayList<String>();
        String str="select * from exams";
        ResultSet rs=stmt.executeQuery(str);
        while(rs.next())
        {
            list.add(rs.getString(1));
        }
        return list;
    }
}
