<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html lang="fr">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
    integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous" />
    <link rel="stylesheet" type="text/css" href="./assets/css/style.css">-->
  <script type="text/javascript" src="./assets/js/main.js" defer></script>

  <title>Coco Burger</title>
</head>

<body>
<form method="post" action="bonjour">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        
        <input type="submit" />
    </form>
    
    <ul>
        <c:forEach var="utilisateur" items="${ utilisateurs }">
            <li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
        </c:forEach>
    </ul> 


<%-- 
<c:out value="${ prenom }"/>
    <form method="post" action="bonjour">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        
        <input type="submit" />
    </form> --%>
    
    <!-- Pour l'envoi de fichier -->
<%-- 
	  <c:if test="${ !empty fichier }"><p><c:out value="Le fichier ${ fichier } (${ description }) a été uploadé !" /></p></c:if>
    <form method="post" action="bonjour" enctype="multipart/form-data">
        <p>
            <label for="description">Description du fichier : </label>
            <input type="text" name="description" id="description" />
        </p>
        <p>
            <label for="fichier">Fichier à envoyer : </label>
            <input type="file" name="fichier" id="fichier" />
        </p>
        
        <input type="submit" />
    </form> --%>


<%-- 	<!-- Un Formulaire -->
	
	<c:if test="${ !empty form.resultat }"><p><c:out value="${ form.resultat }"/></p></c:if>
	
	<form method="post" action="FirstServlet">
	<p>
		<label for="login">Login : </label>
		<input type="text" id="login" name="login"/>
	</p>
		<label for="pass">Mot de passe :</label>
		<input type="password" id="pass" name="pass"/>
		
	</p>
		<input type="submit"/>
	</form> --%>



	<!-- une autre boucle -->
	
	<%-- <c:forTokens var="morceau" items="Un élément/Encore un autre élément/Un dernier pour la route" delims="/">
	    <p>${ morceau }</p>
	</c:forTokens> --%>

	<!-- bouche forEach -->

	<%-- <c:forEach items="${ titres }" var="titre" varStatus="status">
		<p>N°<c:out value="${status.last }"/> : <c:out value="${ titre }"/> ! </p>
	</c:forEach> --%>


<%-- <c:choose>
	<c:when test="${50<10 } }"> Du texte </c:when>
	<c:when test="${50<10 }"> Du texte 2</c:when>
	<c:when test="${100<10 }"> Du texte3 </c:when>
	<c:otherwise> salut</c:otherwise>
</c:choose> --%>

<%-- <c:if test="${50<10}" var="variable">
	C'est vrai!
</c:if> --%>


<%-- 
<p>Bonjour ${auteur.prenom } ${auteur.nom } </p>
<p>${auteur.actif ? 'Vous êtes très actif' : 'Vous êtes inactif' }</p>

 --%>
 
 
 <!-- <header>
  
  
     <div class="header_left">
      <img src="./assets/img/assetsLogo/logoBurgerFini.png" alt="">
    </div>
    <nav class="header_right">
      </div>

      <ul>
        <li class="about_li">about</li>
        <li class="menu_li">menu</li>
        <li class="contact_li">contact</li>
      </ul>
    </nav>
  </header>
  <main>
    <div class="main_left">
      <div class="container_burger">
        
        <div class="divburger">
          <img src="./assets/img/assetsBurger/burgerNormal.png" alt="">
        </div>
      </div>
      <div class="container_frite">
        <div class="divfrite">
          <img src="./assets/img/assetsFrite/friteDecoupe.png" alt="">
        </div>
      </div>
      <div class="container_soda">
        <div class="divsoda">
          <img src="./assets/img/assetsSoda/soda.png" alt="">
        </div>
      </div>
      <div class="container_dessert">
        <div class="divdessert">
          <img src="./assets/img/assetsGlace/glace.png" alt="">
        </div>
      </div>
    </div>
    <div class="main_right">
      <div class="hamburger">
        <div class="icone">
          <i class="fas fa-hamburger fa-2x icolor"></i>
        </div>
        <div class="listN">
          <ul>
            <li class="list">Votre commande</li>
            <li class="list">Composition burger</li>
            <li class="list">Montant commande</li>
          </ul>
        </div>


      </div>
    </div>
  </main>
  <footer>
    <div class="footer_top"><img src="./assets/img/mapLogo.png" alt=""></div>
    <div class="footer_center">
      <div>
        <img src="./assets/img/assetsLogo/logoBurgerFini.png" alt="" class="a_propos">
        <p class="a_propos">Section A propos</p>
      </div>
      <div>
        <p class="menu">Menu du restaurant</p>
        <p class="menu">Les burgers / les frites / les </p>
        <p class="menu">boissons / les desserts</p>
      </div>
      <div>
        <p class="contact">Contact</p>  
        <p class="contact">Mail / adresse</p>
      </div>

    </div>
    <div class="footer_bottom">
      <p> &copy; Groupe 2</p>
    </div>

  </footer>
   -->
   
   
   
 <%--  <%@ include file="menu.jsp"%>
  <p>Bonjour a vous ${ !empty name ? name  : ''}  </p>
  
  <p>${ noms[2] }</p> --%>
  
  
  
  <%-- <%
  	String name = (String) request.getAttribute("name");
  	out.println(name);
  %> --%>

 <%--  <p>
  <%
  	String heure = (String) request.getAttribute("heure");
  if (heure.equals("jour"))
	  out.println("bonjour");
  else {
	  out.println("bonsoir");
  }
  %>
  </p>
  <p>	
  	<%
  		for (int i = 0; i<20;i++){
  			out.println("une nouvelle ligne ! <br/>");
  		}
  	%>
  </p> --%>
</body>

</html>