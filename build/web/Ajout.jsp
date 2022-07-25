<%-- 
    Document   : ListeStock.jsp
    Created on : 19 juil. 2022, 01:14:33
    Author     : Havila
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout d'Equipements</title>
        <style>
            body
            {
                background-color: #092434;
            }
            .LAlloue
            {
                background-color: #092434;
                height: 620px;
                margin-top:0px;
                width: 1518px;
                margin-left: -8px;
                position: absolute;
                display: flex;
                align-items: center;
                justify-content: center;
            }
            h1
            {
               color: white;
               text-align: center;
               margin-top: 40px;
                
            }
            .tab
            {
                width: 400px;
                height: 600px;
                margin-top: -20px;
                background-color: white;
                border-radius: 60px;
                z-index: 2;
            }
            input
           {
               background: transparent;
               border: none;
               border-left: 3px solid;
               border-top: 3px solid;
               border-bottom: 3px solid;
               border-right: 3px solid;
               padding: 0.6rem;
               width: 230px;
               border-radius: 50px;
               border-color: #00B1C6;
               box-shadow: 20px 20px 60px rgba(0, 0, 0, 0);
               color: black;
               font-weight: 500;
               text-shadow:2px 2px 4px rgba (0, 0, 0, 0); 
               transition: all .3s;
               margin-bottom: 1.3em;
               font-family: Cambria ;
               font-size: 1em;
           }
           textarea
           {
             background: transparent;
               border: none;
               border-left: 3px solid;
               border-top: 3px solid;
               border-bottom: 3px solid;
               border-right: 3px solid;
               padding: 0.6rem;
               width: 230px;
               border-radius: 20px;
               border-color: #00B1C6;
               box-shadow: 20px 20px 60px rgba(0, 0, 0, 0);
               color: black;
               font-weight: 500;
               text-shadow:2px 2px 4px rgba (0, 0, 0, 0); 
               transition: all .3s;
               margin-bottom: 1.3em;
               font-family: Cambria ;
               font-size: 1em;  
           }
           select
           {
               background: transparent;
               border: none;
               border-left: 3px solid;
               border-top: 3px solid;
               border-bottom: 3px solid;
               border-right: 3px solid;
               padding: 0.6rem;
               width: 230px;
               border-radius: 50px;
               border-color: #00B1C6;
               box-shadow: 20px 20px 60px rgba(0, 0, 0, 0);
               color: black;
               font-weight: 500;
               margin-bottom: 1.3em;
               text-shadow:2px 2px 4px rgba (0, 0, 0, 0); 
               transition: all .3s;
               font-family: Cambria ;
               font-size: 1em; 
           }
           ::placeholder
           {
            color:black; 
           }
           form
           {                
               text-align: center;
           }
           input:hover,
           input[type="text"]:focus
           {
               background: rgba(255,255,255,0.1);
               box-shadow: 4px 4px 60px 8px rgba(0, 0, 0, 0);
           }

           .imglogo
            {
               padding-top: 50px;
               padding-bottom:20px;
            }
            option
            {
                padding: 0.6rem;
            }
           .choix
           {
               width: 150px;
               padding: 0.6rem;
           }
           .cat
           {
               width: 160px;
               padding: 0.6rem;
           }
           label
           {
               font-family:Cambria;
               font-size: 1.2em;
           }
           #choice
           {
               padding-right: 40px;
           }
           .ajout
           {
               margin-top: 10px;
               width: 300px;
               font-size: 1.6rem;
               cursor: pointer;
               background:#00B1C6;
               border: none;
               border-left: 3px solid;
               border-top: 3px solid;
               border-bottom: 3px solid;
               border-right: 3px solid;
               padding: 0.6rem;
               border-radius: 100px;
               border-color: #00B1C6;
               box-shadow: 20px 20px 60px rgba(0, 0, 0, .2);
               color: black;
               font-weight: 500;
               text-shadow:2px 2px 4px rgba (0, 0, 0, .2); 
               transition: all .3s;
               font-family: Cambria;
               padding-left: 40px;
               padding-right: 40px;
           }
           .addimg
           {
              margin-top:3px;
              margin-right: 7px;
           }
           .drop-1
           {
               height: 250px; width: 250px; top: -100px; left: 0px;
               
           }
           .drop-2
           {
               height: 100px; width: 100px; bottom: 20px; left: 200px;
               
           }
            .drop-3
           {
               height: 55px; width: 55px; bottom: 50px; right: 60px;
               
           }
            .drop-4
           {
               height: 70px; width: 70px; top: 90px; right:100px;
           }
            .drop-5
           {
               height: 203px; width: 203px; bottom:200px; left: 400px;
              
           }
           .drop-6
           {
               height: 50px; width: 50px; top: 100px; left: 350px;
               
           }
            .drop-7
           {
               height: 50px; width: 50px; top: 450px; left: 150px;
           }
           .drop-8
           {
               height: 80px; width: 80px; top: 230px; right: 130px;
               
           }
        
            .drop-10
           {
               height: 200px; width: 200px; bottom: 50px; right: 400px;
               
           }
            .drop-11
           {
               height: 70px; width: 70px; top: 90px; right:100px;
           }
            .drop-12
           {
               height: 80px; width: 80px; bottom:200px; right: 320px;
              
           }
           .drop-13
           {
               height: 150px; width: 150px; top: 100px; right:350px;
               
           }
            .drop-14
           {
               height: 209px; width: 209px; top: 350px; right: 20px;
           }
           
           .drop
           {
              background: rgba(255,255,255, .3);
              border-radius: 100%;
              border-left: 1px solid rgba(255,255,255, .3);
              border-top: 1px solid rgba(255,255,255, .3);
              box-shadow: 10px 10px 60px -8px rgba(0,0,0, .2);
              position: absolute;
              transition: all 0.2s ease;
              filter:blur(0.8px);
           }
        </style>
    </head>
    
    <body>
        <%@include file="EnteteAccueil.jsp" %>
         <h1>Ajouter un Equipement au Stock</h1><br>
        <div class="LAlloue">
            <div class="tab">
                <form action="Ajout" method="POST">
                   <div class="imglogo"><img src="img/logo3.png" width="120px" height="75px" alt="alt"/></div>
                       <input type="text" name="noms" placeholder="N° série"><br>
                       <input type="text" name="mdps" placeholder="Nom de l'équipement"><br>
                       <label id="choixcat"><b>Catégorie: </b> </label>
                       <select class="cat" name="cat"><br>
                           <option value="1">Ordinateur</option>
                           <option value="2">Logiciel</option>
                           <option value="3">Mémoire</option>
                           <option value="4">Equipement Réseautique</option>
                       </select><br>
                       <label id="choice"><b>Choix: </b> </label>
                       <select  class="choix"name="choice"><br>
                           <option value="1">1</option>
                           <option value="2">2</option>
                           <option value="3">3</option>
                           <option value="4">4</option>
                           <option value="1">5</option>
                           <option value="2">6</option>
                           <option value="3">7</option>
                           <option value="4">8</option>
                           <option value="3">9</option>
                           <option value="4">10</option>
                       </select><br>
                       <textarea type="text" rows="3" name="desc" placeholder="Description de l'équipement"></textarea><br><br>
                       <img class="addimg" src="img/adds.png" alt="alt"/><input type="submit" value="Ajouter" class="ajout" />
               </form>
            </div>
            <div class="drop drop-1"></div></div><div class="drop drop-2"></div><div class="drop drop-3"></div><div class="drop drop-4"></div>
            <div class="drop drop-5"></div></div><div class="drop drop-6"></div><div class="drop drop-7"></div><div class="drop drop-8"></div>
            <div class="drop drop-9"></div></div><div class="drop drop-10"></div><div class="drop drop-11"></div><div class="drop drop-12"></div>
            <div class="drop drop-13"></div></div><div class="drop drop-14"></div><div class="drop drop-15"></div><div class="drop drop-16"></div>
        </div>
    </body>
</html>