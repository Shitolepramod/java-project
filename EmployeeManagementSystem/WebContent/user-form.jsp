
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body style="background-color: #e9e5de">

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: purple">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> Employee Management Application </a>
			</div>
			

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Employee</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card" style="background-color:#e0dcde">
			<div class="card-body">
				<c:if test="${user != null}">
					<form  style="background-color: #e0dcde "action="update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit Employee
            		</c:if>
						<c:if test="${user == null}">
            			Add New Employee
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>

				
				<fieldset class="form-group">
					<label>Employee Name</label> <input type="text"
						value="<c:out value='${Employee.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Employee Email</label> <input type="text"
						value="<c:out value='${Employee.email}' />" class="form-control"
						name="email">
				</fieldset> 
				
				<fieldset class="form-group">
					<label> contact num</label> <input type="text"
						value="<c:out value='${Employee.email}' />" class="form-control"
						name="email">
				</fieldset> 
				
				

				<fieldset class="form-group">
					<label>Employee Country</label> <input type="text"
						value="<c:out value='${Employee.country}' />" class="form-control"
						name="country">
				</fieldset>

				<button type="submit" style="padding:7px 12px" class="fill the records">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>