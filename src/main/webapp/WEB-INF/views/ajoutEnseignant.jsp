<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.1.0.59861 -->
        <meta charset="utf-8">
        <title>AJOUT ENSEIGNANT</title>
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
                    <a href="#" > ESPACE ADMINISTRATION </a>
                </h1>
                <h2 class="art-slogan" data-left="71.17%">Administrateur : ${ajoutEnseignant.adminName}</h2>

                <div id="art-flash-area">
                    <div id="art-flash-container">
                       
                    </div>
                </div>

            </header>
            <nav class="art-nav">
                <ul class="art-hmenu"><li><a href="#" class="">Home</a></li><li><a href="consulterSuggestion" class="">Les Suggestions</a></li><li><a href="annuaireEnseignant" class="">Enseignants</a></li><li><a href="annuaireEtudiant" class="">Etudiants</a></li><li><a href="deconnecterEnseignant">Deconnexion</a></li></ul> 
            </nav>
            <div class="art-sheet clearfix">
                <div >
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-sidebar1">
                                 <div class="art-block clearfix">
                                    <div class="art-blockheader">
                                        <h3 class="t">PUB</h3>
                                    </div>
                                    <div class="art-blockcontent"><ul><li><span style="font-size: 11px;"><span style="line-height: 16px; font-family: Georgia; color: rgb(255, 255, 255);">quelques conseil pour bien reussir&nbsp;</span><br></span></li><li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Bons conseils pour bien preparer et reussir son annee scolaire.</span></li><li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Resultats et classements des Jeux FENASCO 2015</span></li>
                                            <li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Calendrier des examens et Concours 2016</span>
                                            </li>
                                            <li><span style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Classement des meilleurs etablissements Universitaires</span>
                                        </ul><p>


                                        </p></div>
                                </div>
                                <div class="art-block clearfix">
                                    <div class="art-blockheader">
                                        <h3 class="t">NEWS</h3>
                                    </div>
                                    <div class="art-blockcontent">
                                        <ul>
                                            <li><span style="line-height: 16px; color: rgb(255, 255, 255); font-family: Georgia; font-size: 14px;">La prochaine rentree scolaire est prevue pour le lundi 01 Octobre 2016&nbsp;</span></li>
                                            <li><span style="line-height: 16px; color: rgb(255, 255, 255); font-family: Georgia; font-size: 11px;">Resultats des examens de 2016&nbsp;</span></li>
														  
															
                                        </ul></div>
                                </div>
                            </div>
                            <div class="art-layout-cell art-content"><article class="art-post art-article">
                                <div class="art-postcontent art-postcontent-0 clearfix">
                                        <p><span style="color: rgb(255, 255, 255); font-size: 16px;">
										
												<f:form modelAttribute="ajoutEnseignant" method="post" action="ajoutEnseignantE">

												<fieldset class="input" style="border: 0 none;">
												<p> Les champs avec  le symbole <span class="obligatoire">*</span> devant sont obligatoires ....</p>		
															
													<table border="5" style="width: 100%">
														<caption>AJOUT D'UN ENSEIGNANT <span class="obligatoireGreen">${ajoutEnseignant.reponse}</span></caption>
														<tr>
															<td><p id="form-login-username">
																	<label for="modlgn_username">Nom :<span class="obligatoire">*</span></label>
																</p></td>
															<td><f:input path="nomE" class="inputbox"
																	style="width:100%" /> <f:errors path="nomE"></f:errors>
															</td>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Prenom :</label>
																</p>
															</td>
															<td><f:input path="prenomE" class="inputbox"
																	style="width:100%" /> <f:errors path="prenomE"></f:errors>
															</td>
														</tr>

														<tr>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Email :<span class="obligatoire">*</span></label><br />
																</p>

															</td>
															<td><f:input path="emailE" class="inputbox"
																	style="width:100%" /> <f:errors path="emailE"></f:errors>
															</td>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Sexe</label>
																</p>
															</td>
															<td><f:input path="sexe" class="inputbox"
																	style="width:100%" /></td>
														</tr>
														<tr>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Date Naissance</label>
																</p>
															</td>
															<td>
															<f:input path="datenaissance"  class="inputbox"
																	style="width:100%"/>
															</td>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Nationalite</label><br />
																</p>
															</td>
															<td><f:input path="nationalite" class="inputbox"
																	style="width:100%" /> <f:errors path="nationalite"></f:errors>
															</td>
														</tr>

														<tr>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Region d'origine</label>
																</p>
															</td>
															<td><f:input path="region" class="inputbox"
																	style="width:100%" /> <f:errors path="region"></f:errors>
															</td>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Departement
																		d'origine</label>
																</p>
															</td>
															<td><f:input path="departement" class="inputbox"
																	style="width:100%" /> <f:errors path="departement"></f:errors>
															</td>
														</tr>

														<tr>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Statut Marital</label><br />
																</p>
															</td>
															<td><f:input path="statut" class="inputbox"
																	style="width:100%" /> <f:errors path="statut"></f:errors>
															</td>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Profession</label><br />
																</p>
															</td>
															<td><f:input path="profession" class="inputbox"
																	style="width:100%" /> <f:errors path="profession"></f:errors>
															</td>
														</tr>

														<tr>
															<td>
															<p id="form-login-username">
																	<label for="modlgn_username">Mot de Passe <span class="obligatoire">*</span></label><br />
																</p> </td>
															<td>
															<f:password path="motpasseE" style="width:100%;"/>
															</td>
															<td>
															<p id="form-login-username">
																	<label for="modlgn_username">Code <span class="obligatoire">*</span></label><br />
																</p> 
															</td>
															<td>
															<f:input path="codeE" class="inputbox" style="width:100%;"/>
															</td>

														</tr>
														<tr>
														<td>
														<p id="form-login-username">
																	<label for="modlgn_username">Role </label><br />
																</p> 
														</td>
														<td>
														<f:input path="role" class="inputbox" style="width:100%;"/>
														
														</td>
														<td>
														
														</td>
														<td>
														<table border="5" style="width: 100%">
														<tr><td><f:button >Save</f:button></td><td><f:button >Cancel</f:button></td></tr>
														</table>
														</td>
														
														</tr>
													</table>


												</fieldset>

											</f:form> 
											
											
                                               
                                            </span></p>
                                        <p><span style="color: rgb(255, 255, 255); font-size: 16px;"><br></span></p>
                                        <p>
														<table border="5" style="width: 100%"> 
														<tr> <td> Ajouter un Etudiant Ici </td><td> <f:form modelAttribute="ajoutEtudiant" method="post" action="ajoutEt"><input type="submit" value="Ajouter Etudiant"/></f:form></td>        </tr>
														
														</table>				
                                         </p>





                               </div> </article>
                               
                         
                               
                               
                               
                                </div>
                                

                               
                               </div>
                        </div>
                        
                        
                        
                        
                    </div>
                </div>
   
                <footer class="art-footer">
                    <p><a href="#" style="line-height: 32px;" title="Nous rejoindre sur Facebook" class="art-facebook-tag-icon">Facebook</a> | <a href="#" style="line-height: 32px;" title="Nous rejoindre sur Twitter" class="art-twitter-tag-icon">Twitter</a> | <a href="#" style="line-height: 32px;" class="art-rss-tag-icon">RSS</a></p>
                    <p>Copyright \A9 2016. All Rights Reserved by M1 Computer Sciences Students.</p>
                </footer>
                </div>




                </body></html>