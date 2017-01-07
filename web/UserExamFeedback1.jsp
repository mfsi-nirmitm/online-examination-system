<%-- 
    Document   : UserExamFeedback1
    Created on : Jul 2, 2016, 10:56:19 PM
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
                </div>
            </nav>
            <br>
            <s:bean name="model.PointComparator" var="Comparator" />
            <s:sort comparator="#Comparator" source="persons">
            <table class="table table-striped">
                <thead>
                    <tr>
			<th>Rank</th>
			<th>UserName</th>
			<th>Points</th>
                    </tr>
		</thead>
		<tbody>
                    <s:iterator status="status">
                    <tr>
                        <td><s:property value="%{#status.index +1}" /></td>
                        <td><s:property value="username" /></td>
                        <td><s:property value="point" /></td>
                    </tr>
                    </s:iterator>
		</tbody>
            </table>
            </s:sort>
            <br>
            <br>
            <div align="center">
                <s:form action="submit_feedback">
                    <s:textarea label="" key="feedback" cols="100" rows="10"/>
                    <s:submit value="Submit" align="center" style="background-color: #E9967A;color:white;
                        margin-top:10px;border-radius: 5px;border:none;"/>
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
