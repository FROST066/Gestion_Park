<%-- 
    Document   : EnteteAccueil.jsp
    Created on : 18 juil. 2022, 23:03:07
    Author     : Havila
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body
            {
              margin: 0;
              padding: 0;
            }
           .entete
           {
             margin: 0;
             padding: 0;
             height: 70px;
             width: 100%;
             background: linear-gradient(20deg,#0058D2,#00B1C6, #006666);
             display: flex;
             z-index: 1;
           }
           .div
           {
               font-family: Times new roman;
               font-size: 1.5rem;
               color: white;
               margin-top: 15px;
               cursor: pointer;
           }
           a
           {
             text-decoration: none;    
             color: white;  
           }
          .div1
          {
              display: flex;
              width: 300px;
              margin-left: 60px;
          }
          .div2
          {
              display: flex;
              width: 270px;
            margin-left: 20px;
          }
          .div3
          {
             display: flex;
             width: 270px;
             margin-left: 20px;
          }
          .div4
          {
               display: flex;
               margin-left: 20px;
               width: 270px;
          }
          .img
          {
              padding-bottom: 20px;
              padding-right: 8px;
          }
          .logo
          {
              
               width: 60px;
               height: 45px;
               margin-top: 15px;
               margin-left: 40px;
          }
        </style>
    </head>
    <body>
         <div class="entete">
             <a href="/WebApp/Acceuil"><img class="logo" src="img/logo2.png" alt=""/></a>
             <div class="div div1"> <div class="img"><img src="img/list.png"/> </div> <a href="/WebApp/Stock"><b>Equipements en Stock</b></a></div>
             <div class="div div2"> <div class="img"><img src="img/list.png"/> </div> <a href="/WebApp/Alloues"><b>Equipements alloués</b></a></div>
             <div class="div div3"> <div class="img"><img src="img/add.png"/> </div> <a href="/WebApp/Ajout"><b>Ajouter Equipement</b></a></div>
             <div class="div div4"> <div class="img"><img src="img/lo.png"/> </div> <a href="/WebApp/Deconnexion"><b>Déconnexion</b></a></div>
           
         </div>
        
    </body>
</html>  
