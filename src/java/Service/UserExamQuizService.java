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
import model.Person;

/**
 *
 * @author nirmit
 */
public class UserExamQuizService 
{
    public boolean check(String username,String userexam) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="select * from "+userexam+" where username='"+username+"'";
        rs = stmt.executeQuery(str);
        if(rs.next()) return true;
        else return false;
    }
    public void delete(String username,String userexam) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="delete from "+userexam+" where username='"+username+"'";
        //str="delete from "+userexam+" where username = '"+username+"'";
        stmt.executeUpdate(str);
    }
    public void update_point(String username,String userexam,int point) throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="insert into "+userexam+" values('"+username+"',"+point+",'kasdal')";
        stmt.executeUpdate(str);
    }
    public List<Person> give_list(String userexam)throws SQLException
    {
        List<Person> persons=new ArrayList<Person>();
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="select * from "+userexam;
        rs = stmt.executeQuery(str);
        while(rs.next())
        {
            persons.add(new Person(rs.getString(1),rs.getInt(2)));rs.getString(3);
        }
        return persons;
    }
}
