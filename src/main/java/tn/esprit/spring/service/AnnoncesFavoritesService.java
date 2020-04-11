package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.AnnoncesFavorites;
import tn.esprit.spring.repository.AnnoncesFavoritesRepository;

@Service
public class AnnoncesFavoritesService implements IAnnoncesFavoritesService {
	@Autowired
	AnnoncesFavoritesRepository annoncefavrep;
	public static final Logger L = LogManager.getLogger(IAnnoncesFavoritesService.class);

	public Long addFav(AnnoncesFavorites anfav) {
		annoncefavrep.save(anfav);
		return anfav.getId();
	}

	@Override
	public void deleteFav(String id) {
		annoncefavrep.deleteById(Long.parseLong(id));
	}

	@Override
	public List<AnnoncesFavorites> retrieveAllUsers() {
		List<AnnoncesFavorites> users = (List<AnnoncesFavorites>) annoncefavrep.findAll();

		for (AnnoncesFavorites user : users) {
			L.info("user +++ : " + user);
		}
		return users;
	}
}
