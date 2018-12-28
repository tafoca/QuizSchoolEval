<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>
<!-- Created by Artisteer v4.1.0.59861 -->
<meta charset="utf-8">
<title>espace suggestion etudiant</title>
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
				<div class="art-object371387124" data-left="0%"></div>

			</div>
			<h1 class="art-headline" data-left="79.25%">
				<a href="#">ESPACE &nbsp;DES SUGGESTIONS</a>
			</h1>
			<h2 class="art-slogan" data-left="71.17%">Vos propos, Nos
				idees!!!</h2>




			<div id="art-flash-area">
				<div id="art-flash-container"></div>
			</div>

		</header>
		<nav class="art-nav">
			<ul class="art-hmenu">
				<li><a href="#" class="active">Home</a></li>
				<li><a href="evaluationProgrammer" class="active">Evaluation
						Programmer</a></li>
				<li><a href="consulterSuggestion" class="active">Consulter Les Suggestions</a></li>
				<li><a href="deconnecterEtudiant" class="active">Deconnexion</a></li>
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
									<ul class="obligatoireG">
										<li><a href="#" class="">Home</a></li>
										<li><a href="evaluationProgrammer" class="obligatoireY">Evaluations
												Programmer</a></li>

										<li><a href="annuaireFiliere" class="obligatoireY">Nos
												Filieres</a></li>
										<li><a href="annuaireMatiere" class="obligatoireY">Nos
												Matieres</a></li>
										<li><a href="annuaireEnseignant" class="obligatoireY">Nos
												Enseignants</a></li>


									</ul>
									<p></p>
								</div>
							</div>
						</div>
						<div class="art-layout-cell art-content">
							<article class="art-post art-article">


								<div class="art-postcontent art-postcontent-0 clearfix">
									<p align="right" style="width: 100%">
										<span style="color: rgb(255, 255, 255); font-size: 16px;"><br>

											<f:form modelAttribute="suggestionForm" method="post"
												action="suggererEtudiant">


												<table
													style="color: rgb(255, 255, 255); font-size: 16px; align: right;"
													border="5" style="width:100%">
													<caption class="obligatoireY">SUGGESTION DES
														ETUDIANTS</caption>

													<tr>

														<td>Matricule:<span class="obligatoire">*</span>
														</td>
														<td><f:input path="matricule" class="inputbox"
																style="width:50%" /></td>
														<td><f:errors path="matricule"></f:errors></td>
													</tr>
													<tr>
														<td>Objet : <span class="obligatoire">*</span>
														</td>
														<td class="inputbox" style="width: 100%"><f:textarea
																path="textSuggestion" class="inputbox"
																style="width:100%;height:100px;" /></td>
														<td><f:errors path="textSuggestion"></f:errors></td>
													</tr>
													<tr>
														<td></td>
														<td><f:button class="art-button" style="width:30%">Envoyer</f:button>
															<f:button class="art-button" style="width:30%">Effacer</f:button>
														</td>
													</tr>


													<tfoot>
													
														<tr>
														<table style="width:100%">
														<tr>
															<td class="obligatoireG"style="width:100%">
															${suggestionForm.reponse}
															</td>
														</tr>
															</table>
														</tr>
														
													</tfoot>


												</table>

											</f:form> </span>
									</p>
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
	</div>




</body>
</html>