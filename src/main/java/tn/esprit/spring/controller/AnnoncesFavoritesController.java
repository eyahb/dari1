package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entity.AnnoncesFavorites;
import tn.esprit.spring.service.IAnnoncesFavoritesService;

@RestController
public class AnnoncesFavoritesController {
	@Autowired
	IAnnoncesFavoritesService iaf;

	// http://localhost:8081/SpringMVC/servlet/addfav
	@PostMapping("/addfav")
	@ResponseBody
	public AnnoncesFavorites ajouterEmploye(@RequestBody AnnoncesFavorites annoncesfavorites) {
		iaf.addFav(annoncesfavorites);
		return annoncesfavorites;
	}

	// http://localhost:8081/SpringMVC/servlet/delete-fav/{fav-id}
	@DeleteMapping("/delete-fav/{fav-id}")
	@ResponseBody
	public void deleteFav(@PathVariable("fav-id") String AnnoncesFavoritesId) {
		iaf.deleteFav(AnnoncesFavoritesId);
	}

	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<AnnoncesFavorites> getUsers() {
		List<AnnoncesFavorites> list = iaf.retrieveAllUsers();
		return list;

	}

}
