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
        <title>Users</title>
        <link rel="stylesheet" type="text/css" href="/OES/AdminModule/ProfilePages/ViewProfilecss.css" />
        <s:head/>
    </head>
    <body>
        
            <header>
                <img align="left" src="/OES/LoginPage/online exam.png">
                <h1>Online Examination System</h1><br>
            </header>
        
                <ul>
                    <li><s:a action="adminAction">Home</s:a></li>
                    <li class="dropdown">
                        <s:a href="#" class="dropbtn">Profile</s:a>
                        <div class="dropdown-content">
                            <s:a action="display">View Profile</s:a>
                            <s:a action="edit">Edit Profile</s:a>
                        </div>
                    </li>
                    <li class="dropdown">
                    <s:a href="#" class="dropbtn"><s:property value="#session.loginId" /></s:a>
                    <div class="dropdown-content">
                            <s:a action="logout">Log Out</s:a>
                    </div>
                    </li>
                </ul>
        
        <p></p>
        
        <section>
            <center>
            <table border="1" cellspacing="1">
                <thead>
                    <tr>
                        <th>S.No.</th>
                        <th>Users</th>
                    </tr>
                </thead>
                <tbody>
                <s:iterator value="list" status="stat">
                    <tr>
                        <td align="center"><s:property value="#stat.count" /></td>
                        <s:url action="admin_userdetails.action" var="url">
                            <s:param name="username" value="username" />
                        </s:url>
                        <td width="200" align="center"><s:a href="%{url}"><s:property value="username" /></s:a></td>
                    </tr>
                    </s:iterator>
                </tbody>
            </table>
            </center>
        </section>
        
        <footer>
            
        </footer>
        
    </body>
</html>