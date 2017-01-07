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
import model.User;

/**
 *
 * @author nirmit
 */
public class UserLoginService 
{
    public boolean veryfyLogin(User user) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str="select password from users where username='"+user.getUsername()+"'";
        ResultSet rs=stmt.executeQuery(str);
        boolean yes=rs.next();
        if(yes)
        {
            String pass=rs.getString(1);
            if(user.getPassword().equals(pass)) return true;
            else return false;
        }
        else return false;
    }
}