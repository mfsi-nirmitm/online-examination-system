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
import model.User;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserProfileAction extends ActionSupport implements SessionAware
{
    private String first;
    private String second;
    public UserProfileAction(){}
    public UserProfileAction(String first,String second)
    {
        this.first=first;
        this.second=second;
    }
    public void setFirst(String first)
    {
        this.first=first;
    }
    public String getFirst()
    {
        return this.first;
    }
    public void setSecond(String second)
    {
        this.second=second;
    }
    public String getSecond()
    {
        return this.second;
    }
    private List list;
    public void setList(List list)
    {
        this.list=list;
    }
    public List getList()
    {
        return this.list;
    }
    private Map<String,Object> session;
    @Override
    public void setSession(Map<String, Object> session) 
    {
        this.session=session;
    }
    @Override
    public String execute() throws SQLException {
      list = new ArrayList();
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
      Statement stmt= (Statement) con.createStatement();
      User s1=(User)session.get("user");
      String s2=s1.getUsername();
      String str="select * from users where username='"+s2+"'";
      ResultSet rs = stmt.executeQuery(str);
      rs.next();
      list.add(new UserProfileAction("User Name",rs.getString(1)));
      list.add(new UserProfileAction("Password",rs.getString(2)));
      list.add(new UserProfileAction("First Name",rs.getString(3)));
      list.add(new UserProfileAction("Last Name",rs.getString(4)));
      list.add(new UserProfileAction("Gender",rs.getString(5)));
      list.add(new UserProfileAction("Date Of Birth",rs.getString(6)));
      list.add(new UserProfileAction("Email I'd",rs.getString(7)));
      list.add(new UserProfileAction("Contact",rs.getString(8)));
      list.add(new UserProfileAction("Course",rs.getString(9)));
      list.add(new UserProfileAction("Education",rs.getString(10)));
      list.add(new UserProfileAction("Year Of Pass",rs.getString(11)));
      list.add(new UserProfileAction("College",rs.getString(12)));
      return "success";
   }

    
}
