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
import model.UserRegister;

/**
 *
 * @author nirmit
 */
public class UserRegisterService 
{
    public boolean veryfyusername(UserRegister userregister) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str="select password from users where username='"+userregister.getUsername()+"'";
        ResultSet rs=stmt.executeQuery(str);
        boolean yes=rs.next();
        if(yes) return false;
        else
        {
            str="insert into users values('"+userregister.getUsername()+"','"+userregister.getPassword()+"','"+userregister.getFirst_name()+"','"+userregister.getLast_name()+"','"+userregister.getGender()+"','"+userregister.getDob()+"','"+userregister.getEmail_id()+"','"+userregister.getMob_no()+"','"+userregister.getCourse()+"','"+userregister.getEducation()+"','"+userregister.getYop()+"','"+userregister.getCollege()+"')";
            stmt.executeUpdate(str);
            return true;
        }
    }
}
