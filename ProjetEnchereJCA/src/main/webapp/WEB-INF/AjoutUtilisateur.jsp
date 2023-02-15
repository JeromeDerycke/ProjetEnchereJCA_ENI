<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Enter your description here"/>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<title>test utilisateur</title>
</head>
<body>

<div class="container" >



	<div class="row">
    <form action="ServletAjoutUtilisateur" method="post" class="row g-3">
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
          <label for="inputCity" class="form-label"> ville</label>
          <input type="text" class="form-control" id="Ville" name="Ville">
        </div>
        <div class="col-md-6">
          <label for="inputZip" class="form-label">CP</label>
          <input type="text" class="form-control" id="CodePostal" name="CodePostal">
        </div>        
        <div class="col">
          <button  class="btn btn-primary" type="submit" name="bt" value="annuler">Annuler</button>
          <button  class="btn btn-primary" type="submit" name="bt" value="valider">S'inscrire</button>
        </div> 
  </form> </div>
  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>