<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${mode=='MODE_REGISTER'}">
<form method="POST" action="register">
  <div class="form-group">
    <label for="exampleInputEmail1">Id number</label>
    <input type="text" class="form-control" id="id" aria-describedby="emailHelp" placeholder="Enter email" value="${employee.id }">
     </div>
     <div class="form-group">
    <label for="exampleInputEmail1">First Name</label>
    <input type="text" class="form-control" id="firstname" aria-describedby="emailHelp" placeholder="Enter first name" value="${employee.firstname }">
     </div>
     <div class="form-group">
    <label for="exampleInputEmail1">last name</label>
    <input type="text" class="form-control" id="role" aria-describedby="emailHelp" placeholder="Enter lastnamel" value="${employee.lastname }">
     </div>
     <div class="form-group">
    <label for="exampleInputEmail1">role</label>
    <input type="text" class="form-control" id="role" aria-describedby="emailHelp" placeholder="Enter email" value="${employee.role }">
     </div>
  <div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>    
</form>
</c:when>
</c:choose>
</body>
</html>