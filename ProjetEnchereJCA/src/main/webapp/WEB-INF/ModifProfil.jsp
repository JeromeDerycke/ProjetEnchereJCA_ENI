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

<title>Mon profil</title>
</head>
<body>
	<img alt="logo" src="logo/venteencheres.png">
	<div class="container">



		<div class="row">
			<form action="ServletModifierProfil" method="post">

				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">Pseudo</label> <input
						type="text" class="form-control" id="Pseudo" name="Pseudo"
						placeholder="" required pattern="^[^@]+$"
						aria-label="" value="${utilisateur.pseudo}" onFocus="(this.value ==${utilisateur.pseudo} ) this.value = ''"
						title="Le pseudo doit contenir des lettres ou des chiffres (pas de caracteres spéciaux)">
				</div>

				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">Email</label> <input
						type="email" class="form-control" id="inputEmail4" name="Email"
						placeholder=""
						aria-label="" value=" ${utilisateur.email} " onFocus="(this.value ==${utilisateur.email} ) this.value = ''">


				</div>
				<div class="col-md-6">
					<label for="inputPassword4" class="form-label">Mot de passe</label>
					<input type="Password" class="form-control" id="inputPassword4"
						name="MotDePasse" placeholder=""
						aria-label="" value="${utilisateur.motDePasse}" onFocus="if (this.value == ${utilisateur.motDePasse}) this.value = ''">
				</div>
				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">Nom</label> <input
						type="text" class="form-control" id="nom" name="Nom"
						placeholder=""
						aria-label="" value="${utilisateur.nom}" onFocus="(this.value ==${utilisateur.nom} ) this.value = ''">
				</div>
				<div class="col-md-6">
					<label for="inputPassword4" class="form-label">Prenom</label> <input
						type="text" class="form-control" id="prenom" name="Prenom"
						placeholder="" 
						aria-label="" value="${utilisateur.prenom}" onFocus="(this.value ==${utilisateur.prenom}) this.value = ''">
				</div>

				<div class="col-md-6">
					<label for="inputPassword4" class="form-label">telephone</label> <input
						type="text" class="form-control" id="telephone" name="Telephone"
						placeholder=""
						aria-label="" value="${utilisateur.telephone}" onFocus="(this.value ==${utilisateur.telephone}) this.value = ''">
				</div>
				<div class="col-md-6">
					<label for="inputAddress" class="form-label">Nom de voie</label> <input
						type="text" class="form-control" id="rue" name="Rue"
						placeholder=""
						aria-label="" value="${utilisateur.rue}" onFocus="(this.value ==${utilisateur.rue}) this.value = ''">
				</div>
				<div class="col-md-6">
					<label for="inputCity" class="form-label"> ville</label> <input
						type="text" class="form-control" id="Ville" name="Ville"
						placeholder=""
						aria-label="" value="${utilisateur.ville}" onFocus="(this.value ==${utilisateur.ville}) this.value = ''">
				</div>
				<div class="col-md-6">
					<label for="inputZip" class="form-label">CP</label> <input
						type="text" class="form-control" id="CodePostal" name="CodePostal"
						placeholder=""
						aria-label=""value="${utilisateur.codePostal}" onFocus="(this.value ==${utilisateur.codePostal} ) this.value = ''">
				</div><button class="btn btn-primary mt-3" type="submit" name="bt"
					value="accueil">Enregistrer modification</button>
					</form>
		</div>
		<br>

		<div class="col d-flex no-wrap">
		
			
				
			 
			</div>
			<form>
				<button class="btn btn-primary" type="button"
					data-bs-toggle="collapse" data-bs-target=#affichersupr
					aria-expanded="false" aria-controls="collapsesupr">
					Supprimer mon compte</button>
			</form> 
			<div class="collapse" id="affichersupr">
  			<div class="card card-body">
  				<form action="ServletSuprimmerProfil" method="post">
  			<label for="inputEmail4" class="form-label">Email</label> <input
						type="email" class="form-control" id="inputEmail4" name="EmailSupr"
						placeholder=" Votre email"> 
   				 
					<label for="inputPassword4" class="form-label">Mot de passe</label>
					<input type="Password" class="form-control" id="inputPassword4"
						name="mdpSupr" placeholder="Votre mot de passe">
				
			
				<button class="btn btn-primary" type="submit" name="bt"
					value="accueil">Valider supression</button>
			</form> 
				
  </div>
</div>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
			crossorigin="anonymous"></script>
</body>
</html>