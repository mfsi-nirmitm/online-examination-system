<%-- 
    Document   : UserExamResult1
    Created on : Jun 29, 2016, 5:02:11 AM
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
                <div class="container" >
                    <div class="navbar-header">
                        <a href="#" class="navbar-brand">ONLINE EXAMINATION</a>
                    </div>
                </div>
            </nav>
            <br>
            <br>
            <div align="center">
                <h2 class="alert alert-success">Result :    You have got 0 answers correct out of 5.</h2>
            </div>
            <br>
            <br>
            <div align="center">
                <s:form action="submit_feedback1">
                    <s:submit value="Next" action="submit_feedback1" style="background-color: #E9967A;color:white;
                        margin-top:10px;border-radius: 5px;border:none;"/>
                </s:form>
            </div>
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
