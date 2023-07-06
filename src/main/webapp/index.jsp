<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Test</title>
</head>
<body>
<h1>
    TESTING JSP
</h1>
<p>
    <%@ page import="java.util.Date,com.example.demo2.TestClas" %>
    <%TestClas testClas = new TestClas(); %>
    <%=testClas.getInfo()%>
    <br/>
    <%= "String FRom JSP" %>
    <br/>
    <%= new Date()%>
</p>
</body>
</html>