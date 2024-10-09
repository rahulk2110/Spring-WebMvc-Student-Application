<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student enquiry friend</h2>
	<form:form method="POST" action="save" modelAttribute="Student">
		<table>
			
			<tr>
				<td>Name :</td>
				<td><form:input path="Name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="Email" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="Gender" />Male <form:radiobutton
						path="Gender" />Female <form:radiobutton path="Gender" />Others</td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:select path="Course">
						<form:option value="">-Select-</form:option>
						<form:options items="${course}"/>
					</form:select></td>
			</tr>
			<tr>
				<td>Timings:</td>
				<td><form:checkboxes items="${timing}" path="timings"/>
				
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>