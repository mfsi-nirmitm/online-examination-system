/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserRegisterService;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import model.UserRegister;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author nirmit
 */
public class UserRegisterAction extends ActionSupport
{
    private UserRegister userregister;
    public void setUserregister(UserRegister userregister)
    {
        this.userregister=userregister;
    }
    public UserRegister getUserregister()
    {
        return this.userregister;
    }
    @Override
    public void validate()
    {
        if(StringUtils.isEmpty(userregister.getUsername()))addFieldError("userregister.username","User Name can not be blank");
        if(StringUtils.isEmpty(userregister.getFirst_name()))addFieldError("userregister.first_name","Full Name can not be blank");
        if(StringUtils.isEmpty(userregister.getPassword()))addFieldError("userregister.password","Password can not be blank");
        if(StringUtils.isEmpty(userregister.getGender()))  addFieldError("userregister.gender","Gender can not be blank");
        if(StringUtils.isEmpty(userregister.getDob())) addFieldError("userregister.dob","Date Of Birth can not be blank");
        if(StringUtils.isEmpty(userregister.getCourse()))addFieldError("userregister.course","Course can not be blank");
        if(StringUtils.isEmpty(userregister.getEducation()))addFieldError("userregister.education","Education can not be blank");
        if(StringUtils.isEmpty(userregister.getYop()))addFieldError("userregister.yop","Year of pass can not be blank");
        if(StringUtils.isEmpty(userregister.getMob_no()))addFieldError("userregister.mob_no","Contact Number can not be blank");
        if(StringUtils.isEmpty(userregister.getEmail_id()))  addFieldError("userregister.email_id","Email can not be blank");
        if(StringUtils.isEmpty(userregister.getCollege()))addFieldError("userregister.college","College Name can not be blank");
    }
    @Override
    public String execute() throws SQLException
    {
        UserRegisterService userRegisterService=new UserRegisterService ();
        if(userRegisterService.veryfyusername(userregister))
        {
            addActionMessage("Registration Successful "+userregister.getFirst_name()+" "+userregister.getLast_name()+"!");
            return SUCCESS;
        }
        else
        {
            addActionError("This User Name is already Used");
            return ERROR;
        }
    }
}
