/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserUpdatedProfileService;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.Map;
import model.User;
import model.UserUpdated;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author nirmit
 */
public class UserUpdatedProfileAction extends ActionSupport implements SessionAware
{
    Map<String,Object> session;
    @Override
    public void setSession(Map<String, Object> session) 
    {
        this.session=session;
    }
    private UserUpdated userupdated;
    public void setUserupdated(UserUpdated userupdated)
    {
        this.userupdated=userupdated;
    }
    public UserUpdated getUserupdated()
    {
        return this.userupdated;
    }
    @Override
    public void validate()  
    {
        if(StringUtils.isEmpty(userupdated.getFirst_name())) addFieldError("userupdated.first_name","First Name can not be blank");
        if(StringUtils.isEmpty(userupdated.getPassword())) addFieldError("userupdated.password","Password can not be blank ");
        if(StringUtils.isEmpty(userupdated.getGender()))addFieldError("userupdated.gender","Gender can not be blank");
        if(StringUtils.isEmpty(userupdated.getDob())) addFieldError("userupdated.dob","Date Of Birth can not be blank");
        if(StringUtils.isEmpty(userupdated.getEmail_id()))addFieldError("userupdated.email_id","Email I'd can not be blank");
        if(StringUtils.isEmpty(userupdated.getMob_no()))addFieldError("userupdated.mob_no","Contact can not be blank");
        if(StringUtils.isEmpty(userupdated.getCourse()))addFieldError("userupdated.course","Course can not be blank");
        if(StringUtils.isEmpty(userupdated.getEducation()))addFieldError("userupdated.education","Education can not be blank");
        if(StringUtils.isEmpty(userupdated.getYop()))addFieldError("userupdated.yop","Year of pass can not be blank");
        if(StringUtils.isEmpty(userupdated.getCollege())) addFieldError("userupdated.college","College can not be blank");
    }
    @Override
    public String execute() throws SQLException
    {
        User user=(User)session.get("user");
        if(!userupdated.getPassword().equals(user.getPassword()))
            user.setPassword(userupdated.getPassword());
        session.put("user",user);
        
        UserUpdatedProfileService  userUpdatedProfileService=new  UserUpdatedProfileService();
        if(userUpdatedProfileService.update(userupdated,user.getUsername()))
            return SUCCESS;
        else return ERROR;
    }
    
}
