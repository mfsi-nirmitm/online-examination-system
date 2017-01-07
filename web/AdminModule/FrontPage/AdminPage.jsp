<%-- 
    Document   : AdminPage
    Created on : 17 Jun, 2016, 10:26:25 PM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <link rel="stylesheet" type="text/css" href="/Examination/AdminModule/FrontPage/admincss.css" />
    </head>
    <body>
        
            <header>
                <img align="left" src="/Examination/LoginPage/online exam.png">
                <h1>Online Examination System</h1><br>
            </header>
        
        
                <ul>
                    <li><s:a href="#">Home</s:a></li>
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
            <box1>
            <s:a action="admin_exams">
                <img src="/Examination/AdminModule/FrontPage/exams.gif" width="70%" height="70%" />
                </s:a>
                Exams
            </box1>
            
            <box2>
            <s:a action="admin_courses">
                <img  src="/Examination/AdminModule/FrontPage/courses.png" width="70%" height="70%" />
                </s:a>
                Courses
            </box2>
        </section>
        
        <aside>
            <s:a action="admin_userlist">View All Users</s:a>
        </aside>
        
        <footer>
            
            
            
            
            
            
            
            
        </footer>
        
    </body>
</html>