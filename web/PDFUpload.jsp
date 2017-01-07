<%-- 
    Document   : PDFUpload
    Created on : Jul 3, 2016, 1:52:16 PM
    Author     : nirmit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <div>
            <form action="UploadServlet" method="post" enctype="multipart/form-data">
                <input type="file" name="file" size="50" />
                <input type="submit" value="Upload File" />
            </form>
        </div>
    </body>
</html>
