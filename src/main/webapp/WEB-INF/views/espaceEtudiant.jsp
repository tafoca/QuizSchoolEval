<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>
<!-- Created by Artisteer v4.1.0.59861 -->
<meta charset="utf-8">
<title>ESPACE ETUDIANT</title>
<meta name="viewport"
	content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

<!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<link rel="stylesheet" href="resources/css/style.css" media="screen">
<!--[if lte IE 7]><link rel="stylesheet" href="resources/css/style.ie7.css" media="screen" /><![endif]-->
<link rel="stylesheet" href="resources/css/style.responsive.css"
	media="all">
<link rel="shortcut icon" href="resources/images/GradCap.ico">
<link rel="stylesheet" href="resources/css/styleFormulaire.css"
	media="all">
<link rel="stylesheet" href="resources/css/stylePerso.css" media="all">


<script src="resources/js/jquery.js"></script>
<script src="resources/js/script.js"></script>
<script src="resources/js/script.responsive.js"></script>



</head>
<body>
	<div id="art-main">
		<header class="art-header">


			<div class="art-shapes">
				<div class="art-object371387124" data-left="0%">
					<img alt="monlivre" src="resources/images/object371387124.png">
				</div>

			</div>
			<h1 class="art-headline" data-left="79.25%">
				<a href="#">GESTION &nbsp;DES EVALUATIONS</a>
			</h1>
			<h2 class="art-slogan" data-left="71.17%">Rapide, Fiable et
				Efficace!!!</h2>




			<div id="art-flash-area">
				<div id="art-flash-container"></div>
			</div>

		</header>
		<nav class="art-nav">
			<ul class="art-hmenu">
				<li><a href="#" class="">Home</a></li>
				<li><a href="monProfilEtudiant" class="active">Mon Profil</a></li>

				<li class="lidio">Composer
					<ul>
						<li><a href="composerMatiere" class="">Composer une
								Matiere</a></li>
						<li><a href="evaluationProgrammer" class="">Matieres
								Programmer</a></li>
					</ul>
				</li>

				<li class="lidio">Suggestions
					<ul>
						<li><a href="espaceSuggestion" class="">Faire une
								Suggestion</a></li>
						<li><a href="consulterSuggestion" class="">Consulter les
								Suggestions</a></li>
					</ul>
				</li>

				<li class="lidio">Nos Listes
					<ul>
						<li><a href="annuaireFiliere" class="">Liste des Filieres</a></li>
						<li><a href="annuaireMatiere" class="">Liste des Matieres</a></li>
						<li><a href="annuaireEtudiant" class="">Liste des
								Etudiants</a></li>
						<li><a href="annuaireEnseignant" class="">Liste des
								Enseignants</a></li>
					</ul>
				</li>




				<li><a href="deconnecterEtudiant">Deconnexion</a></li>
			</ul>
		</nav>
		<div class="art-sheet clearfix">
			<div class="art-layout-wrapper">
				<div class="art-content-layout">
					<div class="art-content-layout-row">
						<div class="art-layout-cell art-sidebar1">
							<div class="art-block clearfix">
								<div class="art-blockheader">
									<h3 class="t">
										<blink>Autres </blink>
									</h3>
								</div>
								<div class="art-blockcontent">
									<ul class="obligatoireY">
										<li><a href="consulterSuggestion" class="obligatoireY">Consulter
												les Suggestions</a></li>
										<li><a href="evaluationProgrammer" class="obligatoireY">Matieres
												Programmer</a></li>
										<li><a href="annuaireMatiere" class="obligatoireY">Nos
												Matieres</a></li>
										<li><a href="annuaireFiliere" class="obligatoireY">Nos
												Filieres</a></li>
										<li><a href="annuaireEnseignant" class="obligatoireY">Nos
												Enseignants</a></li>
										<li><a href="espaceSuggestion" class="obligatoireY">Faire
												une Suggestion</a></li>
										<br />
										<br />

										<li><span style="font-size: 11px;"><span
												style="line-height: 16px; font-family: Georgia; color: rgb(255, 255, 255);">quelques
													conseil pour bien reussir&nbsp;</span><br></span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Bons
												conseils pour bien preparer et reussir son annee
												accademique.</span></li>


										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Classement
												des meilleurs etablissements Universitaires</span>
									</ul>
									<p></p>
								</div>
							</div>
							<div class="art-block clearfix">
								<div class="art-blockheader">
									<h3 class="t">NEWS</h3>
								</div>
								<div class="art-blockcontent">
									<ul>

										<li><span
											style="line-height: 16px; color: rgb(255, 255, 255); font-family: Georgia; font-size: 11px;">Resultats
												des examens de 2016&nbsp;</span></li>

									</ul>
								</div>
							</div>
						</div>
						<div class="art-layout-cell art-content">
							<div></div>
							<article class="art-post art-article">


								<div class="art-postcontent art-postcontent-0 clearfix">
									<p>
										<span style="color: rgb(255, 255, 255); font-size: 16px;">

											<f:form modelAttribute="profilEtudiantForm" method="post"
												action="updateProfil">


												<fieldset class="input" style="border: 0 none;">



													<table border="5" style="width: 100%">
														<caption>INFORMATIONS PERSONNELLES</caption>
														<tr>
															<td><p id="form-login-username">
																	<label for="modlgn_username">Nom :</label>
																</p></td>
															<td><f:input path="nom" class="inputbox"
																	style="width:100%" /> <f:errors path="nom"></f:errors>
															</td>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Prenom :</label>
																</p>
															</td>
															<td><f:input path="prenom" class="inputbox"
																	style="width:100%" /> <f:errors path="prenom"></f:errors>
															</td>
														</tr>

														<tr>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username">Email</label><br />
																</p>

															</td>
															<td><f:input path="email" class="inputbox"
																	style="width:100%" /> <f:errors path="email"></f:errors>
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
															<td><f:input path="datenaissance" class="inputbox"
																	style="width:100%" placeholder="dd/MM/yyyy" /> <f:errors
																	path="datenaissance"></f:errors></td>
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
															<td></td>
															<td><f:button class="art-button">Update</f:button></td>
															<td></td>
															<td><f:button class="art-button">Cancel</f:button></td>

														</tr>
													</table>


													<table border="5" style="width: 100%">

														<caption>INFORMATIONS SUR LA FILIERE</caption>
														<tr>
															<td>
																<p id="form-login-username">
																	<label for="modlgn_username"> Code de la
																		Filiere</label>
																</p>
															</td>
															<td style="display: inline-block; margin: 5px"><f:input
																	path="filiere" class="inputbox" style="width:100%" />
																<f:errors path="filiere"></f:errors></td>
															<td style="margin: 5px">
																<p id="form-login-username">
																	<label for="modlgn_username"> Intitule de
																		Filiere</label><br />
																</p>
															</td>
															<td style="display: inline-block; margin: 5px"><f:input
																	path="filiereNom" class="inputbox"
																	style="height:100%;width:100%" /> <f:errors
																	path="filiereNom"></f:errors></td>
														</tr>
													</table>
												</fieldset>

											</f:form> <f:form modelAttribute="profilEtudiantForm"
												action="modifierPasseE" method="post">

												<table border="5" class="inputbox" style="width: 100%">
													<caption>
														<span style="color: red;">MODIFIER VOTRE MOT DE
															PASSE</span>
													</caption>

													<tr>
														<td>
															<p>
																<label for="modlgn_username">Nouveau Mot de
																	Passe</label>

															</p>
														</td>
														<td><f:password path="newMotpasse"
																style="height:100%;width:100%" />
													</tr>
													<tr>
														<td>
															<p>
																<label for="modlgn_username">Confirmer Mot de
																	Passe</label>

															</p>
														</td>
														<td><f:password path="newMotpasse1"
																style="height:100%;width:100%" /> <c:if
																test="${profilEtudiantForm.newMotpasse == profilEtudiantForm.newMotpasse1 }">
																<f:label path="juste"></f:label>
																<td><f:button class="art-button">Valider</f:button></td>
															</c:if> <c:if
																test="${profilEtudiantForm.newMotpasse != profilEtudiantForm.newMotpasse1 }">
																<f:label path="juste">${profilEtudiantForm.faux }</f:label>
															</c:if></td>
													</tr>
													<tr>
														<td></td>

													</tr>



												</table>

											</f:form>
										</span>
									</p>
								</div>
							</article>

						</div>

					</div>
				</div>
				<footer class="art-footer">
					<p>
						<a href="#" style="line-height: 32px;"
							title="Nous rejoindre sur Facebook" class="art-facebook-tag-icon">Facebook</a>
						| <a href="#" style="line-height: 32px;"
							title="Nous rejoindre sur Twitter" class="art-twitter-tag-icon">Twitter</a>
						| <a href="#" style="line-height: 32px;" class="art-rss-tag-icon">RSS</a>
					</p>
					<p>Copyright \A9 2016. All Rights Reserved by M1 Computer
						Sciences Students.</p>
				</footer>
			</div>
		</div>
	</div>
</body>
</html>