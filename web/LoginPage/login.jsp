<%-- 
    Document   : index
    Created on : 24 May, 2016, 2:37:00 PM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Examination System</title>
        <link rel="stylesheet" type="text/css" href="/Examination/LoginPage/logincss.css" />
    </head>
    <body>
            <header>
                <img align="left" src="/Examination/LoginPage/online exam.png">
                <h1>Online Examination System</h1><br>
            </header>
            
            <section> 
                <center>
                    <s:if test="hasActionErrors()">
                        <div class="errors">
                        <s:actionerror />
                        </div>
                    </s:if>
                    <s:if test="hasActionMessages()">
                        <div class="errors">
                            <s:actionmessage />
                        </div>
                    </s:if>
                    <s:form action="admin_login1">
                        <s:textfield label="Username" name="username" key="username" />
                        <s:password label="Password" name="password" key="password" />
                        <s:submit value="Log In" action="admin_login1" />
                    </s:form>
                    <!--User Login ?
                    <a href="Examination/UserLogin.jsp"> Click Here</a>-->
                </center>
            </section>
        
        <br>
        <br>
        
            <footer>
                User ?
                <a href="http://localhost:9999/Examination">Click Here</a>
            </footer>
        
    </body>
    
</html>
