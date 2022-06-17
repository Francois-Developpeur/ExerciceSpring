<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html lang="fr">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  

  <title>Coco Burger</title>
</head>

<body>


	<p>Vous êtes sur autre.jsp</p>

 <c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
 	<p>Vous êtes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
    </c:if>
   
    
    </body>

</html>