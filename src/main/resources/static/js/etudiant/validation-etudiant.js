console.log("JS chargé");



function validerLeFormulaire() {

	let nomElement = document.getElementById("nom");
	let nom = nomElement.value;

	if (nom === ""
	) {
		console.log("Vous n'avez pas saisi de nom");
		nomElement.classList.add("erreur");
	} else {
		nomElement.classList.remove("erreur");
	}

	
	let prenomElement = document.getElementById("prenom");
	let prenom = prenomElement.value;

	if (prenom === "") {
		console.log("Vous n'avez pas saisi de prénom");
		prenomElement.classList.add("erreur");
	} else {
		prenomElement.classList.remove("erreur");
	}
	
	let numeroElement = document.getElementById("numero");
	let numero = numeroElement.value;

	if (numero === ""
	) {
		console.log("Vous n'avez pas saisi de numero");
		numeroElement.classList.add("erreur");
	} else {
		numeroElement.classList.remove("erreur");
	}


	let dateNaissanceElement = document.getElementById("dateNaissance");
	let dateNaissance = dateNaissanceElement.value;

	if (dateNaissance === "") {
		console.log("Vous n'avez pas saisi de date de naissance");
		dateNaissanceElement.classList.add("erreur");
	} else {
		dateNaissanceElement.classList.remove("erreur");
	}
	

	let photoElement = document.getElementById("photo");
	let photo = photoElement.value;

	if (photo === ""
	) {
		console.log("Vous n'avez pas entré votre photo");
		photoElement.classList.add("erreur");
	} else {
		photoElement.classList.remove("erreur");
	}

	let lesClassErreur = document.getElementsByClassName("erreur");
	console.log(lesClassErreur);
	console.log("taille du tableau " + lesClassErreur.length);
	
	if(lesClassErreur.length === 0) {
		// envoyer le formulaire
		console.log("envoyer le formulaire");
		document.getElementById("formulaire").submit();
	}
	
}
