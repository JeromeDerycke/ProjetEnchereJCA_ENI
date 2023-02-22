<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nouvelle Vente</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/NouvelleVente.css" />
</head>
<body>

	<div class="container mt-4">
		<h1 class="text-center mb-4">Nouvelle vente</h1>
		<form>
			<div class="form-group">
				<label for="nom">Nom de l'objet :</label> <input type="text"
					class="form-control" id="nom" name="nom">
			</div>
			<div class="form-group">
				<label for="description">Description de l'objet :</label>
				<textarea class="form-control" id="description" name="description"></textarea>
			</div>
			<div class="form-group">
				<label for="prix">Prix de vente :</label> <input type="number"
					class="form-control" id="prix" name="prix">
			</div>
			<div class="form-group">
				<label for="image">Image de l'objet :</label> <input type="file"
					class="form-control-file" id="image" name="image">
			</div>

			<form>
				<label for="party"> debut de l'enchère :</label> <input id="party"
					type="datetime-local" name="partydatedebut" min="2017-06-01T08:30"
					max="2100-06-30T16:30">
			</form>

			<form>
				<label for="party"> fin de l'enchère :</label> <input id="party"
					type="datetime-local" name="partydatefin" min="2017-06-01T08:30"
					max="2100-06-30T16:30">
			</form>

			<div class="form-group">
				<label for="categorie">Catégorie :</label> <select
					class="form-control" id="categorie" name="categorie">
					<option value="">--Choisissez une catégorie--</option>
					<option value="electronique">Informatique</option>
					<option value="vetements">Vêtements</option>
					<option value="maison">Ameublement</option>
					<option value="sports">Sports et loisirs</option>
				</select>
			</div>
			<form>
				<fieldset>
					<legend>Retrait :</legend>
					Rue : <input name="rue" type="text" placeholder="Rue" /><br /> CP
					: <input name="code postal" type="text" placeholder="Code postal" /><br>
					Ville : <input name="ville" type="text" placeholder="Ville"><br>
				</fieldset>
			</form>
			<button type="submit" class="btn btn-primary" name="bt"
				value="valider">Mettre en vente</button>
			<button type="submit" class="btn btn-primary" name="bt"
				value="annuler">Annuler</button>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>