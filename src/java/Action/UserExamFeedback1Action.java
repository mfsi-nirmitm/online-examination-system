/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserExamFeedbackService;
import Service.UserExamQuizService;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import model.Person;
import model.User;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserExamFeedback1Action extends ActionSupport implements SessionAware
{
    private Map<String,Object> session;
    public void setSession(Map<String,Object> session)
    {
        this.session=session;
    }
    public Map<String,Object> getSession()
    {
        return this.session;
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
    private String userexam;
    public void setUserexam(String userexam)
    {
        this.userexam=userexam;
    }
    public String getUserexam()
    {
        return this.userexam;
    }
    
    //// for feedback
    private String feedback;
    public void setFeedback(String feedback)
    {
        this.feedback=feedback;
    }
    public String getFeedback()
    {
        return this.feedback;
    }
    
    public String execute() throws SQLException
    {
        this.userexam=(String)session.get("exam");
        User user=(User)session.get("user");
        String username=user.getUsername();
        UserExamQuizService userExamQuizService =new UserExamQuizService ();
        boolean yes=userExamQuizService.check(username, userexam);
        if(yes)
        {
            userExamQuizService.delete(username,userexam);
        }
        //else
        {
            userExamQuizService.update_point(username, userexam, 0);
        }
        persons=userExamQuizService.give_list(userexam);
        user=(User)session.get("user");
        username=user.getUsername();
        String userexam=(String)session.get("exam");
        UserExamFeedbackService userExamFeedbackService=new UserExamFeedbackService();
        userExamFeedbackService.addfeedback(this.feedback, username, userexam);
        return SUCCESS;
    }
}
