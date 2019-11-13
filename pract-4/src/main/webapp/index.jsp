<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="save">
		ID:<input type="text" name="id"></input><br /> 
		NAME:<input type="text" 	name="name"></input><br /> 
		ADDRESS:<input type="text" name="address"></input><br />
		<button type="submit">SUBMIT</button>
	</form>
	
	<form action="getStd">
		ID:<input type="text" name="id"></input><br /> 
		<button type="submit">GET-ID</button>
	</form>
	
	<form action="getName">
		name:<input type="text" name="name"></input><br /> 
		<button type="submit">GET-NAME</button>
	</form>
	
	<form action="greatId">
		ID:<input type="text" name="id"></input><br /> 
		<button type="submit">Great-Id</button>
	</form>
	
	
	<form action="orderByName">
		NAME:<input type="text" name="address"></input><br /> 
		<button type="submit">SORT-NAME</button>
	</form>
	
	
</body>
</html>