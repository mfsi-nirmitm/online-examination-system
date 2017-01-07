package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import server.DatabaseConnection;

/**
 *
 * @author NIKHIL
 */
public class LoginService {
    
    static String name;
    
    public boolean validateAdmin(String username, String password) throws SQLException 
    {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt= (Statement) con.createStatement();
        String str;
        ResultSet rs;
        str="select * from admin where adminusername='"+username+"'";
        rs = stmt.executeQuery(str);
        if(rs.next())
        {
            String pass=rs.getString(2);
            return pass.equals(password);
        }
        else return false;
    }
       
    
    public String getName() {
        return this.name;
    }
}
