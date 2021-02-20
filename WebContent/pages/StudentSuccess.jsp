<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script >
function addNewStudent() 
{
document.myForm.action="addNewRegistration";
document.myForm.submit();
}

function deleteStudent() 
{
	alert("Are You Sure")
document.myForm.action="deleteStudent";
document.myForm.submit();
}

function editStudent() 
{
	alert("Are You Sure")
document.myForm.action="editStudent";
document.myForm.submit();
}

</script>
</head>
<body style="background-color: pink">
<form name="myForm">
<center>
<br><br><br>
<h1> All Student Details</h1>
<br><br><br>
<table border="2">
<tr>
<th> Select</th>
<th> <B>StudentRollNo</B></th>
<th> Student First Name</th>
<th> Student Middle Name</th>
<th> Student Last Name</th>
<th> Student Gender</th>
<th> Student DOB</th>
<th> Student Email</th>
<th> Student Mobile Number</th>
<th> Student Adhar Number</th>
<th> Student Qualification</th>
<th> Student Address</th>
<th> Student City</th>
<th> Student Pincode</th>
<th> Student Taluka</th>
<th> Student District</th>
<th> Student State</th>
<th> Student Country</th>
</tr>
<c:forEach items="${studentList}" var="student">
<tr> 
<td> <input type="radio" name="studentrollNo" value="${student.studentrollNo}"></td>
<td> <c:out value="${student.studentrollNo }"></c:out></td>
<td> <c:out value="${student.studentFirstName}"></c:out></td>
<td> <c:out value="${student.studentMiddletName }"></c:out></td>
<td> <c:out value="${student.studentLastName }"></c:out></td>
<td> <c:out value="${student.studentGender}"></c:out></td>
<td> <c:out value="${student.studentDob }"></c:out></td>
<td> <c:out value="${student.studentEmail }"></c:out></td>
<td> <c:out value="${student.studentMobileNo}"></c:out></td>
<td> <c:out value="${student.studentAdharNumber }"></c:out></td>
<td> <c:out value="${student.studentQualification }"></c:out></td>
<td> <c:out value="${student.studentAddress }"></c:out></td>
<td> <c:out value="${student.studentCity}"></c:out></td>
<td> <c:out value="${student.studentPinCode }"></c:out></td>
<td> <c:out value="${student.studentTaluka }"></c:out></td>
<td> <c:out value="${student.studentDistrict}"></c:out></td>
<td> <c:out value="${student.studentState }"></c:out></td>
<td> <c:out value="${student.studentCountry }"></c:out></td>
</tr>
</c:forEach>
</table>
<br><br><br>
<input type="button" onclick="addNewStudent()" value="Add New Student">
<input type="button" onclick="editStudent()"  value="Update Student">
<input type="button" onclick="deleteStudent()" value="Delete Student">
</center>
</form>
</body>
</html>