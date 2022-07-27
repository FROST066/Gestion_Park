<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>Page de Connexion</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>


        .part1
        {
            height: 100vh;
            width: 30%;
            background-image:url("img/e.JPG");

        }

        .part2
        {
            height: 100vh;
            width: 70%;
            background: linear-gradient(20deg,#0058D2,#00B1C6, #006666);
            display: flex;
            align-items: center;
            justify-content: center;

        }
        body
        {
            margin: 0;
            padding: 0;
            font-family: Courier new;
            display: flex;
            align-items: center;
            justify-content: center;
            background:white;
            position: relative;
        }
        .conteneur
        {
            position: relative;
        }
        form
        {
            background: rgba(255,255,255, .3);
            padding: 6.5rem;
            height: 400px;
            border-radius: 20px;
            border-left: 1px solid rgba(255,255,255, .3);
            border-top: 1px solid rgba(255,255,255, .3);
            /*backdrop-filter:blur(10px);*/
            box-shadow: 20px 20px 40px -6px rgba(0, 0, 0, .2);
            text-align: center;
        }
        p
        {
            color: white;
            font-weight: 500;
            /*opacity: 0;*/
            font-size: 1.8rem;
            margin-bottom: 40px;
            text-shadow:2px 2px 4px rgba(0, 0, 0, .2);
        }
        a
        {
            text-decoration: none;
            color: #ddd;
            font-size: 18px;
        }
        a:hover
        {
            text-shadow:2px 2px 6px #00000040;
        }
        a:active
        {
            text-shadow:none;
        }
        input
        {
            background: transparent;
            border: none;
            border-left: 2px solid rgba(255,255,255, .3);
            border-top: 2px solid rgba(255,255,255, .3);
            padding: 1.2rem;
            width: 200px;
            border-radius: 50px;
            border-color: #0058D2;
            box-shadow: 20px 20px 60px rgba(0, 0, 0, .2);
            color: white;
            font-weight: 500;
            text-shadow:2px 2px 4px rgba (0, 0, 0, .2);
            transition: all .3s;
            margin-bottom: 2em;
            font-family: Courier new;
            font-size: 1em;
        }
        input:hover,
        input[type="text"]:focus,
        input[type="password"]:focus
        {
            background: rgba(255,255,255,0.1);
            box-shadow: 4px 4px 60px 8px rgba(0, 0, 0, .2);
        }
        input[type="text"]
        {
            background: url(img/pp.png) no-repeat scroll 10px 10px;
            padding-left: 70px;
            padding-right: 50px;
        }
        .button
        {
            margin-top: 10px;
            width: 150px;
            font-size: 1.2rem;
            cursor: pointer;
            background: transparent;
            border: none;
            border-left: 2px solid rgba(255,255,255, .3);
            border-top: 2px solid rgba(255,255,255, .3);
            padding: 1rem;
            width: 200px;
            border-radius: 50px;
            border-color: #0058D2;
            box-shadow: 20px 20px 60px rgba(0, 0, 0, .2);
            color: white;
            font-weight: 500;
            text-shadow:2px 2px 4px rgba (0, 0, 0, .2);
            transition: all .3s;
            margin-bottom: 0.4em;
            font-family: Courier new;


        }
        input[type="password"]
        {
            background: url(img/pw.png) no-repeat scroll 10px 10px;
            padding-left: 70px;
            padding-right: 50px;
        }
        ::placeholder
        {
            color: #fff;
            padding-left: 30px;
        }
        .drop
        {
            background: rgba(255,255,255, .3);
            border-radius: 50px;
            border-left: 1px solid rgba(255,255,255, .3);
            border-top: 1px solid rgba(255,255,255, .3);
            box-shadow: 10px 10px 60px -8px rgba(0,0,0, .2);
            position: absolute;
            transition: all 0.2s ease;
            filter:blur(0.5px);
        }
        .drop-1
        {
            height: 100px;
            width: 100px;
            top: 0px;
            left: -130px;

        }
        .drop-2
        {
            height: 100px;
            width: 100px;
            bottom: 0px;
            right: -160px;
        }
        .drop-3
        {
            height: 55px;
            width: 55px;
            bottom: 120px;
            right: -30px;

        }
        .drop-4
        {
            height: 70px;
            width: 70px;
            top: -30px;
            right:-20px;
        }
        .drop-5
        {
            height: 40px;
            width: 40px;
            bottom:20px;
            left: 50px;

        }
        .drop-6
        {
            height: 50px;
            width: 50px;
            top: 70px;
            left: 70px;

        }
        .drop-7
        {
            height: 50px;
            width: 50px;
            bottom: 200px;
            left: -100px;
        }
        .drop-8
        {
            height: 55px;
            width: 55px;
            bottom: 20px;
            left: -85px;

        }
        .drop-9
        {
            height: 70px;
            width: 70px;
            top: 100px;
            right:-80px;
        }
        .drop-10
        {
            height: 40px;
            width: 40px;
            bottom:40px;
            right: -60px;

        }
        h3
        {
            color: white;
            font-size: 3rem;
            margin-left: 60px;
            margin-top: 100px;
            font-family:  Light Condensed;
        }
        .connect
        {
            font-size: 1.2rem;
            color: white;
            margin-left: 18px;
        }
        img
        {
            width: 160px;
            height: 100px;
            margin-top: 50px;
            margin-left: 80px;
        }
    </style>
</head>
<body>

    <div class="part1">
        <img src="img/logo2.png" alt=""/>
        <h3>Gestion<br>Du Parc<br>Informatique<br>D'IFRI</h3>
        <p class="connect">Veuillez vous connecter avec vos informations personnelles</p><br>

    </div>
    <div class="part2">
        <div class="conteneur">
            <form action="Acceuil" method="POST">
                <p><b>Bienvenue!</b></p>
                <input type="text" name="matricule" placeholder="Matricule"><br>
                <input type="password" name="mdps" placeholder="Mot de passe"><br><br>
                <input type="submit" value="Submit"  class="button"/> <br><br><br><br><br>
                <%
                    if (session.getAttribute("mpsIncorrect")!=null) 
                    //out.println("<p style=\"position: relative\"> Matricule ou mot de passe incorrect!</p>");
                  out.println(" <script> alert(\"Matricule ou mot de passe incorrect\");</script>");
                %>

                <a href="#">Mot de passe oublie?</a>
            </form>

            <div class="drop drop-1"></div><div class="drop drop-2"></div><div class="drop drop-3"></div><div class="drop drop-4"></div>
            <div class="drop drop-5"></div><div class="drop drop-6"></div><div class="drop drop-7"></div><div class="drop drop-8"></div>
            <div class="drop drop-9"></div><div class="drop drop-10"></div>
        </div>
    </div>
</body>
</html>  