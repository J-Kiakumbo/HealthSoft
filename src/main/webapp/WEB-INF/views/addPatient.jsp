<%-- 
    Document   : addPatiant
    Created on : 17 Sep 2014, 2:29:45 PM
    Author     : Eusuph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
        <title>JSP Page</title>
    </head>
    <body>
    <center> <h1>Patient registration</h1></center>
    <div class="centerDiv">
        <div align="center">
            <p></p>
            <form method="post" action="addPatient">
                <center><h2>Patient Details</h2></center><p></p>
                <center>
                    <table border=0 bgcolor="#776655" width=70% height=150 align=right cellpadding=5 cellspacing=10>
                        <tr>
                            <td>Patient No:  <input type="text" name="pNumber"><br></td>
                        </tr>
                        <tr>
                            <td>Fist Name :  <input type="text" name="name"><br></td>
                        </tr>
                        <tr>
                            <td>Fist Name :  <input type="text" name="name"><br></td>
                        </tr>
                        <tr>
                            <td>Fist Nme :  <input type="text" name="name"><br></td>
                        </tr>
                        <tr>
                            <td>Fist Name :  <input type="text" name="name"><br></td>
                        </tr>
                        <input type="Submit" value="Save">
                    </table>
                    
                </center>
                
            </form>
        </div>

    </body>
</html>
