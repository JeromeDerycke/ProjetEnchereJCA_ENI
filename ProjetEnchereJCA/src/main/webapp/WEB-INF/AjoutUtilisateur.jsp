<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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

<title>Créer un compte</title>

<style>
img {
	display: block;
	margin: 0 auto;
}
</style>

</head>

<body>
<header><img alt="logo" src="logo/venteencheres.png"> </header>
	
	<div class="container">


		<div class="album px-5 py-5">
			<div class="row">
				<form action="ServletAjoutUtilisateur" method="post" class="row g-3">
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Email</label> <input
							type="email" class="form-control" id="inputEmail4" name="Email">
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Password</label> <input
							type="password" class="form-control" id="inputPassword4"
							name="MotDePasse">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Nom</label> <input
							type="text" class="form-control" id="nom" name="Nom">
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Prenom</label> <input
							type="text" class="form-control" id="prenom" name="Prenom">
					</div>
					<div class="col-md-6">
						<label for="text" class="form-label">Pseudo</label> <input
							type="text" class="form-control" id="Pseudo" name="Pseudo"
							title="Le pseudo doit contenir des lettres ou des chiffres (pas de caracteres spéciaux)">

					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">telephone</label> <input
							type="text" class="form-control" id="telephone" name="Telephone">
					</div>
					<div class="col-12">
						<label for="inputAddress" class="form-label">Nom de voie</label> <input
							type="text" class="form-control" id="rue" name="Rue"
							placeholder="">
					</div>
					<div class="col-md-6">
						<label for="inputCity" class="form-label"> ville</label> <input
							type="text" class="form-control" id="Ville" name="Ville">
					</div>
					<div class="col-md-6">
						<label for="inputZip" class="form-label">CP</label> <input
							type="text" class="form-control" id="CodePostal"
							name="CodePostal">
					</div>
					<div class="row mt-3">
						<div class="d-flex justify-content-between">
							<button class="btn btn-primary col-3 me-5" type="submit"
								name="bt" value="annuler" action="/WEB-INF/Accueil">Annuler</button>
							<button class="btn btn-primary col-3 ms-5" type="submit"
								name="bt" value="valider" action="/WEB-INF/Connexion.jsp">S'inscrire</button>
						</div>
					</div>
				</form>
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