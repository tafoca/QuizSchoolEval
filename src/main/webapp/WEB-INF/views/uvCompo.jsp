<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.1.0.59861 -->
        <meta charset="utf-8">
        <title>Code de la matiere</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="resources/css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="resources/css/style.ie7.css" media="screen" /><![endif]-->
        <link rel="stylesheet" href="resources/css/style.responsive.css" media="all">
        <link rel="shortcut icon" href="resources/images/GradCap.ico">
        <link rel="stylesheet" href="resources/css/styleFormulaire.css" media="all">
        <link rel="stylesheet" href="resources/css/stylePerso.css" media="all">


        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/script.js"></script>
        <script src="resources/js/script.responsive.js"></script>



    </head>
    <body>
        <div id="art-main">
            <header class="art-header">


                <div class="art-shapes">
                    <div class="art-object371387124" data-left="0%"></div>

                </div>
                <h1 class="art-headline" data-left="79.25%">
                    <a href="#">GESTION &nbsp;DES EVALUATIONS</a>
                </h1>
                <h2 class="art-slogan" data-left="71.17%">Rapide, Fiable et Efficace!!!</h2>




                <div id="art-flash-area">
                    <div id="art-flash-container">
                       
                    </div>
                </div>

            </header>
            <nav class="art-nav">
                <ul class="art-hmenu"><li><a href="#" class="">Home</a></li><li><a href="evaluationProgrammer" class="active">Evaluation Programmer</a></li><li><a href="consulterSuggestion" class="">Les Suggestions</a></li><li><a href="deconnecterEtudiant">Deconnexion</a></li></ul> 
            </nav>
            <div class="art-sheet clearfix">
                <div class="art-layout-wrapper">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-sidebar1"><div class="art-block clearfix">
                                    <div class="art-blockheader">
                                        <h3 class="t">IMPORTANT</h3>
                                    </div>
                                    <div class="art-blockcontent"><ul>
                                            <li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;" class="obligatoire">Entrer le code de la Matiere <br/>puis valider ou <br/>effacer en cas d'erreur</span>
                                            </li>
                                            
                                        </ul><p>


                                        </p></div>
                                </div>
                            </div>
                            <div class="art-layout-cell art-content"><article class="art-post art-article">


                                    <div class="art-postcontent art-postcontent-0 clearfix">
                                        <p align="right" style="width:100%"><span style="color: rgb(255, 255, 255); font-size: 16px;"><br>
										
										<f:form modelAttribute="matiereForm" method="post" action="composerM" >
										
										<table style="color: rgb(255, 255, 255); font-size: 16px; align:right;" border="5" style="width:100%">
										<caption>Matiere </caption>
										
										<tr>
										<td> Code de l'UV : <span class="obligatoire">*</span>     </td>
										<td style="width:80%;">
										<f:select path="codeUv">
										<c:forEach items="${ sessionBeanEtudiant.listeMSession}" var="matiere" varStatus="stat">
										<f:option value="${matiere}" style="width:100%;height:10px;padding:5px;">${matiere}</f:option>
										</c:forEach>
										</f:select>
										 </td>
										</tr>
										<tr>
										<td> </td>
										<td><f:button class="art-button" style="width:30%">Valider</f:button> </td>
										</tr>
										
										
										
									
										
										</table>
										
										</f:form>



                                               
                                            </span></p>
                                        <p><span style="color: rgb(255, 255, 255); font-size: 16px;"><br>

                                            </span></p>






                               </div> </article> </div></div>
                        </div>
                    </div>
                </div>
                </div>




                </body></html>