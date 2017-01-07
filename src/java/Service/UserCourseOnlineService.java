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
import model.Pair;

/**
 *
 * @author nirmit
 */
public class UserCourseOnlineService 
{
    public List<Pair> data() throws SQLException
    {
        List<Pair> list=new ArrayList<Pair>();
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str="select * from course";
        ResultSet rs=stmt.executeQuery(str);
        while(rs.next())
        {
            list.add(new Pair(rs.getString(1),rs.getString(2)));
        }
        return list;
    }
}