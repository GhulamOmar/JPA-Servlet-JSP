<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Pets</title>
</head>
<body>
<h2>You can save the data</h2>
<form action ="addpetServlet" method="post">
Pet Type: <input type = "text" name = "pettype" value= "${petEdit.pettype}">
<br></br>
Pet Name: <input type = "text" name = "petname" value= "${petEdit.petname}">
<br></br>
Owner Name: <input type = "text" name = "ownername" value= "${petEdit.ownername}">
<input type ="hidden" name = "id" value= "${itemToEdit.id}">
<br></br>
<input type ="submit" value= "Save Edited pet">
</form>

</body>
</html>