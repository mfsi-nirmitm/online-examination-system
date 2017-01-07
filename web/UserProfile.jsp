<%-- 
    Document   : UserProfile
    Created on : Jun 18, 2016, 3:44:05 PM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
        <link href="UserProfile.css" rel="stylesheet" type="text/css" />
        <!-- bootstrap tags -->
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
                            <s:url action="editprofile" var="url1">
                                <s:param name="id">123</s:param>
                            </s:url>
                            <li ><s:a href="%{url1}"  >Edit Profile  </s:a></li>
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
            <s:div align="center">
                <h3 style="background-color: #00CC99">-- Your Profile --</h3>
            </s:div>
            <!--<div align="center" class="container"> -->
            <h2>
                <table class="table table-striped" >
                    
                    <s:iterator value="list" >
                    <tbody>
                        <tr align="center">
                            <td  ><s:property value="first"/> </td>
                            <td ><s:property value="second"/></td>
                        </tr>
                    </tbody>
                    </s:iterator>
                </table>
            </h2>
            <!--</div>-->
            <br>
            <div align="center">
            <s:url action="back" var="bck">
                    <s:param name="id">125</s:param>
            </s:url>
                    <h2><s:a href="%{bck}"  >Back  </s:a></h2>
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
