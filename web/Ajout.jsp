<%-- 
    Document   : ListeStock.jsp
    Created on : 19 juil. 2022, 01:14:33
    Author     : Havila
--%>
<%@page  contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="ordinateur.Ordinateur" %>
<%@page import="memoire.Memoire" %>
<%@page import="logiciel.Logiciel" %>
<%@page import="autres.Autres" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout</title>
        <style>
            body
            {
                background-color:#092434;
            }

            .Liste
            {
                background-color:#092434;
                margin-top:100px;
                width: 95%;
                position: absolute;
                display: flex;
                align-items: center;
                justify-content: center;
                margin-left: 30px;
            }
            h1
            {
                color: white;
                text-align: center;
                margin-top: 20px;

            }
            td
            {
                color: white;
                font-size: 1.3rem;
                width: 380px;
                text-align: center;
                font-family: Times new roman;
                border: 2px solid white;
                padding: 10px;
                cursor: pointer;
            }
            tr
            {
                border: 2px solid white;
                padding: 10px;

            }

            table
            {
                border-collapse: collapse;


            }
            .tab1
            {
                margin-top: -100px;
            }
            .categorie
            {
                border: none;
                width: 500px;
                font-size: 1.7rem;
                color:#00B1C6;
            }
            img
            {
                margin-bottom: -15px;
                padding-left: 12px;
            }
            .drop-1
            {

                height: 200px;
                width: 200px;
                top: 60px;
                left: 0px;

            }
            .drop-2
            {
                height: 100px;
                width: 100px;
                bottom: 20px;
                left: 200px;

            }
            .drop-3
            {
                height: 55px;
                width: 55px;
                bottom: 50px;
                right: 60px;

            }
            .drop-4
            {
                height: 70px;
                width: 70px;
                top: 90px;
                right:100px;
            }
            .drop-5
            {
                height: 203px;
                width: 203px;
                bottom:200px;
                left: 400px;

            }
            .drop-6
            {
                height: 50px;
                width: 50px;
                top: 100px;
                left: 350px;

            }
            .drop-7
            {
                height: 50px;
                width: 50px;
                top: 450px;
                left: 150px;
            }
            .drop-8
            {
                height: 80px;
                width: 80px;
                top: 230px;
                right: 130px;

            }

            .drop-10
            {
                height: 200px;
                width: 200px;
                bottom: 50px;
                right: 400px;

            }
            .drop-11
            {
                height: 70px;
                width: 70px;
                top: 90px;
                right:100px;
            }
            .drop-12
            {
                height: 80px;
                width: 80px;
                bottom:200px;
                right: 320px;

            }
            .drop-13
            {
                height: 150px;
                width: 150px;
                top: 100px;
                right:350px;

            }
            .drop-14
            {
                height: 50px;
                width: 50px;
                top: 350px;
                right: 20px;
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
            .button
            {

                font-size: 1rem;
                cursor: pointer;
                background: #00B1C6;
                border: 2px solid rgba(255,255,255, .3);
                width: 100px;
                border-radius: 50px;
                box-shadow: 20px 20px 60px ;
                color: white;
                font-weight: 300;
                text-shadow:2px 2px 4px;
                transition: all .3s;
                font-family: Cambria;
            }
            .secours
            {
                font-size: 15px;
                color: black;
            }
        </style>
    </head>

    <body>
        <%@include file="EnteteAccueil.jsp" %>
        <a class="secours" href="/WebApp/Acceuil">Copyrigth</a>
        <h1>Ajouter un equipement au Stock</h1><br>
        <div class="Liste">
            <div class=" tab ">
                <table class="tab1" >
                    <tr ><td class="categorie" colspan="8" ><b>Ordinateurs</b><img src="img/ordi.png"/></td></tr>
                    <tr>
                        <td>Nom</td>
                        <td>Marque</td>
                        <td>Processeur</td>
                        <td>Ram</td>
                        <td>Rom</td>
                        <td>Vitesse</td>
                        <td>Acheter</td>
                    </tr>
                    <c:forEach var="row" items="${Ordinateurs}">
                        <tr>
                            <td>${row.getNom()}</td>
                            <td>${row.getMarque()}</td>
                            <td>${row.getProcesseur()}</td>
                            <td>${row.getRam()}</td>
                            <td>${row.getRom()}</td>
                            <td>${row.getVitesse()}</td>
                            <td><a class="button" href="/WebApp/Ajout?categorie=ordinateur&id=${row.getIdOrdinateur()}" >Acheter</a></td>
                        </tr>
                    </c:forEach>
                </table><br><br><br>

                <table >
                    <tr ><td class="categorie"  colspan="8" ><b>Logiciels</b><img src="img/ps.png"/></td></tr>
                    <tr>
                        <td>Nom du logociel</td>
                        <td>Type</td>
                        <td>Version</td>
                        <td>Acheter</td>
                    </tr>
                    <c:forEach var="row" items="${Logiciels}">
                        <tr>
                            <td><c:out value="${row.getNomLogiciel()}" /></td>
                            <td><c:out value="${row.getType()}" /></td>
                            <td><c:out value="${row.getVersion()}" /></td>
                            <td><a class="button" href="/WebApp/Ajout?categorie=logiciel&id=${row.getIdLogiciel()}" >Acheter</a></td>
                        </tr>

                    </c:forEach>
                </table><br><br><br>

                <table >
                    <tr ><td class="categorie"  colspan="8" ><b>Mémoires</b><img src="img/usb.png"/></td></tr>
                    <tr>
                        <td>Nom</td>
                        <td>Capacite</td>
                        <td>Acheter</td>
                        <c:forEach var="row" items="${Memoires}">
                        <tr>
                            <td><c:out value="${row.getNomMemoire()}" /></td>
                            <td><c:out value="${row.getCapacite()}" /></td>
                            <td><a class="button" href="/WebApp/Ajout?categorie=memoire&id=${row.getIdMemoire()}" >Acheter</a></td>
                        </tr>
                    </c:forEach>
                </table><br><br><br>

                <table >
                    <tr ><td class="categorie"  colspan="8" ><b>Autres</b><img src="img/usb.png"/></td></tr>
                    <tr>
                        <td>Nom</td>
                        <td>Description</td>
                        <td>Acheter</td>
                        <c:forEach var="row" items="${Autres}">
                        <tr>
                            <td><c:out value="${row.getNom() }" /></td>
                            <td><c:out value="${row.getDescription()}" /></td>
                            <td><a class="button" href="/WebApp/Ajout?categorie=autre&id=${row.getIdAutres()}" >Acheter</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div class="drop drop-1"></div><div class="drop drop-2"></div><div class="drop drop-3"></div><div class="drop drop-4"></div>
        <div class="drop drop-5"></div><div class="drop drop-6"></div><div class="drop drop-7"></div><div class="drop drop-8"></div>
        <div class="drop drop-9"></div><div class="drop drop-10"></div><div class="drop drop-11"></div><div class="drop drop-12"></div>
        <div class="drop drop-13"></div><div class="drop drop-14"></div><div class="drop drop-15"></div><div class="drop drop-16"></div>
    </body>
</html>
