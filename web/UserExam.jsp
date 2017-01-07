<%-- 
    Document   : UserExam
    Created on : Jun 24, 2016, 4:45:57 AM
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
            color:black;
            font-size: 20px;
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
                            <s:url action="back" var="url_back">
                                <s:param name="id">135</s:param>
                            </s:url>
                            <li ><s:a href="%{url_back}">Back</s:a></li>
                            <s:url action="logout" var="url_logout">
                                <s:param name="id">134</s:param>
                            </s:url>
                            <li ><s:a href="%{url_logout}">Logout</s:a></li>
                        </ul>
                    </div>
                </div>
            </nav>
                        <br/><br/><br/><br><br>
            <div align="center">
                <h3 style="background-color: #f2f2f2;width:600px;"> Select An Exam</h3>
                <s:form action="register_exam" style="background-color: #000000;width:600px;padding-top:30px;padding-bottom:30px;">
                    <s:select label="Choose exam " 
                    headerKey="-1" 
                    list="exams" 
                    name="userexam"  />
                    <s:submit align="center" value="Submit" style="background-color: #E9967A;color:white;
                        margin-top:10px;border-radius: 5px;border:none;"/>
                </s:form>
            </div>
            <br>
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
