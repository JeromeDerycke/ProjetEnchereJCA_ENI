<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">

<title>Connexion</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.3/examples/sign-in/">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<!-- Favicons -->
<link rel="apple-touch-icon"
	href="/docs/5.3/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon" href="/docs/5.3/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.3/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.3/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="/docs/5.3/assets/img/favicons/safari-pinned-tab.svg"
	color="#712cf9">
<link rel="icon" href="/docs/5.3/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#712cf9">

<!-- /docs/5.3/assets/brand/bootstrap-logo.svg-->


<!-- Custom styles for this template -->
<link rel="stylesheet" href="css/sign-in.css" />
<link rel="stylesheet" href="css/Style.css" />


</head>



<body class="text-center">

	<main class="form-signin w-100 m-auto">
		<header>
			<img class="" src="logo/venteencheres.png" alt="" width="72"
				height="57">
		</header>

		<div class="album mt-5 px-5 py-5">
			<form action="ServletConnexion" method="post" class="row">
				<h1 class="h3 my-3 fw-normal">Veuillez vous connecter</h1>


				<div class="form-floating">
					<input type="text" class="form-control" id="floatingInput"
						placeholder="name@example.com" id="login" name="login"> <label
						for="floatingInput"> Adresse e-mail / Pseudo</label>
				</div>
				<div class="form-floating mt-2">
					<input type="password" class="form-control" id="floatingPassword"
						placeholder="Password" id="mdp" name="mdp"> <label
						for="floatingPassword">Mot de passe</label>
					<c:if test="${not empty msgErreur}">
						<p style="color: red">${msgErreur}</p>
					</c:if>
				</div>

				<div class="checkbox mb-3">
					<label> <input type="checkbox"
						aria-label="Se souvenir de moi" id="souvenir" name="souvenir"
						value="souv"> Se souvenir de moi
					</label>
				</div>
				<div class="d-flex justify-content-center">
					<button class="btn btn-warning" type="submit">S'identifier</button>
				</div>
			</form>

			<div class="row col mt-3 d-flex justify-content-center">
				<form action="ServletAjoutUtilisateur">
					<button type="submit" class=" btn btn-secondary">Cr�er un
						compte</button>
				</form>
			</div>
		</div>
		<footer class="py-3 my-4">
			<div class="container">

				<p class="text-center text-muted">
					&copy; Projet ench�re J�rome & Cl�ment & Alexandre - 2023 <a
						href="https://eni-ecole.fr"> ENI-Ecole</a>
				</p>
			</div>
		</footer>
	</main>







	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>

</body>
</html>
