<%-- 
    Document   : UserEditProfile
    Created on : Jun 20, 2016, 5:12:50 AM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
        <link href="UserEditProfile.css" rel="stylesheet" type="text/css" />
        <!-- bootstrap tags -->
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
                            <s:url action="userprofile1" var="url1">
                                <s:param name="id">123</s:param>
                            </s:url>
                            <li ><s:a href="%{url1}"  >Back </s:a></li>
                            <s:url action="logout" var="url_logout">
                                <s:param name="id">134</s:param>
                            </s:url>
                            <li ><s:a href="%{url_logout}">Logout</s:a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            
            <br>
            <s:div align="center" style="background-color:#7b7b7b;width:50%;border-radius:10px;margin-left:26%;">
                <h3 style="color:white;">Edit Profile</h3>
                <s:form action="editprofile1" style="background-color:#000000">
                    <s:textfield label="First Name" value="%{first_name}" key="userupdated.first_name"/>
                    <s:textfield label="Last Name" value="%{last_name}" key="userupdated.last_name"/>
                    <s:textfield label="Password" value="%{password}" key="userupdated.password"/>
                    <s:textfield label="Gender" value="%{gender}" key="userupdated.gender"/>
                    <s:textfield label="Date Of Birth" value="%{dob}" key="userupdated.dob" />
                    <s:textfield label="Email I'd" value="%{email_id}" key="userupdated.email_id" />
                    <s:textfield label="Contact" value="%{mob_no}" key="userupdated.mob_no" />
                    <s:textfield label="Course" value="%{course}" key="userupdated.course" />
                    <s:textfield label="Education" value="%{education}" key="userupdated.education" />
                    <s:textfield label="Year Of Pass" value="%{yop}" key="userupdated.yop"/>
                    <s:textfield label="College" value="%{college}" key="userupdated.college"/>
                    <s:submit value="  Submit  " align="center" style="background-color: #E9967A;border-radius:5px;border:none;color:white;padding:5px 10px;margin:5px;"/>
                </s:form>
            </s:div>
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
