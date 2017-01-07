/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserLoginService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.Map;
import model.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserLoginAction extends ActionSupport implements SessionAware
{
    private User user;
    public void setUser(User user)
    {
        this.user=user;
    }
    public User getUser()
    {
        return this.user;
    }
    private Map<String,Object> session;
    public void setSession(Map<String,Object> session)
    {
        this.session=session;
    }
    @Override
    public void validate()
    {
        if(StringUtils.isEmpty(user.getUsername()))addFieldError("user.username","User Name can not be blank");
        if(StringUtils.isEmpty(user.getPassword()))addFieldError("user.password","Password con not be blank");
    }
    @Override
    public String execute() throws SQLException
    {
        UserLoginService userLoginService=new UserLoginService();
        if(userLoginService.veryfyLogin(user))
        {
            session.put("user", user);
            return SUCCESS;
        }
        else return ERROR;
    }
}
