<%-- 
    Document   : UserCoursePdf
    Created on : Jul 3, 2016, 10:41:51 PM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Examination System</title>
        <style>
            .mat1{
                text-align: center;
                padding-left:300px;
                padding-top:50px;
            }
            .mat{
                background-color:#000;
                width:500px;
                color:white;
                font-size:30px;
            }
            .mat2{
                text-align: center;
                padding-top:15px;
            }
        </style>
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
                            <s:url action="course" var="url_back">
                                <s:param name="id">1235</s:param>
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
            <div class="mat1">
                <p class="mat">Download Material</>
            </div>
            <div class="mat2">
                <s:url id="studyid1" namespace="/" action="download" ></s:url>
                <h2>Mathematics - <s:a href="%{studyid1}">Mathematics, Basic Math and Algebra - Julian Oliver</s:a></h2>
                
                <s:url id="studyid2" namespace="/" action="download2" ></s:url>
                <h2>Aptitude - <s:a href="%{studyid2}">RS Aggarwal Quantitative Aptitude Free PDF Download</s:a></h2>
                
                <s:url id="studyid3" namespace="/" action="download3" ></s:url>
                <h2>English - <s:a href="%{studyid3}">Oxford Guide to English Grammar </s:a></h2>
                
                <s:url id="studyid4" namespace="/" action="download4" ></s:url>
                <h2>C language - <s:a href="%{studyid4}">Download C Programming Tutorial </s:a></h2>
                
                <s:url id="studyid5" namespace="/" action="download5" ></s:url>
                <h2>Java language - <s:a href="%{studyid5}">Download Java Tutorials  </s:a></h2>
                
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
