/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserExamService;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;


public class UserExamAction extends ActionSupport implements SessionAware
{
    private List<String> exams;
    public void setExams(List<String> exams)
    {
        this.exams=exams;
    }
    public List<String> getExams()
    {
        return this.exams;
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
    
    private String def_exam;
    public String getDef_exam()
    {
        return "Select";
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
    public String execute() 
    {
        session.put("exam", this.userexam);
        return SUCCESS;
    }
	
    public String display() throws SQLException 
    {
        UserExamService userExamService=new UserExamService();
        exams= userExamService.returnlist();//new ArrayList<String>();
        return NONE;
    }
}
