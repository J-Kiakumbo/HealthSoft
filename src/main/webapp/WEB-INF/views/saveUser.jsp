<%-- 
    Document   : saveUser
    Created on : 22 Sep 2014, 4:07:33 PM
    Author     : Eusuph Qolo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>Being Java Guys | Registration Form</title>  
    </head>  
    <body>  
        <center>  

            <div style="color: teal; font-size: 30px">Being Java Guys |  
                Registration Form</div>  



            <c:url var="Registration" value="addPatient" ></c:url>  
            <form:form action="addPatient" commandName="patient"  method="post" >  
                <table width="400px" height="150px">  
                    <tr>  
                        <td><form:label path="patientno">Patient No</form:label>  
                            </td>  
                            <td><form:input path="patientno" />  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><form:label path="name">Name</form:label>  
                            </td>  
                            <td><form:input path="name" />  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><form:label path="address">Address</form:label>  
                            </td>  
                            <td><form:input path="address" />  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><form:label path="phoneno">Phone No</form:label>  
                            </td>  
                            <td><form:input path="phoneno" />  
                        </td>  
                    </tr>  
                    <tr>  
                        <td><form:label path="dob">DOB</form:label>  
                            </td>  
                            <td><form:input path="dob" />  
                        </td>  
                    </tr>  
                    <tr>  
                        <td></td>  
                        <td><input type="submit" value="Register" /></td>  
                    </tr>  
                </table>  
            </form:form>  


            <a href="list">Click Here to see User List</a>  
        </center>  
    </body>  
</html> 