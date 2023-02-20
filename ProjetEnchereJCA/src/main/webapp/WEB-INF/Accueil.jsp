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

<title>ENI-accueilEncheres</title>
</head>


<div class="b-example-divider"></div>

<header>

	<div class="px-3 py-2 text-bg-dark">
		<img alt="logo" src="logo/venteencheres.png">
		<div class="container">
			<div
				class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
				<a href="/"
					class="d-flex align-items-center my-2 my-lg-0 me-lg-auto text-white text-decoration-none">
					<svg class="bi me-2" width="40" height="32" role="img"
						aria-label="Bootstrap">
						<use xlink:href="#bootstrap" /></svg>
				</a>

				<ul
					class="nav col-12 col-lg-auto my-2 justify-content-center my-md-0 text-small">


				</ul>
			</div>
		</div>
	</div>
	<div class="px-3 py-2 border-bottom mb-3">
		<div class="container d-flex flex-wrap justify-content-center">
			<form class="col-12 col-lg-auto mb-2 mb-lg-0 me-lg-auto"
				role="search">
				<input type="search" class="form-control" placeholder="Chercher..."
					aria-label="search">
			</form>

			<div class=" d-flex no-wrap text-end">

				<form action="ServletDeconnexion">
					<button type="submit" class="btn btn-light text-dark me-3">Se
						déconnecter</button>
				</form>
				<form action="ServletConnexion">
					<button type="submit" class="btn btn-light text-dark me-3">Connexion</button>
				</form>
				<form action="ServletAjoutUtilisateur">
					<button type="submit" class="btn btn-primary me-3">S'inscrire</button>
				</form>
				
					<form action="ServletProfil">
				<button type="submit" class="btn btn-primary position-relative">
					Profil 
					<span class="position-absolute top-0 start-100 translate-middle p-2 bg-danger border border-light rounded-circle">
						<span class="visually-hidden">New alerts</span>
					</span>
				</button>
				</form>



			</div>
		</div>
	</div>
</header>

<h3 align="center">Liste des encheres</h3>

<main>
	<div class="album py-5 bg-light">
		<div class="container">

			<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
				<div class="col">
					<div class="card shadow-sm">

						<svg class="bd-placeholder-img card-img-top" width="100%"
							height="225" xmlns="http://www.w3.org/2000/svg" role="img"
							aria-label="Placeholder: Thumbnail"
							preserveAspectRatio="xMidYMid slice" focusable="false">
							<title>Placeholder</title><rect width="100%" height="100%"
								fill="#55595c" />
							<text x="50%" y="50%" fill="#eceeef" dy=".3em"></text></svg>
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Voir</button>
									<button type="button" class="btn btn-sm btn-outline-secondary">Encherir</button>
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card shadow-sm">
						<svg class="bd-placeholder-img card-img-top" width="100%"
							height="225" xmlns="http://www.w3.org/2000/svg" role="img"
							aria-label="Placeholder: Thumbnail"
							preserveAspectRatio="xMidYMid slice" focusable="false">
							<title>Placeholder</title><rect width="100%" height="100%"
								fill="#55595c" />
							<text x="50%" y="50%" fill="#eceeef" dy=".3em"></text></svg>
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Voir</button>
									<button type="button" class="btn btn-sm btn-outline-secondary">Encherir</button>
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card shadow-sm">
						<svg class="bd-placeholder-img card-img-top" width="100%"
							height="225" xmlns="http://www.w3.org/2000/svg" role="img"
							aria-label="Placeholder: Thumbnail"
							preserveAspectRatio="xMidYMid slice" focusable="false">
							<title>Placeholder</title><rect width="100%" height="100%"
								fill="#55595c" />
							<text x="50%" y="50%" fill="#eceeef" dy=".3em"></text></svg>
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Voir</button>
									<button type="button" class="btn btn-sm btn-outline-secondary">Encherir</button>
								</div>

							</div>
						</div>
					</div>
				</div>
</main>



<div class="b-example-divider"></div>

<div class="container">
	<footer class="py-3 my-4">
		<ul class="nav justify-content-center border-bottom pb-3 mb-3">

			<li class="nav-item"><a href="#"
				class="nav-link px-2 text-muted">FAQs</a></li>
			<li class="nav-item"><a href="#"
				class="nav-link px-2 text-muted">About</a></li>
		</ul>
		<p class="text-center text-muted">&copy; 2023 Encheres, ENI</p>
	</footer>
</div>






<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</body>
</html>