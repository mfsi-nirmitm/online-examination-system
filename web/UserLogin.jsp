<%-- 
    Document   : UserLogin
    Created on : Jun 17, 2016, 3:10:05 AM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Examination System</title>
        
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <style>
            body{
                color:#000000;
            }

        </style>
    </head>
    <body>
        <div  class="container" style="background-color: #FAEBD7" >
            <div align="center" >
                <img  src="slide.jpg"  width="1140" height="150"  />
            </div>
            
            <nav class="navbar navbar-inverse">
                <div class="container-fluid" >
                    <!-- logo -->
                    <div class="navbar-header">
			<a href="#" class="navbar-brand">ONLINE EXAMINATION</a>
                    </div>
                    <div class="collapse navbar-collapse" id="mainNavBar">
			<ul class="nav navbar-nav">
                            <s:url action="home" var="url_home">
                                <s:param name="id">18</s:param>
                            </s:url>
                            <li ><s:a href="%{url_home}">Home</s:a></li>
                            <s:url action="userregistration" var="user_new">
                                <s:param name="id">13</s:param>
                            </s:url>
                            <li><s:a href="%{user_new}">Register New User</s:a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <br>
            <br>
         <%--<s:div id="login" align="center" >
                <h3 style="background-color:#A9A9A9">-- User Login --</h3>
            <s:form action="userlogin2" style="background-color:#000000">
                <s:textfield label="Login Id" key="user.username"/>
                <s:password label="Password" key="user.password" />
                <s:submit align="center" value="  Submit  "/>
            </s:form>
            <br>--%>
            <%--<s:if test="hasActionMessages()">
                <div class="alert alert-success">
                    <s:actionmessage/>
                </div>
            </s:if>--%>
        <%--</s:div> --%>
        <s:div style="background-color:#7b7b7b;width:30%;padding-left:3%;height:auto;margin-left:35%;border-radius:10px;">
            <h3 style="color:white;text-align: center;">User Login</h3>
            <s:form action="userlogin2">
                <s:textfield label="Login Id" key="user.username"/>
                <s:password label="Password" key="user.password"/>
                <s:submit value="Login" align="center" style="background-color: #E9967A;border-radius:5px;border:none;color:white;padding:5px 10px;margin:5px;"/>
            </s:form>
        </s:div>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <footer style="background-color: #5F9EA0">
            <div align="center">
                <p>@Welcome to online Examination System</p>
            </div>
        </footer>
        </div>
    </body>
</html>
