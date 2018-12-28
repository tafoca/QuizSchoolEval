<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>
<!-- Created by Artisteer v4.1.0.59861 -->
<meta charset="utf-8">
<title>AJOUT QUESTION</title>
<meta name="viewport"
	content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">
<link rel="stylesheet" href="resources/css/bootstrap.css">
<!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<link rel="stylesheet" href="resources/css/bootstrap/style.css" media="screen">
<!--[if lte IE 7]><link rel="stylesheet" href="resources/css/style.ie7.css" media="screen" /><![endif]-->
<link rel="stylesheet" href="resources/css/style.responsive.css"
	media="all">
<link rel="shortcut icon" href="resources/images/GradCap.ico">
<link rel="stylesheet" href="resources/css/styleFormulaire.css"
	media="all">
<link rel="stylesheet" href="rquestionbankesources/css/stylePerso.css"
	media="all">

</head>
<body>
	<div id="art-main">
		<header class="art-header">


			<div class="art-shapes">
				<div class="art-object371387124" data-left="0%"></div>

			</div>
			<h1 class="art-headline" data-left="79.25%">
				<a href="#"> ESPACE ENSEIGNANT -> PROGRAMMATION EVALUATION </a>
			</h1>
			<h2 class="art-slogan" data-left="71.17%">ENSEIGNANT :
				${ajoutEnseignant.adminName}</h2>

			<div id="art-flash-area">
				<div id="art-flash-container"></div>
			</div>

		</header>
		<nav class="art-nav">
			<ul class="art-hmenu">
				<li><a href="#" class="">Home</a></li>
				<li><a href="annuaireEnseignant" class="">Enseignants</a></li>
				<li><a href="questionbank" class="">questionnaire</a></li>
				
				<li><a href="evaluationProg" class="active">programmer evaluation</a></li>
				
				<li><a href="deconnecterEtudiant">Deconnexion</a></li>
			</ul>
		</nav>
		<div class="art-sheet clearfix">
			<div>
				<div class="art-content-layout">
					<div class="art-content-layout-row">
						<div class="art-layout-cell art-sidebar1">
							<div class="art-block clearfix">
								<div class="art-blockheader">
									<h3 class="t">PUB</h3>
								</div>
								<div class="art-blockcontent">
									<ul>
										<li><span style="font-size: 11px;"><span
												style="line-height: 16px; font-family: Georgia; color: rgb(255, 255, 255);">quelques
													conseil pour bien reussir&nbsp;</span><br></span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Bons
												conseils pour bien preparer et reussir son annee scolaire.</span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Resultats
												et classements des Jeux FENASCO 2015</span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Calendrier
												des examens et Concours 2016</span></li>
										<li><spanEtudiants
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
											style="line-height: 16px; color: rgb(255, 255, 255); fonEtudiantst-family: Georgia; font-size: 14px;">La
												prochaine rentree scolaire est prevue pour le lundi 01
												Octobre 2016&nbsp;</span></li>
										<li><span
											style="line-height: 16px; color: rgb(255, 255, 255); font-family: Georgia; font-size: 11px;">Resultats
												des examens de 2016&nbsp;</span></li>


									</ul>
								</div>
							</div>
						</div>
						<div class="art-layout-cell art-content">
							<article class="art-post art-article">
								<div class="art-postcontent art-postcontent-0 clearfix">


									<div class="container-fluid">
										<h3 class="text-center">Creer Une Evaluation </h3>
										<div class="panel-group col-lg-12" id="qcmvue">
											<div class="panel panel-default">
												<div class="panel-heading">
													<h3 class="panel-title accordion-toggle" href="#qcm"
											
														data-toggle="collapse">Parametrage de l'evaluation</h3>
												</div>
												<div id="qcm" class="panel-collapse collapse">
													<f:form modelAttribute="programmationform"
														action="programmation" method="post">
														<label style="display: block;"> Matiere : <f:input
																path="uvEnCours" class="form-control" placeholder="code l' uv" />
																
														</label>
														<label style="display: block;"> Enseignant : <f:input
																path="enseignant" class="form-control" />
														</label>
														
														<label style="display: block;"> Date evaluation : <f:input
																path="dateEvaluation" class="form-control" placeholder="MM/JJ/AAAA"/>
														</label>
														<label style="display: block;"> heure evaluation : <f:input
																path="heureEvaluation" class="form-control" placeholder="08h-10h"/>
														</label>
														<label style="display: block;"> Duree evaluation : <f:input
																path="duree" class="form-control" placeholder="un entier"/>
														</label>
														<label style="display: block;"> Nombre de Question : <f:input
																path="numberQcm" class="form-control" />
														</label>
														<br />

															<input type="submit" value="Valider"
																class="btn btn-primary"  />
													
													</f:form>

													<div>
														<br />
													</div>
												</div>
											</div>
										</div>
									</div>


								</div>
							</article>





						</div>



					</div>
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


	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/script.js"></script>
	<script src="resources/js/script.responsive.js"></script>
	<script src="resources/js/bootstrap.js"></script>
	<script src="resources/js/vue/dist/vue.js"></script>
	<script src="resources/js/qcm.js"></script>

</body>
</html>