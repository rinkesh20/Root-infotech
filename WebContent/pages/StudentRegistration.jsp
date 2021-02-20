<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
             #textboxid { height:40px; font-size:10pt; }
                .list:hover{background-color: black; color: blanchedalmond;}
        </style>
        <title> Registration Form</title>
    </head>
    <body style="background-color: rgb(83, 204, 156);">
        <form action="addStudent">
        <center>
            
           <h1> <b> <u> ROOT INFOTECH </u></b></h1>
           <fieldset>
        <legend><h2> Registration Form </h2></legend>
            <table style="border-spacing: 15px;">  
            <tr>
                <td>
                   <i><div class="list"> First Name: </i>
                </td>
                <td>
                    <input type="text" placeholder="First Name" name="studentFirstName"> </div>
                </td>
            </tr>
            <tr>
                <td>
                   <i><div class="list"> Middle Name:</i>
                </td>
                <td>
                    <input type="text" placeholder="Middle Name" name="studentMiddletName"> </div>
                </td>
            </tr>
            <tr>
                <td>
                   <i><div class="list"> Last Name:</i>
                </td>
                <td>
                    <input type="text" placeholder="Last Name" name="studentLastName"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Gender:
                </td>
                <td>
                    <input type="checkbox" name="studentGender" value="Male"> Male 
                    <input type="radio" name="studentGender"value="Female"> Female 
                    <input type="radio" name="studentGender" value="other"> Other </div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Date of Birth:
                </td>
                <td>
                    <input type="date" id="Date of Birthday" name="studentDob"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                   <b> Email:</b>
                </td>
                <td>
                    <input type="email" placeholder="Email" name="studentEmail"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    <b> Mobile Number :- </b>
                </td>>
                <td>
                    <input type="number" placeholder="**********" name="studentMobileNo"> </div> 
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    <b>Adhar Number: </b>
                </td>
                <td>
                    <input type="number" placeholder="**** **** ****" name="studentAdharNumber"></div>
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
                    <textarea id="textboxid" placeholder="Address" name="studentAddress"></textarea></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    City/Village: 
                </td>
                <td>
                    <input type="text"  name="studentCity"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Pincode: 
                </td>
                <td>
                    <input type="number" placeholder="******" name="studentPinCode"></div>
                </td>
                </tr>
                <tr>
                <td><div class="list">
                    Taluka: 
                </td>
                <td>
                    <input type="text"  name="studentTaluka"></div>
                </td>
            </tr>
            <tr>
           
                <td><div class="list">
                    Districts: 
                </td>
                <td>
                    <input type="text"  name="studentDistrict"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    State: 
                </td>
                <td>
                    <input type="text" placeholder="MAHARASTRA"  name="studentState"></div>
                </td>
            </tr>
            <tr>
                <td><div class="list">
                    Country:   
                </td>
                <td>
                    <input type="text" placeholder="INDIA" name="studentCountry"> </div>
                </td>
            </tr>
            <tr>
                <td>
                      <input type="submit"  value="Submit Form" name="">
                </td>
            </tr>
            </table>
        </fieldset>
        </center>
        </form>
    </body>
</html>