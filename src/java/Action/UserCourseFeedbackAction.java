/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserCourseFeedbackService;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.Map;
import model.User;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserCourseFeedbackAction extends ActionSupport implements SessionAware
{
    private String feedback;
    public void setFeedback(String feedback)
    {
        this.feedback=feedback;
    }
    public String getFeedback()
    {
        return this.feedback;
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
    @Override
    public String execute() throws SQLException
    {
        User user=(User)session.get("user");
        String username=user.getUsername();
        String userexam=(String)session.get("exam");
        UserCourseFeedbackService userCourseFeedbackService=new UserCourseFeedbackService();
        userCourseFeedbackService.addfeedback(this.feedback, username);
        return SUCCESS;
    }
}
