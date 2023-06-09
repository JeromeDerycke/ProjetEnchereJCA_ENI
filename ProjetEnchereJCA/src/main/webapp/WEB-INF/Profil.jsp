<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Enter your description here" />

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/Style.css" />
<title>Mon profil</title>
</head>
<header>
	<img alt="logo" src="logo/venteencheres.png">
</header>
<body>

	<div class="container">
		<div class="album mt-5 px-5 py-5">



			<div class="row">
				<form action="ServletProfil" method="post" class="row g-3">

					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Pseudo</label> <input
							type="text" class="form-control" id="Pseudo" name="Pseudo"
							placeholder="${utilisateur.pseudo}"
							aria-label="Disabled input example" disabled>
					</div>

					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Email</label> <input
							type="email" class="form-control" id="inputEmail4" name="Email"
							placeholder=" ${utilisateur.email} "
							aria-label="Disabled input example" disabled>


					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Mot de
							passe</label> <input type="Password" class="form-control"
							id="inputPassword4" name="MotDePasse" placeholder=""
							value="${utilisateur.motDePasse}"
							aria-label="Disabled input example" disabled>
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Nom</label> <input
							type="text" class="form-control" id="nom" name="Nom"
							placeholder="${utilisateur.nom}"
							aria-label="Disabled input example" disabled>
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Prenom</label> <input
							type="text" class="form-control" id="prenom" name="Prenom"
							placeholder="${utilisateur.prenom}"
							aria-label="Disabled input example" disabled>
					</div>

					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">telephone</label> <input
							type="text" class="form-control" id="telephone" name="Telephone"
							placeholder="${utilisateur.telephone}"
							aria-label="Disabled input example" disabled>
					</div>
					<div class="col-12">
						<label for="inputAddress" class="form-label">Nom de voie</label> <input
							type="text" class="form-control" id="rue" name="Rue"
							placeholder="${utilisateur.rue}"
							aria-label="Disabled input example" disabled>
					</div>
					<div class="col-md-6">
						<label for="inputCity" class="form-label"> ville</label> <input
							type="text" class="form-control" id="Ville" name="Ville"
							placeholder="${utilisateur.ville}"
							aria-label="Disabled input example" disabled>
					</div>
					<div class="col-md-6">
						<label for="inputZip" class="form-label">CP</label> <input
							type="text" class="form-control" id="CodePostal"
							name="CodePostal" placeholder="${utilisateur.codePostal}"
							aria-label="Disabled input example" disabled>
					</div>
			</div>
			<br>
			<div class="col-md-6">
				<label for="inputZip" class="form-label">Credit</label> <input
					type="text" class="form-control" id="CodePostal" name="CodePostal"
					placeholder="${utilisateur.credit}"
					aria-label="Disabled input example" disabled>
			</div>
			<br>


			<div class="row mt-3">
				<div class="d-flex justify-content-between">

					<form action="ServletAccueil">
						<button class="btn btn-warning  me-5" hidden="hidden"
							type="submit" name="accueil" value="accueil">Accueil</button>
					</form>



					<form action="ServletAccueil">
						<button class="btn btn-secondary  me-5" type="submit" name="accueil"
							value="accueil">Accueil</button>
					</form>

					<form action="ServletModifierProfil">
						<button class="btn btn-warning  me-5" type="submit"
							name="modifier" value="valider">Modifier</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<footer class="py-3 my-4">
	<div class="container">

		<p class="text-center text-muted">
			&copy; Projet enchère Jérome & Clément & Alexandre - 2023 <a
				href="https://eni-ecole.fr"> ENI-Ecole</a>
		</p>

	</div>
</footer>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>
</body>
</html>