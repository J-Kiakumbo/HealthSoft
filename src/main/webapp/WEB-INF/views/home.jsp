<%-- 
    Document   : home
    Created on : 05 Sep 2014, 12:16:29 PM
    Author     : Eusuph Qolo
--%>

<?xml version='1.0' encoding='UTF-8' ?>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

        <head>
            <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
                <title></title>
                <meta name="description" content="">
                    <meta name="viewport" content="width=device-width">
                            <style>
                                body {
                                    padding-top: 50px;
                                    padding-bottom: 20px;
                                }
                            </style>
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
                                            <form name="home" action="navigate" method="get">
                                                <div class="well well-lg">

                                                    <ul class="nav nav-tabs">
                                                        <li><a href="#">Home</a></li>
                                                        <li><a href="http://localhost:8080/HealthSoftProject/dash">Dash Board</a></li>
                                                        <li><a href="#">Doctor</a></li>
                                                        <li><a href="#">Patient</a></li>
                                                        <li><a href="#">Investors</a></li>
                                                        <li><a href="#">About</a></li>
                                                    </ul>     
                                                </div>
                                                <div class="centerDiv"> 
                                                    <div id="slideshow">
                                                        <span class="arrow previous"></span>
                                                        <img src="http://localhost:8080/HealthSoftProject/WEB-INF/views/Doctor.jpg" alt="HTML tutorial"/>
                                                        <span class="arrow next"></span>
                                                    </div>
                                                </div>
                                            </form>
                                        </body>
                                        </html>
