<%-- 
    Document   : Stock.jsp
    Created on : 19 juil. 2022, 01:22:01
    Author     : Havila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
        <style>
             body
            {
                background-color: #092434;
                display: flex;
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
                .drop-1
           {
               height: 250px; width: 250px; top: 50px; left: 0px;
               
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
 
           .logoifri
           {
               position: absolute;
               width: 400px;
               height:400px;
               background-size: cover;
               border-radius: 100%;
               
           }
           p
           {
               font-family: Cambria;
               font-size: 4rem;
               color: white;
               text-transform: uppercase;
               letter-spacing: .2em;
               display: inline-block;
               border: 4px double rgba(255,255,255,.25);
               border-width: 4px 0;
               padding: 1.5em 0em;
               position: absolute;
               top: 15%;
               left: 10%;
               width: 15em;
              
               span
               {
               letter-spacing: 0;
               padding: .25em 0 .200em;
               display: block;
               margin: 0 auto;
               text-shadow: 0 0 80px rgba(255,255,255,.5);
               background: url(img/ccc.png) repeat-y;
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              -webkit-animation: aitf 80s linear infinite;
              -webkit-transform: translate3d(0,0,0);
              -webkit-backface-visibility: hidden;
              }
            }
           @-webkit-keyframes aitf {
           0% { background-position: 0% 50%; }
           100% { background-position: 100% 50%; }
           }
           
        </style>
    </head>
    <body>
        <% if(session.getAttribute("employe")==null) response.sendRedirect("index.jsp");%>
         <%@include file="EnteteAccueil.jsp" %>
         <div class="LAlloue">
             <div id="Circle">
                 <p>Bienvenue sur le site <br>de Gestion du parc <br>
                      <span>
                          informatique d'IFRI
                      </span>
                 </p>
           
             </div>
            
             <div class="drop drop-1"></div><div class="drop drop-2"></div><div class="drop drop-3"></div><div class="drop drop-4"></div>
             <div class="drop drop-5"></div><div class="drop drop-6"></div><div class="drop drop-7"></div><div class="drop drop-8"></div>
             <div class="drop drop-9"></div><div class="drop drop-10"></div><div class="drop drop-11"></div><div class="drop drop-12"></div>
             <div class="drop drop-13"></div><div class="drop drop-14"></div><div class="drop drop-15"></div><div class="drop drop-16"></div>
         </div>
    </body>
</html>
