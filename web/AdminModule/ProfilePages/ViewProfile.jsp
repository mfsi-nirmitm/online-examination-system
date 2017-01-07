<%-- 
    Document   : ViewProfile
    Created on : 23 Jun, 2016, 7:39:42 AM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link rel="stylesheet" type="text/css" href="/Examination/AdminModule/ProfilePages/ViewProfilecss.css" />
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
        
        <h2>Admin Profile</h2>
        
        <section>
            <table align="center" border="1" cellpadding="3" width="500" >
                <tbody>
                    <s:iterator value="list">
                    <tr>
                        <td width="25%">Username:</td>
                        <td width="60%"><s:property value="username" /></td>
                    </tr>
                    <tr>
                        <td>Full Name:</td>
                        <td><s:property value="first" /> <s:property value="last" /></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><s:property value="gender" /></td>
                    </tr>
                    <tr>
                        <td>Date Of Birth:</td>
                        <td><s:property value="dob" /></td>
                    </tr>
                    <tr>
                        <td>Email-ID:</td>
                        <td><s:property value="emailId" /></td>
                    </tr>
                    <tr>
                        <td>Mobile No.:</td>
                        <td><s:property value="mobno" /></td>
                    </tr>
                    </s:iterator>
                </tbody>
            </table>
        </section>
        
        <footer>
            
        </footer>
        
    </body>
</html>
