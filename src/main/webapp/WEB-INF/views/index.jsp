<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>
<!-- Created by Artisteer v4.1.0.59861 -->
<meta charset="utf-8">
<title>Accueil</title>
<meta name="viewport"
	content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

<!--[if lt IE 9]><script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<link rel="stylesheet" href="resources/css/style.css" media="screen">
<!--[if lte IE 7]><link rel="stylesheet" href="resources/css/style.ie7.css" media="screen" /><![endif]-->
<link rel="stylesheet" href="resources/css/style.responsive.css"
	media="all">
<link rel="shortcut icon" href="resources/images/GradCap.ico">

<script src="resources/js/js/jquery.js"></script>
<script src="resources/js/script.js"></script>
<script src="resources/js/script.responsive.js"></script>




<script>
	jQuery(function($) {
		'use strict';
		if ($.fn.slider) {
			$(".art-slidecontainertof1").each(
					function() {
						var slideContainer = $(this), tmp;
						var inner = $(".art-slider-inner", slideContainer);
						var helper = null;

						if ($.support.transition) {
							helper = new BackgroundHelper();
							helper.init("fade", "next", $(".art-slide-item",
									inner).first().css(
									$.support.transition.prefix
											+ "transition-duration"));
							inner.children().each(function() {
								helper.processSlide($(this));
							});

						}

						inner.children().eq(0).addClass("active");
						slideContainer.slider({
							pause : 2400,
							speed : 400,
							repeat : true,
							animation : "fade",
							direction : "next",
							navigator : slideContainer
									.siblings(".art-slidenavigatortof1"),
							helper : helper
						});
					});
		}
	});
</script>
<style>
.art-content .art-postcontent-0 .layout-item-0 {
	margin-bottom: 0px;
}

.art-content .art-postcontent-0 .layout-item-1 {
	padding-right: 10px;
	padding-left: 10px;
}

.ie7 .art-post .art-layout-cell {
	border: none !important;
	padding: 0 !important;
}

.ie6 .art-post .art-layout-cell {
	border: none !important;
	padding: 0 !important;
}

.art-slidecontainertof1 {
	position: relative;
	width: 517px;
	height: 335px;
}

.art-slidecontainertof1 .art-slide-item {
	
}

.art-slidecontainertof1 .art-slide-item {
	-webkit-transition: 400ms ease-in-out opacity;
	-moz-transition: 400ms ease-in-out opacity;
	-ms-transition: 400ms ease-in-out opacity;
	-o-transition: 400ms ease-in-out opacity;
	transition: 400ms ease-in-out opacity;
	position: absolute;
	display: none;
	left: 0;
	top: 0;
	opacity: 0;
	width: 100%;
	height: 100%;
}

.art-slidecontainertof1 .active, .art-slidecontainertof1 .next,
	.art-slidecontainertof1 .prev {
	display: block;
}

.art-slidecontainertof1 .active {
	opacity: 1;
}

.art-slidecontainertof1 .next, .art-slidecontainertof1 .prev {
	width: 100%;
}

.art-slidecontainertof1 .next.forward, .art-slidecontainertof1 .prev.back
	{
	opacity: 1;
}

.art-slidecontainertof1 .active.forward {
	opacity: 0;
}

.art-slidecontainertof1 .active.back {
	opacity: 0;
}

