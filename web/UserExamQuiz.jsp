<%-- 
    Document   : UserExamQuiz
    Created on : Jun 27, 2016, 1:14:45 AM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <style>
	* {margin: 0; padding: 0;}

body{
	/*background: url('http://thecodeplayer.com/uploads/media/wood_pattern.png') repeat;*/
}

.container {
	/*padding: 200px;*/
	text-align: center;
}

.timer {
	padding: 10px;
	background: linear-gradient(top, #222, #444);
	overflow: hidden;
	display: inline-block;
	border: 7px solid #efefef;
	border-radius: 5px;
	
	box-shadow: 
		inset 0 -2px 10px 1px rgba(0, 0, 0, 0.75), 
		0 5px 20px -10px rgba(0, 0, 0, 1);
}

.cell {
	/*Should only display 1 digit. Hence height = line height of .numbers
	and width = width of .numbers*/
	width: 0.60em;
	height: 40px;
	font-size: 50px;
	overflow: hidden;
	position: relative;
	float: left;
}

.numbers {
	width: 0.6em;
	line-height: 40px;
	font-family: digital, arial, verdana;
	text-align: center;
	color: #fff;
	
	position: absolute;
	top: 0;
	left: 0;
	
	/*Glow to the text*/
	text-shadow: 0 0 5px rgba(255, 255, 255, 1);
}

/*Styles for the controls*/
#timer_controls label {


}

.moveten {
	/*The digits move but dont look good. We will use steps now
	10 digits = 10 steps. You can now see the digits swapping instead of 
	moving pixel-by-pixel*/
	animation: moveten 1s steps(10, end) infinite;
}
.movesix {
	animation: movesix 1s steps(6, end) infinite;
}

/*Now we need to sync the animation speed with time speed*/
/*One second per digit. 10 digits. Hence 10s*/
.second {animation-duration: 10s;}
.tensecond {animation-duration: 60s;} /*60 times .second*/

.milisecond {animation-duration: 1s;} /*1/10th of .second*/
.tenmilisecond {animation-duration: 0.1s;}
.hundredmilisecond {animation-duration: 0.01s;}

.minute {animation-duration: 600s;} /*60 times .second*/
.tenminute {animation-duration: 3600s;} /*60 times .minute*/

.hour {animation-duration: 36000s;} /*60 times .minute*/
.tenhour {animation-duration: 360000s;} /*10 times .hour*/

/*The stopwatch looks good now. Lets add some styles*/

/*Lets animate the digit now - the main part of this tutorial*/
/*We are using prefixfree, so no need of vendor prefixes*/
/*The logic of the animation is to alter the 'top' value of the absolutely
positioned .numbers*/
/*Minutes and Seconds should be limited to only '60' and not '100'
Hence we need to create 2 animations. One with 10 steps and 10 digits and
the other one with 6 steps and 6 digits*/
@keyframes moveten {
	0% {top: 0;}
	100% {top: -400px;} 
	/*height = 40. digits = 10. hence -400 to move it completely to the top*/
}

@keyframes movesix {
	0% {top: 0;}
	100% {top: -240px;} 
	/*height = 40. digits = 6. hence -240 to move it completely to the top*/
}


/*Lets use a better font for the numbers*/
@font-face {
	font-family: 'digital';
	
}
</style>
    </head>
    <body onload="setTimeout(function(){window.location = '/Examination/UserExamResult1.jsp';}, 300000)">
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
        
            <div class="container">
                <div class="timer" style="background-color:#000">
                    <div class="cell">
			<div class="numbers tenhour moveten">0 1 2 3 4 5 6 7 8 9</div>
                    </div>
		<div class="cell">
			<div class="numbers hour moveten">0 1 2 3 4 5 6 7 8 9</div>
		</div>
		<div class="cell divider"><div class="numbers">:</div></div>
		<div class="cell">
			<div class="numbers tenminute movesix">0 1 2 3 4 5 6</div>
		</div>
		<div class="cell">
			<div class="numbers minute moveten">0 1 2 3 4 5 6 7 8 9</div>
		</div>
		<div class="cell divider"><div class="numbers">:</div></div>
		<div class="cell">
			<div class="numbers tensecond movesix">0 1 2 3 4 5 6</div>
		</div>
		<div class="cell">
			<div class="numbers second moveten">0 1 2 3 4 5 6 7 8 9</div>
		</div>
		<div class="cell divider"><div class="numbers">:</div></div>
		<div class="cell">
			<div class="numbers milisecond moveten">0 1 2 3 4 5 6 7 8 9</div>
		</div>
		<div class="cell">
			<div class="numbers tenmilisecond moveten">0 1 2 3 4 5 6 7 8 9</div>
		</div>
		<div class="cell">
			<div class="numbers hundredmilisecond moveten">0 1 2 3 4 5 6 7 8 9</div>
		</div>
            </div>
	</div>
            <br>
            <br>
           
        <div align="center" >
            <table>
                <s:form action="result">
                    <tr>
                        <td><h4><s:property value="ques1"/></h4></td>
                        <%--<td><s:radio  name="ans1" list="list1"  /></td>--%>
                        <td><s:select  name="ans1" list="list1" headerKey="-1" headerValue="Select" /></td>
                    </tr>
                    <tr>
                        <td><h4><s:property value="ques2"/></h4></td>
                        <%--<td><s:radio name="ans2" list="list2" /></td>--%>
                        <td><s:select name="ans2" list="list2" headerKey="-1" headerValue="Select"/></td>
                    </tr>
                    <tr>
                        <td><h4><s:property value="ques3"/></h4></td>
                        <%--<td><s:radio name="ans3" list="list3"  /></td>--%>
                        <td><s:select name="ans3" list="list3" headerKey="-1" headerValue="Select" /></td>
                    </tr>
                    <tr>
                        <td><h4><s:property value="ques4"/></h4></td>
                        <%--<td><s:radio  name="ans4" list="list4"  /></td>--%>
                        <td><s:select  name="ans4" list="list4" headerKey="-1" headerValue="Select"  /></td>
                    </tr>
                    <tr>
                        <td><h4><s:property value="ques5"/></h4></td>
                        <%--<td><s:radio  name="ans5" list="list5"  /></td>--%>
                        <td><s:select  name="ans5" list="list5" headerKey="-1" headerValue="Select" /></td>
                    </tr>
                    <tr>
                        <s:submit value="  SUBMIT  " align="center" action="result"/>
                    </tr>
            </s:form>
            </table>
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
