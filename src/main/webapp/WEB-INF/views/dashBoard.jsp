<%-- 
    Document   : DashBoard
    Created on : 09 Sep 2014, 2:52:44 PM
    Author     : Eusuph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">

<html>
    <head>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
          
    <head>
        <style type="text/css"> 
            .centerDiv 
            { 
                width: 70%;
                height:450px; 
                margin: 0 auto;
                background-color:whitesmoke ; 
                border-top-left-radius:15px;
                border-top-right-radius:15px;
                border-bottom-left-radius:15px; 
                border-bottom-right-radius:15px;
            } </style> 



        <style>
            body {background-color:lightgrey}
            h1   {color:black}
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div class="well well-lg">
             <center>
                        <ul class="nav nav-tabs">
                        <li> <a href="http://localhost:8080/HealthSoftProject">Home</a></li>
                        <li><a href="">Dash Board</a></li>
                        <li><a href="#">Doctor</a></li>
                        <li><a href="#">Patient</a></li>
                        <li><a href="#">Investors</a></li>
                        <li><a href="#">About</a></li>
                    </ul>
                    </center>
        </div>
        <div class="centerDiv">
            <div align="center">
                <h1>Patients</h1>
               
                <div style="height:1000px; overflow: auto">

                    <table border="2">
                        <th>NO</th>
                        <th>PATIENTNO</th>
                        <th>NAM</th>
                        <th>ADDRESS</th>
                        <th>PHONENO</th>
                        <th>DOB</th>

                        <c:forEach var="patient" items="${dashBoard}" varStatus="status">
                            <tr>
                                

                                <td>${status.index + 1}</td>
                                <td>${patient.getPatientno()}</td>
                                <td>${patient.getName()}</td>
                                <td>${patient.getAddress()}</td>
                                <td>${patient.getPhoneno()}</td>
                                <td>${patient.getDob()}</td>

                            </tr>
                        </c:forEach>             
                    </table>
                </div>
            </div>

        </div>
    </body>
</html>
