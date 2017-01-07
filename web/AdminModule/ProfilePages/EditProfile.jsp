<%-- 
    Document   : register
    Created on : 24 May, 2016, 6:08:04 PM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Admin profile</title>
        <link rel="stylesheet" type="text/css" href="/Examination/AdminModule/ProfilePages/EditProfilecss.css" />
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
        
        <h2>Edit Admin Profile</h2>
        
        <section>
            <center>
            <s:form action="EditAdminProfile" method="post">
                        <s:textfield label="Username" key="username" />
                        <s:textfield label="First Name" key="first" />
                        <s:textfield label="Last Name" key="last" />
                        <s:select label="Gender" key="gender" list="{'Male','Female'}" />
                        <s:textfield label="Date Of Birth" key="dob" />
                        <s:textfield label="Email-ID" key="emailId" />
                        <s:textfield label="Mobile No." key="mobno" />
                        <s:password label="Password" key="password" />
                        <s:password label="Confirm Password" key="password1" />
                    <s:submit name="submit" value="submit" />
            </s:form>
            </center>
        </section>
        
        <footer>
            
        </footer>
        
    </body>
</html>
