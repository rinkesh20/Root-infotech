<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
             #textboxid { height:40px; font-size:10pt; }
                .list:hover{background-color: black; color: blanchedalmond;}
        </style>
        <title> Updation Form</title>
    </head>
    <body style="background-color: Red;">
        <form action="updateStudentDetails">
        <center>
            
           <h1> <b> <u> ROOT INFOTECH </u></b></h1>
           <fieldset>
        <legend><h2> Registration Form </h2></legend>
        
            <table style="border-spacing: 15px;">  
            <c:forEach items="${studentList }" var="student">
            <tr>
            <td>
            <input type="hidden"  name="studentrollNo" value="${student.studentrollNo }">
            </td>
            <tr>
                <td>
                   <i><div class="list"> First Name: </i>
                </td>
                <td>
                    <input type="text"  name="studentFirstName" value="${student.studentFirstName }"> </div>
                </td>
            </tr>
            <tr>
                <td>
                   <i><div class="list"> Middle Name:</i>
                </td>
                <td>
                    <input type="text"  name="studentMiddletName" value="${student.studentMiddletName }"> </div>
                </td>
            </tr>
            <tr>
                <td>
                   <i><div class="list"> Last Name:</i>
                </td>
                <td>
                    <input type="text"  name="studentLastName" value="${student.studentLastName }"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Gender:
                </td>
                <td>
                    <input type="radio" name="studentGender"  value="${student.studentGender }"> Male 
                    <input type="radio" name="studentGender" value="${student.studentGender }"> Female 
                    <input type="radio" name="studentGender" value="${student.studentGender }"> Other </div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Date of Birth:
                </td>
                <td>
                    <input type="date" id="Date of Birthday" name="studentDob"value="${student.studentDob }"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                   <b> Email:</b>
                </td>
                <td>
                    <input type="email"  name="studentEmail"value="${student.studentEmail }"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    <b> Mobile Number :- </b>
                </td>>
                <td>
                    <input type="number" name="studentMobileNo"value="${student.studentMobileNo }"> </div> 
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    <b>Adhar Number: </b>
                </td>
                <td>
                    <input type="number"  name="studentAdharNumber"value="${student.studentAdharNumber }"></div>
                </td>
            </tr>
            <tr>
            <tr>
                    <td><div class="list">
                        <b>Education Qualification: </b>
                    </td>
                    <td>
                        <input type="radio" name="studentQualification" value="SSC"> SSC 
                        <input type="radio" name="studentQualification"value="HSC"> HSC 
                        <input type="radio" name="studentQualification" value="Graduate"> Graduate
                        <input type="radio" name="studentQualification"value="Post-Graduate"> Post-Graduate
                        <input type="radio" name="studentQualification" value="PhD"> PhD
                        <input type="radio" name="studentQualification"value="Other"> Other </div>
                    </td>
                </tr>
                <td><div class="list">
                    Address: 
                </td>
                <td>
                    <textarea id="textboxid"  name="studentAddress" value="${student.studentAddress }"></textarea></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    City/Village: 
                </td>
                <td>
                    <input type="text"  name="studentCity"value="${student.studentCity }"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Pincode: 
                </td>
                <td>
                    <input type="number"  name="studentPinCode"value="${student.studentPinCode }"></div>
                </td>
                </tr>
                <tr>
                <td><div class="list">
                    Taluka: 
                </td>
                <td>
                    <input type="text"  name="studentTaluka"value="${student.studentTaluka}"></div>
                </td>
            </tr>
            <tr>
           
                <td><div class="list">
                    Districts: 
                </td>
                <td>
                    <input type="text"  name="studentDistrict"value="${student.studentDistrict }"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    State: 
                </td>
                <td>
                    <input type="text"  name="studentState"value="${student.studentState }"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Country:   
                </td>
                <td>
                    <input type="text" name="studentCountry"value="${student.studentCountry }"> </div>
                </td>
            </tr>
            <tr>
                <td>
                      <input type="submit"  value="Submit Form" name="">
                </td>
            </tr>
            </table>
        </fieldset>
        </c:forEach>
        </center>
        </form>
    </body>
</html>