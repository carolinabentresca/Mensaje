<%-- 
    Document   : msj
    Created on : 08/02/2022, 20:18:15
    Author     : EXO
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensaje</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body style="background: #333333;color: #ffffff">
        <a href="login.jsp" style="font-size: 18px;background: #cc0099;color: #ffffff">Inicio</a> 
        <hr style="background: #ffffff"/>
        <br/>
        <br/>
        <br/> 
    <center>
        <h6 style="color: #cc0099">**********************************************************************</h6>
        <h4>Usuario:    <bean:write name="mensajeForm" property="usuario" /> </h4>
        <h4>Contacto:    <bean:write name="mensajeForm" property="email" /> </h4>
        <h4>Fecha Cumpleaños:    <bean:write name="mensajeForm" property="fecha" /> </h4>
        <h6 style="color: #cc0099">**********************************************************************</h6>
        <br/>
        <h6>Recibirás un mensaje, en tu correo, el día de tu cumpleaños</h6>
    </center>
</body>
</html>
