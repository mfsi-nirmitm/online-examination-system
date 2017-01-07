<%-- 
    Document   : UserRegisterExam
    Created on : Jun 26, 2016, 6:04:22 PM
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
                            <s:url action="give_exam" var="url_back">
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
            <br>
            <div align="center">
                <h3 style="background-color: #b3cce6">Rules</h3>
            </div>
            <ul>
                <li> All the questions are compulsory.</li>
                <li> You have 5 min for 5 questions so 1 min for each question.</li>
                <li> All the question are Multiple Choice Question type. </li>
                <li> Click the option carefully. </li>
                <li> Once you click the submit button you will not be able to update your answer.</li>
                <li> Submit all the question within 5 min otherwise automatically answers will be submitted. </li>
                <li> If you did not click on the submit button then your automatically you will receive 0 points.</li>
            </ul>
            <br>
            <br>
            <div align="center"><!-- start_exam --><!-- give_exam_time -->
                <s:form action="start_exam">
                    <s:submit align="center" value="Register & Start" action="start_exam" style="background-color: #E9967A;color:white;
                        margin-top:10px;border-radius: 5px;border:none;color:black;padding-top:10px;padding-bottom:10px;"/>
                </s:form>
            </div>
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
