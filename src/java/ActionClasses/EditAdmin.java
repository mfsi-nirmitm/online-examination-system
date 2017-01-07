/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionClasses;

import model.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.Connection;
import java.sql.Statement;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class EditAdmin extends ActionSupport implements ModelDriven {

    Admin user = new Admin();

    public Admin getUser() {
        return user;
    }

    public void setUser(Admin user) {
        this.user = user;
    }
    
    @Override
    public String execute() {
        try {
            String query;
            Connection conn;
            Statement stmt;
            DatabaseConnection dbconn = new DatabaseConnection();
            conn = dbconn.setConnection();
            stmt=conn.createStatement();
            query="update admin set adminusername='"+user.getUsername()+"',adminpassword='"+user.getPassword()+"',adminfirstname='"+user.getFirst()+"',adminlastname='"+user.getLast()+"',admin_gender='"+user.getGender()+"',admin_dob='"+user.getDob()+"',admin_emailid='"+user.getEmailId()+"',admin_mobno='"+user.getMobno()+"' where id='lakhotia123'";
            int i= stmt.executeUpdate(query);
            conn.close();
        } catch (Exception e) {
        }
        return SUCCESS;
    }

    @Override
    public Object getModel() {
         return user;
    }
}
