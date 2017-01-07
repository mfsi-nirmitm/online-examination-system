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
        <title>Add Courses</title>
        <link rel="stylesheet" type="text/css" href="/Examination/AdminModule/ExamsPage/addexamcss.css" />
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
            <h3>
                Add Course
            </h3>
            
        <s:form action="addcourse" method="post">
            <s:textfield label="Name" key="name" />
            <s:textfield label="Link" key="link" />
            <s:submit value="Submit" key="submit" />
        </s:form>
            </center>
        </section>
        
        <aside>
            <s:a action="admin_userlist">View All Users</s:a>
        </aside>
        
        <footer>
            
        </footer>
        
    </body>
</html>