<%-- 
    Document   : UserRegistration
    Created on : Jun 18, 2016, 1:02:27 AM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
        
        
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
                <img  src="slide.jpg" alt="Test Image" width="1140" height="150"  />
            </div>
            
            <nav class="navbar navbar-inverse">
                <div class="container-fluid" >
                    <!-- logo -->
                    <div class="navbar-header">
			<a href="#" class="navbar-brand">ONLINE EXAMINATION</a>
                    </div>
                    <div class="collapse navbar-collapse" id="mainNavBar">
			<ul class="nav navbar-nav">
                            <s:url action="userlogin" var="url_back">
                                <s:param name="id">12</s:param>
                            </s:url>
                            <li ><s:a href="%{url_back}">Back</s:a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <s:if test="hasActionErrors()">
                <div class="alert alert-danger">
                    <s:actionerror/>
                </div>
            </s:if>
            <br>
            <s:div align="center" style="background-color:#7b7b7b;width:50%;border-radius:10px;margin-left:26%;">
                <h3 style="color:white;">New User Registration</h3>
                <s:form  action="register" >
                    <s:textfield label="Login Id" key="userregister.username"/>
                    <s:textfield label="First Name" key="userregister.first_name"/>
                    <s:textfield label="Last Name" key="userregister.last_name"/>
                    <s:password label="Password" key="userregister.password"/>
                    <s:textfield label="Gender" key="userregister.gender"/>
                    <s:textfield label="Date Of Birth" key="userregister.dob"/>
                    <s:textfield label="E-mail I'd" key="userregister.email_id"/>
                    <s:textfield label="Contact" key="userregister.mob_no"/>
                    <s:textfield label="Course" key="userregister.course"/>
                    <s:textfield label="Education" key="userregister.education"/>
                    <s:textfield label="year Of Pass" key="userregister.yop"/>
                    <s:textfield label="College" key="userregister.college"/>
                    <s:submit align="center" value="SUBMIT" style="background-color: #E9967A;border-radius:5px;border:none;color:white;padding:5px 10px;margin:5px;"/>
                </s:form >
            </s:div>
            <br>
            <br>
            <footer style="background-color: #5F9EA0">
                <div align="center">
                    <p>Welcome to online Examination System</p>
                </div>
            </footer>
        </div>
    </body>
</html>
