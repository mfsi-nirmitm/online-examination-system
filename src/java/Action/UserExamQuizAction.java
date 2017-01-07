/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserExamQuizService;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.Person;
import model.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserExamQuizAction extends ActionSupport implements SessionAware
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
    
    /////first question
    private String ques1;
    public void setQues1(String ques1)
    {
        this.ques1=ques1;
    }
    public String getQues1()
    {
        return this.ques1;
    }
    private List<String> list1;
    public void setList1(List<String> list1)
    {
        this.list1=list1;
    }
    public List<String> getList1()
    {
        return this.list1;
    }
    private String ans1;
    public void setAns1(String ans1)
    {
        this.ans1=ans1;
    }
    public String getAns1()
    {
        return this.ans1;
    }
    private String right1;
    public void setRight1(String right1)
    {
        this.right1=right1;
    }
    public String getRight1()
    {
        return this.right1;
    }
    
    ////////second question
    private String ques2;
    public void setQues2(String ques2)
    {
        this.ques2=ques2;
    }
    public String getQues2()
    {
        return this.ques2;
    }
    private List<String> list2;
    public void setList2(List<String> list2)
    {
        this.list2=list2;
    }
    public List<String> getList2()
    {
        return this.list2;
    }
    private String ans2;
    public void setAns2(String ans2)
    {
        this.ans2=ans2;
    }
    public String getAns2()
    {
        return this.ans2;
    }
    private String right2;
    public void setRight2(String right2)
    {
        this.right2=right2;
    }
    public String getRight2()
    {
        return this.right2;
    }
    
    ///third question
    private String ques3;
    public void setQues3(String ques3)
    {
        this.ques3=ques3;
    }
    public String getQues3()
    {
        return this.ques3;
    }
    private List<String> list3;
    public void setList3(List<String> list3)
    {
        this.list3=list3;
    }
    public List<String> getList3()
    {
        return this.list3;
    }
    private String ans3;
    public void setAns3(String ans3)
    {
        this.ans3=ans3;
    }
    public String getAns3()
    {
        return this.ans3;
    }
    private String right3;
    public void setRight3(String right3)
    {
        this.right3=right3;
    }
    public String getRight3()
    {
        return this.right3;
    }
    
    /////// forth question
    private String ques4;
    public void setQues4(String ques4)
    {
        this.ques4=ques4;
    }
    public String getQues4()
    {
        return this.ques4;
    }
    private List<String> list4;
    public void setList4(List<String> list4)
    {
        this.list4=list4;
    }
    public List<String> getList4()
    {
        return this.list4;
    }
    private String ans4;
    public void setAns4(String ans4)
    {
        this.ans4=ans4;
    }
    public String getAns4()
    {
        return this.ans4;
    }
    private String right4;
    public void setRight4(String right4)
    {
        this.right4=right4;
    }
    public String getRight4()
    {
        return this.right4;
    }
    
    ////////////// fifth question
    private String ques5;
    public void setQues5(String ques5)
    {
        this.ques5=ques5;
    }
    public String getQues5()
    {
        return this.ques5;
    }
    private List<String> list5;
    public void setList5(List<String> list5)
    {
        this.list5=list5;
    }
    public List<String> getList5()
    {
        return this.list5;
    }
    private String ans5;
    public void setAns5(String ans5)
    {
        this.ans5=ans5;
    }
    public String getAns5()
    {
        return this.ans5;
    }
    private String right5;
    public void setRight5(String right5)
    {
        this.right5=right5;
    }
    public String getRight5()
    {
        return this.right5;
    }
    @Override
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
        rs.next();
        rs.getString(1);
        this.ques1="Q1: "+rs.getString(2);
        list1=new LinkedList<String>();
        this.right1=rs.getString(3);
        session.put("right1",right1);
        
        list1.add(rs.getString(4));
        list1.add(rs.getString(5));
        list1.add(right1);
        list1.add(rs.getString(6));
        rs.next();
        rs.getString(1);
        this.ques2="Q2: "+rs.getString(2);
        list2=new LinkedList<String>();
        this.right2=rs.getString(3);
        session.put("right2",right2);
        list2.add(rs.getString(4));
        list2.add(rs.getString(5));
        list2.add(rs.getString(6));
        list2.add(right2);
        rs.next();
        rs.getString(1);
        this.ques3="Q3: "+rs.getString(2);
        list3=new LinkedList<String>();
        this.right3=rs.getString(3);
        session.put("right3",right3);
        list3.add(rs.getString(4));
        list3.add(right3);
        list3.add(rs.getString(5));
        list3.add(rs.getString(6));
        rs.next();
        rs.getString(1);
        this.ques4="Q4: "+rs.getString(2);
        list4=new LinkedList<String>();
        this.right4=rs.getString(3);
        session.put("right4",right4);
        list4.add(rs.getString(4));
        list4.add(rs.getString(5));
        list4.add(rs.getString(6));
        list4.add(right4);
        rs.next();
        rs.getString(1);
        this.ques5="Q5: "+rs.getString(2);
        list5=new LinkedList<String>();
        this.right5=rs.getString(3);
        session.put("right5",right5);
        list5.add(rs.getString(4));
        list5.add(rs.getString(5));
        list5.add(right5);
        list5.add(rs.getString(6));
        return SUCCESS;
    }
    private List<Person> persons;
    public List<Person> getPersons() 
    {
        return persons;
    }
    public void setPersons(List<Person> persons) 
    {
        this.persons = persons;
    }
    private int count=0;
    public void setCount(int count)
    {
        this.count=count;
    }
    public int getCount()
    {
        return this.count;
    }
    public String function() throws SQLException
    {
        this.userexam=(String)session.get("exam");
        User user=(User)session.get("user");
        this.right1=(String)session.get("right1");
        this.right2=(String)session.get("right2");
        this.right3=(String)session.get("right3");
        this.right4=(String)session.get("right4");
        this.right5=(String)session.get("right5");
        String username=user.getUsername();
        UserExamQuizService userExamQuizService =new UserExamQuizService ();
        boolean yes=userExamQuizService.check(username, userexam);
        if(yes)
        {
            userExamQuizService.delete(username,userexam);
        }
        //else
        {
            this.count=0;
            if(!ans1.isEmpty())if(ans1.equals(right1)) this.count++;
            if(!ans2.isEmpty())if(ans2.equals(right2)) this.count++;
            if(!ans3.isEmpty())if(ans3.equals(right3)) this.count++;
            if(!ans4.isEmpty())if(ans4.equals(right4)) this.count++;
            if(!ans5.isEmpty())if(ans5.equals(right5)) this.count++;
            userExamQuizService.update_point(username, userexam, count);
        }
        persons=userExamQuizService.give_list(userexam);
        return SUCCESS;
    }
}