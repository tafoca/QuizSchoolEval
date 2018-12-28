<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>
<!-- Created by Artisteer v4.1.0.59861 -->
<meta charset="utf-8">
<title>Espace Composition</title>
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
<link href="resources/css/bootstrap.css" rel="stylesheet" />


<script src="resources/js/jquery.js"></script>
<script src="resources/js/script.js"></script>
<script src="resources/js/script.responsive.js"></script>
<script src="resources/js/bootstrap.js"></script>




</head>
<body>
	<div id="art-main">
		<header class="art-header">


			<div class="art-shapes">
				<div class="art-object371387124" data-left="0%"><img alt="monlivre" src="resources/images/object371387124.png"></div>

			</div>
			<h1 class="art-headline" data-left="79.25%">
				<a href="#"><p class="dio">ESPACE D'EVALUATION DES ETUDIANTS</p></a>

			</h1>
			<h2 class="art-slogan" data-left="71.17%">
				<a href="#">
						<p class="diodany">${sessionBeanEtudiant.codeMatiere}:
							${ sessionBeanEtudiant.intituleMatiere }</p>
					 </a>
			</h2>




			<div id="art-flash-area">
				<div id="art-flash-container"></div>
			</div>

		</header>
		<nav class="art-nav">
			<ul class="art-hmenu">
				<li><a href="#" class="">Home</a></li>
				<li><a href="monProfilEtudiant" class="">Mon Profil</a></li>
				<li><a href="evaluationProgrammer" class="">Evaluations
						Programmer</a></li>
				<li><a href="composerMatiere" class="active">Composer une Matiere</a></li>
				
				
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
									<h3 class="t">IMPORTANT</h3>
								</div>
								<div class="art-blockcontent">




									<table border="2" style="width: 100%">
										<caption class="obligatoireY">Informations de
											L'etudiant :</caption>
										<tr>
											<td>Nom:</td>
											<td>${profilEtudiant.etudiant.getNometudiant() }</td>

										</tr>
										<tr>
											<td>Prenom:</td>
											<td>${profilEtudiant.etudiant.getPrenometudiant() }</td>
										</tr>
										<tr>
											<td>Date Naissance :</td>
											<td>${profilEtudiant.etudiant.getDatenaissance() }</td>
										</tr>
										<tr>
											<td>Matricule :</td>
											<td>${profilEtudiant.etudiant.getMatricule() }</td>
										</tr>
										<tr>
											<td>Filiere :</td>
											<td>${profilEtudiant.etudiant.getCodefiliere().getCodefiliere() }</td>
										</tr>

									</table  border="2" style="width: 100%">
									<br />
									<table>

										<th class="obligatoireG">Informations sur l'UV</th>
										<tr>
											<td>Nombre d'Heur :</td>
											<td class="obligatoireG">${profilEtudiant.nombreH }H</td>
										</tr>
										<tr>
											<td>Nombre de Questions :</td>
											<td class="obligatoireG">${profilEtudiant.nombreQ }</td>
										</tr>

									</table>
<f:form modelAttribute="questionForm">
									<table border="2" style="width: 100%;">
										<caption class="obligatoire">Compteur Temps</caption>
										<tr>
											<td>Temps ecoule<f:input path="tempsE"/></td>
																						
										</tr>
										<tr>
											<td>Temps restant<f:input path="tempsR"/></td>
											
										</tr>
									</table>
					</f:form>





									<p></p>
								</div>
							</div>
						</div>
						<div class="art-layout-cell art-content">
							<article class="art-post art-article">


								<div class="art-postcontent art-postcontent-0 clearfix">

									<div class="art-blockcontent">
										<p align="right" style="width: 100%">
											<span style="color: rgb(255, 255, 255); font-size: 16px;"><br>

												<f:form action="enregistrerPage?page=${questionForm.page}"
													modelAttribute="questionForm" method="post">
													<c:if test="${ not empty sessionBeanEtudiant.listeQPage}">
														<table border="5" style="width: 100%">
															<caption class="diodany"> QCM
																(Question a Choix Multiple)</caption>

															<tr
																style="width: 100%; height: 50px; padding: 10px !important;">
																
																<td class="diodif"><center>Libele Question</center></td>

															</tr>


															<c:forEach items="${sessionBeanEtudiant.listeQPage}" var="question"
																varStatus="statut">
																<tbody>
																	<tr>

																		

																		<td>

																			<div class="panel-group col-lg-12 ">
																				<div class="panel panel-default">
																					<div class="panel-heading">
																						<h3 class="panel-title accordion-toggle"
																							href="#q${statut.index+1}" data-toggle="collapse">${question.getLibelequestion() }</h3>
																					</div>
																					<div id="q${statut.index+1}"
																						class="panel-collapse collapse">
																						<ul class="panel-body">
																							<c:if test="${question.getNombrereponse() == 1 }">


																								<li><f:radiobuttons
																										path="questionMap[${question.getCodequestion()}]"
																										items="${ question.choixMap}" /></li>
																								<div class="col-lg-6 col-lg-offset-3">

																									<button class="btn btn-primary">valider</button>
																								</div>

																							</c:if>

																							<c:if test="${question.getNombrereponse() > 1 }">
																								<c:forEach items="${ question.choixList}"
																									var="choix" varStatus="stat">
																									<li><f:checkbox
																											path="questionMap2[${question.getCodequestion()}]"
																											value="${choix.getLibelechoix() }"
																											label="${choix.getLibelechoix() }" /></li>
																									

																								</c:forEach>
																								<div class="col-lg-6 col-lg-offset-3">

																										<button class="btn btn-primary">valider</button>
																									</div>
																							</c:if>
																						</ul>
																					</div>

																				</div>
																			</div>


																		</td>
																	</tr>
															</c:forEach>




															</tbody>








														
														
														
														
														
													
														</table>
														<br />
														<br />
													</c:if>
															<c:if test="${sessionBeanEtudiant.connecter=='OUI'}">
																
														<span ><input type="submit" value="Enregistrer page" class="lidio" /><span class="lidio">
														<a href="terminerEvaluation"> Terminer</a></span></span>
														</c:if>
													
												</f:form> 
												
														</span>
														<div>
														<c:if test="${not empty questionForm }">
														
														<c:forEach begin="1" end="${questionForm.nombrePage }" var="p">
														<c:choose>
														<c:when test="${p==questionForm.page }">
														<span class="page"> ${p}</span>
														</c:when>
														<c:otherwise>
														<span class="page">
														<a href="pageSuivante?page=${p}"> ${p}</a></span>
														</c:otherwise>
														</c:choose>
														</c:forEach>
														
														</c:if>
														
														<c:if test="${not empty questionForm}">
														<span class="obligatoireDIO">
														<c:out value="${sessionBeanEtudiant.resltCompo }" ></c:out>
														</span>
														</c:if>
														</div>
										</p>
									</div>

									<p>
										<span style="color: rgb(255, 255, 255); font-size: 16px;"><br>

										</span>
									</p>






								</div>
							</article>
						</div>
					</div>
				</div>
			</div>
		</div>
		<footer class="art-footer">

			<p>Copyright 2016. All Rights Reserved by M1 Computer Sciences
				Students.</p>
		</footer>
	</div>




</body>
</html>