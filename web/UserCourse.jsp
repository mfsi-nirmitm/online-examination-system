<%-- 
    Document   : UserCourse
    Created on : Jun 24, 2016, 4:48:10 AM
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
                            <s:url action="back" var="url_back">
                                <s:param name="id">1239</s:param>
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
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <div align="center">
                <div>
                    <s:url action="download_pdf" var="pdf">
                        <s:param name="id">174</s:param>
                    </s:url>
                    <div style="background-color:#E9967A;font-size:30px;text-align:center;width:400px;border-radius:5px;" align="center"><s:a href="%{pdf}">Download Some Material</s:a></div>
                </div>
                <div>
                    <s:url action="Online_course" var="online">
                        <s:param name="id">173</s:param>
                    </s:url>
                    <div style="margin-top:5px;background-color:#E9967A;font-size:30px;text-align:center;width:400px;border-radius:5px;" ><s:a href="%{online}">Read Online Material</s:a></div>
                </div>
                <%--<div>
                    <s:url action="course_feedback" var="feedback">
                        <s:param name="id">189</s:param>
                    </s:url>
                    <div style="margin-top:5px;background-color:#E9967A;font-size:30px;text-align:center;width:400px;border-radius:5px;" ><s:a href="%{feedback}">Read Online Material</s:a></div>
                </div>--%>
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