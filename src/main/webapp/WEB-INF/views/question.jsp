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
				<a href="#"> ESPACE ENSEIGNANT </a>
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
				
				<li><a href="questionbank" class="active">questionnaire</a></li>
				<li><a href="evaluationProg">programmer evaluation</a></li>
				<li><a href="deconnecterEnseignant">Deconnexion</a></li>
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
										<h3 class="text-center">Generer votre QCM</h3>
										<div class="panel-group col-lg-12" id="qcmvue">
											<div class="panel panel-default">
												<div class="panel-heading">
													<h3 class="panel-title accordion-toggle" href="#qcm"
														data-toggle="collapse">questiongenerator</h3>
												</div>
												<div id="qcm" class="panel-collapse collapse">

													<f:form modelAttribute="questionnaireform" action="choix">
														<f:select path="maxchoix">
															<f:option value="-" label="--select nombre de choix--"></f:option>
															<f:option value="1" label="1"></f:option>
															<f:option value="2" label="2"></f:option>
															<f:option value="3" label="3"></f:option>
															<f:option value="4" label="4"></f:option>
															<f:option value="5" label="5"></f:option>
															<f:option value="6" label="6"></f:option>
														</f:select>
														<input type="submit" value="ok" class="btn btn-default">
													</f:form>
													<br />

													<f:form modelAttribute="questionnaireform"
														action="saveQuestion" method="post">
														<label style="display: block;"> Matiere : <f:input
																path="matiere" class="form-control" />
														</label>
														<label style="display: block;"> question: <f:input
																path="question" class="form-control" />
														</label>
														<br />

														<legend>eventuelles choix</legend>
														<c:if test="${questionnaireform.maxchoix > 0 }">
															<c:forEach var="i" begin="0"
																end="${questionnaireform.maxchoix - 1}">
																<label style="display: block;"> <f:input
																		path="noschoix[${i}]" class="form-control" /> <span>#
																		- </span> <f:select path="valeurchoix[${i}]">
																		<f:option value="-" label="--select valeur du choix--"></f:option>
																		<f:option value="correct" label="correct"></f:option>
																		<f:option value="incorrect" label="incorrect"></f:option>
																	</f:select>
																</label>
															</c:forEach>
														</c:if>
														<div>

															<input type="submit" value="Valider"
																class="btn btn-primary" v-on:click="valider">
														</div>
													</f:form>

													<div>
														<br />
													</div>
												</div>
											</div>
										</div>
										<div class="col-lg-6 col-lg-offset-3">
											<button class="btn btn-default" data-toggle="modal"
												href="#qcm-modal">+question</button>
											<button class="btn btn-primary">enregistrer</button>
										</div>
									</div>

									<div class="modal" id="qcm-modal">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal">x</button>
													<h4 class="modal-title">nouvelle question</h4>
												</div>
												<div class="modal-body">
													<f:form modelAttribute="questionnaireform"
														action="questionbank">
														<label style="display: block;"> Matiere : <f:input
																path="matiere" class="form-control" />
														</label>
														<label style="display: block;"> question : <f:input
																path="question" class="form-control"
																v-model="question.text" />
														</label>
														<br />
														<legend>eventuelles choix</legend>
														<label style="display: block;"
															v-for="choix in question.choix"> <f:input
																path="meschoix[1].libelechoix" class="form-control"
																v-model="choix.answer" /> <span># {{$index}} - </span>
															<f:checkbox path="valeurchoix[1]" v-model="choix.isvalid"
																value="false" />
														</label>

														<div>

															<input type="submit" value="Valider"
																class="btn btn-primary" v-on:click="valider">
														</div>
													</f:form>
													<div>

														<button class="btn btn-default" v-on:click="addchoix">+choix</button>
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