.art-slidetof10 {
	background-image: url('resources/images/slidetof10.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof11 {
	background-image: url('resources/images/slidetof11.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof17 {
	background-image: url('resources/images/imagesCampus/campus1.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}


.art-slidetof18 {
	background-image: url('resources/images/imagesCampus/campus2.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof19 {
	background-image: url('resources/images/imagesCampus/campus3.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof20 {
	background-image: url('resources/images/imagesCampus/campus4.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof12 {
	background-image: url('/resources/images/slidetof12.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof13 {
	background-image: url('resources/images/slidetof13.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof14 {
	background-image: url('resources/images/slidetof14.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof15 {
	background-image: url('resources/images/slidetof11.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidetof16 {
	background-image: url('resources/images/slidetof16.jpg');
	background-size: 90%;
	background-position: center top;
	background-repeat: no-repeat;
}

.art-slidenavigatortof1 {
	display: inline-block;
	position: absolute;
	direction: ltr !important;
	top: 324px;
	left: 80.46%;
	z-index: 101;
	line-height: 0 !important;
	-webkit-background-origin: border !important;
	-moz-background-origin: border !important;
	background-origin: border-box !important;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	text-align: center;
	white-space: nowrap;
}

.art-slidenavigatortof1 {
	background: #899FAE;
	background: transparent;
	background: transparent;
	background: transparent;
	background: transparent;
	background: transparent;
	background: transparent;
		background: transparent;
	background: transparent;
	background: transparent;
	background: transparent;
	-svg-background: transparent;
	padding: 3px;
}

.art-slidenavigatortof1>a {
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	background: #465A67;
	-svg-background: #465A67;
	-webkit-border-radius: 10%;
	-moz-border-radius: 10%;
	border-radius: 10%;
	border: 1px solid #597282;
	margin: 0 10px 0 0;
	width: 5px;
	height: 5px;
}

.art-slidenavigatortof1>a.active {
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
		background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	-svg-background: #34798D;
	-webkit-border-radius: 10%;
	-moz-border-radius: 10%;
	border-radius: 10%;
	border: 1px solid #255665;
	margin: 0 10px 0 0;
	width: 5px;
	height: 5px;
}

.art-slidenavigatortof1>a:hover {
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	background: #34798D;
	-svg-background: #34798D;
	-webkit-border-radius: 10%;
	-moz-border-radius: 10%;
	border-radius: 10%;
	border: 1px solid #439CB6;
	margin: 0 10px 0 0;
	width: 5px;
	height: 5px;
}
</style>
</head>
<body>
	<div id="art-main">
		<header class="art-header">


			<div class="art-shapes">
				<div class="art-object371387124" data-left="0%"> <img alt="monlivre" src="resources/images/object371387124.png"></div>

			</div>
			<h1 class="art-headline" data-left="79.25%">
				<a href="#"> GESTION &nbsp;DES EVALUATIONS</a>
				
			</h1>                                                                   
			
			<h2 class="art-slogan" data-left="71.17%">Rapide, Fiable et
				Efficace!!!  </h2>
			



			<div id="art-flash-area">
				<div id="art-flash-container">
					<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
						width="940" height="266" id="art-flash-object">
						<param name="movie" value="resources/images/flash.swf">
						<param name="quality" value="high">
						<param name="scale" value="default">
						<param name="wmode" value="transparent">
						<param name="flashvars"
							value="color1=0xFFFFFF&amp;alpha1=.50&amp;framerate1=24&amp;loop=true&amp;wmode=transparent">
						<param name="swfliveconnect" value="true">
						<!--[if !IE]>-->
						<object type="application/x-shockwave-flash"
							data="resources/images/flash.swf" width="940" height="266">
							<param name="quality" value="high">
							<param name="scale" value="default">
							<param name="wmode" value="transparent">
							<param name="flashvars"
								value="color1=0xFFFFFF&amp;alpha1=.50&amp;framerate1=24&amp;loop=true&amp;wmode=transparent">
							<param name="swfliveconnect" value="true">
							<!--<![endif]-->
							<div class="art-flash-alt">
								<a href="http://www.adobe.com/go/getflashplayer"><img
									src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif"
									alt="Get Adobe Flash player"></a>
							</div>
							<!--[if !IE]>-->
						</object>
						<!--<![endif]-->
					</object>
				</div>
			</div>

		</header>
		<nav class="art-nav">
			<ul class="art-hmenu">
				<li><a href="#" class="active">Home</a></li>
				<li><a href="#">Consulter Profil</a></li>

				<li><a href="#">Suggestion</a></li>
			

			</ul>
		</nav>
		<div class="art-sheet clearfix">
			<div class="art-layout-wrapper">
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
												style="line-height: 16px; font-family: Georgia; color: rgb(255, 255, 255);">Jeunesse,
													comment faire pour eviter les MST?&nbsp;</span><br></span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Bons
												conseils pour bien preparer et reussir son annee
												accademique.</span></li>

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
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Bons
												conseils pour bien preparer et reussir son annee
												Accademique.</span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Resultats
												et classements des Jeux Universitaire 2016</span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Calendrier
												des examens et Controle continu 2016</span></li>
										<li><span
											style="font-family: Georgia; color: rgb(255, 255, 255); font-size: 11px;">Classement
												2016 des meilleurs Universites du Cameroun</span></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="art-layout-cell art-content">
							<article class="art-post art-article">


								<div class="art-postcontent art-postcontent-0 clearfix">
									<div class="art-content-layout-wrapper layout-item-0">
										<div class="art-content-layout">
											<div class="art-content-layout-row">
												<div class="art-layout-cell layout-item-1"
													style="width: 100%">
													<p></p>
													<div id="tof1"
														style="position: relative; display: inline-block; z-index: 0; margin: -15px;; border-style: solid; border-color: #000000; border-width: 0px;"
														class="art-collage">
														<div class="art-slider art-slidecontainertof1"
															data-width="517" data-height="335">
															<div class="art-slider-inner">
																<div class="art-slide-item art-slidetof10"></div>
																<div class="art-slide-item art-slidetof11"></div>
																<div class="art-slide-item art-slidetof12"></div>
																<div class="art-slide-item art-slidetof13"></div>
																<div class="art-slide-item art-slidetof14"></div>
																<div class="art-slide-item art-slidetof15"></div>
																<div class="art-slide-item art-slidetof16"></div>
																<div class="art-slide-item art-slidetof17"></div>
																<div class="art-slide-item art-slidetof18"></div>
																<div class="art-slide-item art-slidetof19"></div>
																<div class="art-slide-item art-slidetof20"></div>

															</div>
														</div>
														<div class="art-slidenavigator art-slidenavigatortof1"
															data-left="80.46">
															<a href="#" class="art-slidenavigatoritem"></a><a
																href="#" class="art-slidenavigatoritem"></a><a href="#"
																class="art-slidenavigatoritem"></a><a href="#"
																class="art-slidenavigatoritem"></a><a href="#"
																class="art-slidenavigatoritem"></a><a href="#"
																class="art-slidenavigatoritem"></a><a href="#"
																class="art-slidenavigatoritem"></a>
														</div>



													</div>



													<p style="text-align: center;">
														<span
															style="color: rgb(255, 255, 255); font-size: 16px; font-family: Georgia;">GESTION
															COMPLETE ET SECURISE DES EVALUATIONS...<br /> connecter
															vous en tant "Etudiant" ou "Enseignant" &nbsp;
														</span>
													</p>
													<p>
														<br>
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>


							</article>
						</div>
						<div class="art-layout-cell art-sidebar2">
							<div class="art-block clearfix">
								<div class="art-blockheader">
									<h3 class="t">Connexion</h3>
								</div>
								<div class="art-blockcontent">
									<f:form modelAttribute="connectionForm" method="post"
										action="monEspace">
										<fieldset class="input" style="border: 0 none;">
											<p id="form-login-username">
												<label for="modlgn_username">Username</label> <br />
												<f:input path="pseudo" class="inputbox" style="width:100%" />
												<br />
												<f:errors path="pseudo"></f:errors>
											<p id="form-login-password">
												<label for="modlgn_passwd">Password</label> <br />
												<f:password path="motPasse" class="inputbox"
													style="width:100%" />
												<f:errors path="motPasse" class="inputbox"></f:errors>

											</p>
											<p>
												<label for="role"> Connecter en tant que</label><br/>
												
													<f:select path="tipeConnection" style="width:100%;height:40px;padding:none !important;">
											<f:option value="Etudiant" >Etudiant</f:option>
											<f:option value="Enseignant" >Enseignant</f:option>
											<f:option value="Autres" >Autres</f:option>
											
											</f:select>

												
												
											</p>
												
											
											<p id="form-login-remember">
												<label class="art-checkbox"> <input type="checkbox"
													id="modlgn_remember" name="remember" value="yes"
													alt="Remember Me" />Remember Me
												</label>
											</p>
											<f:button class="art-button">Login</f:button>



										</fieldset>
										<ul>
											<li><a href="#">Forgot your password?</a></li>
											<li><a href="#">Forgot your username?</a></li>
											<li><a href="#">Create an account</a></li>
										</ul>
									</f:form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<footer class="art-footer">
				<p>
					<a href="#" style="line-height: 32px;"
						title="Nous rejoindre sur Facebook" class="art-facebook-tag-icon"><img alt="facebook" src="resources/images/footerfacebookicon.png"></a>
					<a href="#" style="line-height: 32px;"
						title="Nous rejoindre sur Twitter" class="art-twitter-tag-icon"><img alt="twitter" src="resources/images/footertwittericon.png"></a>
					<a href="#" style="line-height: 32px;" class="art-rss-tag-icon"><img alt="rss" src="resources/images/footerrssicon.png"></a>
				</p>
				<p>Copyright © 2016. All Rights Reserved by M1 Computer Sciences
					Students.</p>
			</footer>
		</div>
	</div>
</body>
</html>