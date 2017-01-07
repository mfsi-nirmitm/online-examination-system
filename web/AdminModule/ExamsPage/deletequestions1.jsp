<%-- 
    Document   : exams
    Created on : 23 Jun, 2016, 7:22:43 AM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Questions</title>
        <link rel="stylesheet" type="text/css" href="/Examination/AdminModule/ExamsPage/examscss.css" />
        <s:head/>
    </head>
    <body>
        
            <header>
                <img align="left" src="/Examination/LoginPage/online exam.png">
                <h1>Online Examination System</h1><br>
            </header>
        
                <ul>
                    <li><s:a action="adminAction">Home</s:a></li>
                    <li class="dropdown">
                        <s:a href="#" class="dropbtn">Profile</s:a>
                        <div class="dropdown-content">
                            <s:a action="admin_display">View Profile</s:a>
                            <s:a action="admin_edit">Edit Profile</s:a>
                        </div>
                    </li>
                    <li class="dropdown">
                    <s:a href="#" class="dropbtn"><s:property value="#session.loginId" /></s:a>
                    <div class="dropdown-content">
                            <s:a action="admin_logout">Log Out</s:a>
                    </div>
                    </li>
                </ul>
        
        <p></p>
        
        <section>
            <center>
                <h4>Select Exam:</h4>
            <table border="1" cellspacing="1">
                <thead>
                    <tr>
                        <th>S.No.</th>
                        <th>Exams</th>
                    </tr>
                </thead>
                <tbody>
                <s:iterator value="examlist" status="stat">
                    <tr>
                        <td align="center"><s:property value="#stat.count" /></td>
                        <s:url value="deletequesaction2.action" var="url">
                            <s:param name="subject" value="subject" />
                        </s:url>
                        <td width="200" align="center"><s:a href="%{url}"><s:property value="subject" /></s:a></td>
                    </tr>
                    </s:iterator>
                </tbody>
            </table>
            </center>
        </section>
        
        <aside>
            <s:a action="admin_userlist">View All Users</s:a>
        </aside>
        
        <footer>
            
        </footer>
        
    </body>
</html>