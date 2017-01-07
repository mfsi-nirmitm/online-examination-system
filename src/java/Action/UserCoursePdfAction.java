/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author nirmit
 */
public class UserCoursePdfAction extends ActionSupport
{
    private InputStream fileInputStream;
	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public String execute() throws Exception {
	    //fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\GiveLink\\build\\web\\WEB-INF\\data\\hello.pdf"));
	    fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\OnlineExam\\web\\data\\Math.pdf"));
            return SUCCESS;
	}
        public String function2() throws Exception {
	    //fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\GiveLink\\build\\web\\WEB-INF\\data\\hello.pdf"));
	    fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\OnlineExam\\web\\data\\Aptitude.pdf"));
            return SUCCESS;
	}
        public String function3() throws Exception {
	    //fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\GiveLink\\build\\web\\WEB-INF\\data\\hello.pdf"));
	    fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\OnlineExam\\web\\data\\English.pdf"));
            return SUCCESS;
	}
         public String function4() throws Exception {
	    //fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\GiveLink\\build\\web\\WEB-INF\\data\\hello.pdf"));
	    fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\OnlineExam\\web\\data\\clanguage.pdf"));
            return SUCCESS;
	}
         public String function5() throws Exception {
	    //fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\GiveLink\\build\\web\\WEB-INF\\data\\hello.pdf"));
	    fileInputStream = new FileInputStream(new File("C:\\Users\\nirmit\\Documents\\NetBeansProjects\\OnlineExam\\web\\data\\Java.pdf"));
            return SUCCESS;
	}
}
