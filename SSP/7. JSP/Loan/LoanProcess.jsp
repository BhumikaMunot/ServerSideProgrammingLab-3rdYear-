<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="p1.Loan" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<%
	double loanAmount = Double.parseDouble(request.getParameter("amt"));
	double intRate = Double.parseDouble(request.getParameter("air"));
	double numYear = Double.parseDouble(request.getParameter("year"));
	java.util.Date today = new java.util.Date();
	Loan ln = new Loan(loanAmount, intRate, numYear);
	%>
	
		<p><strong>Loan Amount           :</strong> Rs.<%= ln.getLoanAmount() %></p>
        <p><strong>Annual Interest Rate  :</strong> <%= ln.getIntRate() %>%</p>
        <p><strong>Number of Years       :</strong> <%= ln.getNumYear() %></p>
        <p><strong>Monthly Payment       :</strong> Rs.<%= String.format("%.2f", ln.MonthlyPayment()) %></p>
        <p><strong>Total Payment         :</strong> Rs.<%= String.format("%.2f", ln.TotalPayment()) %></p>
</body>
</html>