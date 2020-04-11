package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.AnnoncesFavorites;


public interface IAnnoncesFavoritesService {
	public Long addFav(AnnoncesFavorites anfav);

	public void deleteFav(String id);
	
	public List<AnnoncesFavorites> retrieveAllUsers(); 
}
