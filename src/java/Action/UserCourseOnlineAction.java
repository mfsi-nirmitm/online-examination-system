/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Service.UserCourseOnlineService;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Pair;

/**
 *
 * @author nirmit
 */
public class UserCourseOnlineAction extends ActionSupport
{
    private List<Pair> list;
    public List<Pair> getList()
    {
        return this.list;
    }
    public void setList(List<Pair> list)
    {
        this.list=list;
    }
    public String execute() throws SQLException
    {
        UserCourseOnlineService userCourseOnlineService =new UserCourseOnlineService();
        list=userCourseOnlineService.data();//new ArrayList<Pair>();
        /*list.add(new Pair("facebook","http://www.fb.com"));
        list.add(new Pair("google","http://www.google.com"));*/
        return SUCCESS;
    }
}
