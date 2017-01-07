/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import model.User;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserEditProfileAction extends ActionSupport implements SessionAware
{
    private Map<String,Object> session;
    @Override
    public void setSession(Map<String, Object> session) 
    {
        this.session=session;
    }
    private String username;
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getUsername()
    {
        return this.username;
    }
    private String password;
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return this.password;
    }
    private String first_name;
    public void setFirst_name(String first_name)
    {
        this.first_name=first_name;
    }
    public String getFirst_name()
    {
        return this.first_name;
    }
    private String last_name;
    public void setLast_name(String last_name)
    {
        this.last_name=last_name;
    }
    public String getLast_name()
    {
        return this.last_name;
    }
    private String gender;
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return this.gender;
    }
    private String dob;
    public void setDob(String dob)
    {
        this.dob=dob;
    }
    public String getDob()
    {
        return this.dob;
    }
    private String email_id;
    public void setEmail_id(String email_id)
    {
        this.email_id=email_id;
    }
    public String getEmail_id()
    {
        return this.email_id;
    }
    private String mob_no;
    public void setMob_no(String mob_no)
    {
        this.mob_no=mob_no;
    }
    public String getMob_no()
    {
        return this.mob_no;
    }
    private String course;
    public void setCourse(String course)
    {
        this.course=course;
    }
    public String getCourse()
    {
        return this.course;
    }
    private String education;
    public void setEducation(String education)
    {
        this.education=education;
    }
    public String getEducation()
    {
        return this.education;
    }
    private String yop;
    public void setYop(String yop)
    {
        this.yop=yop;
    }
    public String getYop()
    {
        return this.yop;
    }
    private String college;
    public void setCollege(String college)
    {
        this.college=college;
    }
    public String getCollege()
    {
        return this.college;
    }
    @Override
    public String execute() throws SQLException
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        User s1=(User)session.get("user");
        String s2=s1.getUsername();
        String str="select * from users where username='"+s2+"'";
        ResultSet rs = stmt.executeQuery(str);
        rs.next();
        this.username=rs.getString(1);
        this.password=rs.getString(2);
        this.first_name=rs.getString(3);
        this.last_name=rs.getString(4);
        this.gender=rs.getString(5);
        this.dob=rs.getString(6);
        this.email_id=rs.getString(7);
        this.mob_no=rs.getString(8);
        this.course=rs.getString(9);
        this.education=rs.getString(10);
        this.yop=rs.getString(11);
        this.college=rs.getString(12);
        return SUCCESS;
    }
}
