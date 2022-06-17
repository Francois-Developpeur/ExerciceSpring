<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html lang="fr">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
    integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous" />
    <link rel="stylesheet" type="text/css" href="./assets/css/style.css">
  <script type="text/javascript" src="./assets/js/main.js" defer></script>

  <title>Coco Burger</title>
</head>

<body>

 <header>
  
     <div class="header_left">
      <img src="./assets/img/assetsLogo/logoBurgerFini.png" alt="">
    </div>
    <nav class="header_right">
    

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
   
</body>

</html>