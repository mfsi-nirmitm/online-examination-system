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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Exam;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserExamQuizAction1 extends ActionSupport implements SessionAware
{
    private String userexam;
    public void setUserexam(String userexam)
    {
        this.userexam=userexam;
    }
    public String getUserexam()
    {
        return this.userexam;
    }
    private Map<String,Object> session;
    public void setSession(Map<String,Object> session)
    {
        this.session=session;
    }
    public Map<String,Object> getSession()
    {
        return this.session;
    }
    
    /////////////////////////////////////////////
    private List<Exam> list;
    public void setList(List<Exam> list)
    {
        this.list=list;
    }
    public List<Exam> getList()
    {
        return this.list;
    }
    
    public String execute() throws SQLException
    {
        this.userexam=(String)session.get("exam");
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="select * from questions where subject ='"+this.userexam+"'";
        rs = stmt.executeQuery(str);
        while(rs.next())
        {
            Exam exam=new Exam();
            List<String> answ=new ArrayList<String>();
            exam.setQues(rs.getString(2));
            answ.add(rs.getString(3));
            answ.add(rs.getString(4));
            answ.add(rs.getString(5));
            answ.add(rs.getString(6));
            exam.setAns(answ);
        }
        return SUCCESS;
    }
}
