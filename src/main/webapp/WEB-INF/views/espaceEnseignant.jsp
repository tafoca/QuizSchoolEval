<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.1.0.59861 -->
        <meta charset="utf-8">
        <title>ESPACE ENSEIGNANT</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="resources/css/style.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="resources/css/style.ie7.css" media="screen" /><![endif]-->
        <link rel="stylesheet" href="resources/css/style.responsive.css" media="all">
        <link rel="shortcut icon" href="resources/images/GradCap.ico">
        <link rel="stylesheet" href="resources/css/styleFormulaire.css" media="all">


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
                <ul class="art-hmenu"><li><a href="#" class="">Home</a></li><li><a href="monEspaceEn" class="active">Consulter Profil</a></li><li><a href="programmerEvaluation" class="active">Programmer Evaluation</a></li><li><a href="consulterSuggestion" class="">Les Suggestions</a></li><li><a href="inscriptionEnseignant" class="">Inscription</a></li><li><a href="annuaireEnseignant" class="">Nos Enseignants</a></li><li><a href="DeconnecterEnseignant">Deconnexion</a></li></ul> 
            </nav>
            <div class="art-sheet clearfix">
                <div class="art-layout-wrapper">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-sidebar1"><div class="art-block clearfix">
                                    <div class="art-blockheader">
                                        <h3 class="t">PUB</h3>
                                    </div>
                                    <div class="art-blockcontent"><ul><li><span style="font-size: 11px;"><span style="line-height: 16px; font-family: Georgia; color: rgb(255, 255, 255);">quelques conseil pour bien reussir&nbsp;</span><br></span></li><li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Bons conseils pour bien preparer et reussir son annee scolaire.</span></li><li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Resultats et classements des Jeux FENASCO 2015</span></li>
                                            <li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Calendrier des examens et Concours 2016</span>
                                            </li>
                                            <li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Classement des meilleurs etablissements Universitaires</span>
                                        </ul><p>


                                        </p></div>
                                </div><div class="art-block clearfix">
                                    <div class="art-blockheader">
                                        <h3 class="t">NEWS</h3>
                                    </div>
                                    <div class="art-blockcontent">
                                        <ul>
                                            <li><span style="line-height: 16px; color: rgb(255, 255, 255); font-family: Georgia; font-size: 14px;">La prochaine rentree scolaire est prevue pour le lundi 02 Octobre 2016&nbsp;</span></li>
                                            <li><span style="line-height: 16px; color: rgb(255, 255, 255); font-family: Georgia; font-size: 11px;">Resultats des examens de 2016&nbsp;</span></li>

                                        </ul></div>
                                </div>
                            </div>
                            <div class="art-layout-cell art-content"><article class="art-post art-article">


                                    <div class="art-postcontent art-postcontent-0 clearfix">
                                        <p><span style="color: rgb(255, 255, 255); font-size: 16px;"><br>
										
										<f:form modelAttribute="profilConnecteur" method="post">
										</f:form>
										
										<table style="color: rgb(255, 255, 255); font-size: 16px; align:center;" border="1">
										
										
										<tr>
										<td> Nom :      </td>
										<td>${connectionForm.enseignant.nomenseignant} </td>
										</tr>
										<tr>
										<td> Prenom :      </td>
										<td>${connectionForm.enseignant.prenomenseignant} </td>
										</tr>
										
										
										
										<tr>
										<td> Email :      </td>
										<td>${connectionForm.enseignant.getEmail()} </td>
										</tr>
										
									
										
										<tr>
										<td>Code Enseignant :       </td>
										<td>${connectionForm.pseudo} </td>
										</tr>
										<tr>
										<td>Mot de Passe :       </td>
										<td>${connectionForm.enseignant.getMotpasse()} </td>
										</tr>
										
										<tr>
										<td> Type Compte :      </td>
										<td>${connectionForm.tipeConnection} </td>
										</tr>
										
										
										</table>



                                               
                                            </span></p>
                                        <p><span style="color: rgb(255, 255, 255); font-size: 16px;"><br>

                                            </span></p>






                               </div> </article> </div></div>
                        </div>
                    </div>
                </div><footer class="art-footer">
                    <p><a href="#" style="line-height: 32px;" title="Nous rejoindre sur Facebook" class="art-facebook-tag-icon">Facebook</a> | <a href="#" style="line-height: 32px;" title="Nous rejoindre sur Twitter" class="art-twitter-tag-icon">Twitter</a> | <a href="#" style="line-height: 32px;" class="art-rss-tag-icon">RSS</a></p>
                    <p>Copyright \A9 2016. All Rights Reserved by M1 Computer Sciences Students.</p>
                </footer>
                </div>




                </body></html>