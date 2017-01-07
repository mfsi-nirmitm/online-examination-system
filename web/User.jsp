<%-- 
    Document   : UserProfile
    Created on : Jun 17, 2016, 9:47:22 PM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Examination System</title>
        <link href="User.css" rel="stylesheet" type="text/css" />
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <style>
            a:hover{
                color:white;
                background-color:black; 
            }
        </style>
    </head>
    <body>
        <div class="container" style="background-color: #FAEBD7">
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
			<ul class="nav navbar-nav navbar-right">
                            <s:url action="logout" var="url_logout">
                                <s:param name="id">134</s:param>
                            </s:url>
                            <li ><s:a href="%{url_logout}">Logout</s:a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <br/><br/><br/>
            <h3 style="font-size:30px;font-weight:bold;text-align: center;">Hello <s:property value="#session['user'].username"/> !</h3>
            <br/>
            <br/>
            
            <div align="center">
                <s:url action="userprofile" var="url_profile">
                    <s:param name="id">123</s:param>
                </s:url>
                <div style="background-color:#E9967A;font-size:30px;text-align:center;width:400px;border-radius:5px;" align="center"><s:a href="%{url_profile}">Your Profile</s:a></div>
            </div>
            <div align="center" style="margin-top:5px;">
                <s:url action="give_exam" var="url_give_exam">
                    <s:param name="id">124</s:param>
                </s:url>
                <div style="background-color:#E9967A;font-size:30px;text-align:center;width:400px;border-radius:5px;" ><s:a href="%{url_give_exam}">Give Exam</s:a></div>
            </div>
            <div align="center" style="margin-top:5px;">
                <s:url action="course" var="url_Course">
                    <s:param name="id">123</s:param>
                </s:url>
                <div style="background-color:#E9967A;font-size:30px;text-align:center;width:400px;border-radius:5px;" ><s:a href="%{url_Course}">Course</s:a></div>
            </div>
        <footer style="background-color: #5F9EA0;margin-top:150px;">
            <div align="center">
                <p>@Welcome to online Examination System</p>
            </div>
        </footer>
        </div>
    </body>
</html>