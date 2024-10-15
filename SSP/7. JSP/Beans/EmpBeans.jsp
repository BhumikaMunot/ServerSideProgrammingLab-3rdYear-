<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="p1.Employee" scope="page">

    <jsp:setProperty name="emp" property="empID" value="101"/>

    <jsp:setProperty name="emp" property="empName" value="Bhumika"/>

    <jsp:setProperty name="emp" property="desg" value="CEO"/>

    <jsp:setProperty name="emp" property="sal" value="5000000"/>

</jsp:useBean>



<h1><u>Employee Data</u></h1>

<p>Emp ID: <i><jsp:getProperty name="emp" property="empID"/></i></p>

<p>Emp Name: <i><jsp:getProperty name="emp" property="empName"/></i></p>

<p>Designation: <i><jsp:getProperty name="emp" property="desg"/></i></p>

<p>Salary: <i><jsp:getProperty name="emp" property="sal"/></i></p>

</body>
</html>