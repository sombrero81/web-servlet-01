<%-- 
    Document   : _TEMPLATE
    Created on : 28 sept. 2016, 16:09:16
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_HEAD.jsp"/>
    </head>
    <body>
        
        
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        
        <div class="titre">
            Modifier film ${monFilm.titre}
        </div>
        
        <div class="contenu">
            
            <form method="POST">
                
                <input type="hidden" value="${monFilm.id}" name="id"/>
                <label>Titre </label>  <input name="titre" type="text" value="${monFilm.titre}"/>
                <br><br>
                <label>Synopsis</label> <textarea name="synopsis">${monFilm.synopsis}</textarea>
                <br><br>
                <label>Annee </label>  <input name="annee" type="text" value="${monFilm.annee}"/>
                <br><br>
                <label>Duree </label>  <input name="duree" type="text" value="${monFilm.duree}"/>
                <br><br>
                <input type="submit" value="Modifier"/>
                <br><br>
                
                
            </form>
        </div>
        
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
        
    </body>
</html>
