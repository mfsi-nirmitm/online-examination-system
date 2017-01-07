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
import model.UserUpdated;

/**
 *
 * @author nirmit
 */
public class UserUpdatedProfileService 
{
    public boolean update(UserUpdated userupdated,String username) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str="select * from users where username='"+username+"'";
        ResultSet rs = stmt.executeQuery(str);
        boolean yes=rs.next();
        if(yes)
        {
            str="delete from users where username='"+username+"'";
            stmt.executeUpdate(str);
            str="insert into users values('"+username+"','"+userupdated.getPassword()+"','"+userupdated.getFirst_name()+"','"+
                    userupdated.getLast_name()+"','"+userupdated.getGender()+"','"+userupdated.getDob()+"','"+
                    userupdated.getEmail_id()+"','"+userupdated.getMob_no()+"','"+userupdated.getCourse()+"','"+
                    userupdated.getEducation()+"','"+userupdated.getYop()+"','"+userupdated.getCollege()+"')";
            stmt.executeUpdate(str);
            return true;
        }
        else return false;
    }
}
