<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Login</h3>
<form action="StaffServlet" method="get">
<label for="mobilenumber">mobile number</label>
<input type="number" name="mobilenumber" pattern="[6-9][0-9]{9}" placeholder="Enter mobile number" required autofocus/>
<br/>
<label for="password">Password</label>
<input type="password" name="password" pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,16}$" placeholder="Enter password" required />
<br/>
<button type="submit">Submit</button>

</form>
</main>




</body>
</html>