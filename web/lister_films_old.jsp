<%-- 
    Document   : lister_films
    Created on : 28 sept. 2016, 11:52:12
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <a href="index.html"> <h1> hompage</h1></a>
        <h1> Liste des Films </h1>
        <h1>${titre} </h1>
        
        film.titre film.annee
        
        
        <div> <c:forEach items="${mesFilms}" var="monFilm">
                    
                    iteration
                    ${monFilm.titre}
                    <br>
                </c:forEach> 
            </div>
        
        <h1><div>${pied}</div> </h1>
        
        
        
    </body>
</html>