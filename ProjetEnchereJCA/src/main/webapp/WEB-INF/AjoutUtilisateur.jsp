<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Enter your description here"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link rel="stylesheet" href="assets/css/style.css">
<title>test utilisateur</title>
</head>
<body>

<div class="container" >
    <form action="AjoutUtilisateur" method="post" class="row g-3">
        <div class="col-md-6">
          <label for="inputEmail4" class="form-label">Email</label>
          <input type="email" class="form-control" id="inputEmail4" name="Email">
        </div>
        <div class="col-md-6">
          <label for="inputPassword4" class="form-label">Password</label>
          <input type="password" class="form-control" id="inputPassword4" name="MotDePasse">
        </div>
        <div class="col-md-6">
            <label for="inputEmail4" class="form-label">Nom</label>
            <input type="text" class="form-control" id="nom" name="Nom">
          </div>
          <div class="col-md-6">
            <label for="inputPassword4" class="form-label">Prenom</label>
            <input type="text" class="form-control" id="prenom" name="Prenom">
          </div>
          <div class="col-md-6">
            <label for="inputEmail4" class="form-label">Pseudo</label>
            <input type="text" class="form-control" id="Pseudo" name="Pseudo">
          </div>
          <div class="col-md-6">
            <label for="inputPassword4" class="form-label">telephone</label>
            <input type="text" class="form-control" id="telephone" name="Telephone">
          </div>
        <div class="col-12">
          <label for="inputAddress" class="form-label">Nom de voie</label>
          <input type="text" class="form-control" id="rue" name="Rue" placeholder="campus eni">
        </div>
        <div class="col-md-6">
          <label for="inputCity" class="form-label">ville</label>
          <input type="text" class="form-control" id="Ville" name="Ville">
        </div>
        <div class="col-md-6">
          <label for="inputZip" class="form-label">CP</label>
          <input type="text" class="form-control" id="CodePostal" name="CodePostal">
        </div>        
        <div class="col">
          <button type="submit" class="btn btn-primary" name="Accueil" value="Annuler">Annuler</button>
          <button type="submit" class="btn btn-primary" name="Valider" value="Valider">S'inscrire</button>
        </div>
  </form>
  </div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.0/js/bootstrap.min.js"></script>
</body>
</html>