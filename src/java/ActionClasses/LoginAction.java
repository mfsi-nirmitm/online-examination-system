/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import Service.LoginService;

/**
 *
 * @author NIKHIL
 */
public class LoginAction extends ActionSupport implements SessionAware 
{
    
    private String username;
    private String password;
    String query;
    private String name;
    private Map<String,Object> session;
    public void setSession(Map<String,Object> session)
    {
        this.session=session;
    }
    public Map<String,Object> getSession()
    {
        return this.session;
    }
    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    public String home() 
    {
        return SUCCESS;
    }
    @Override
    public void validate()
    {
        if(StringUtils.isEmpty(this.username))addFieldError("username","User Name can not be blank");
        if(StringUtils.isEmpty(this.password))addFieldError("password","Password con not be blank");
    }
    @Override
    public String execute() throws SQLException 
    {
        LoginService loginService =new LoginService();
        if(loginService.validateAdmin(this.username, this.password))
        {
            session.put("loginId",this.username);
            return SUCCESS;
        }
        else 
        {
            addActionError("Username or Password Incorrect");
            return ERROR;
        }
    }
    public String logout() 
    {
        session.remove("loginId");
        addActionMessage("You have been successfully logged out");
        return SUCCESS;
    }
}
