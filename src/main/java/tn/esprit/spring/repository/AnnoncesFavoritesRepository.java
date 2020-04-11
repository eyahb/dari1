package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.AnnoncesFavorites;
@Repository
public interface AnnoncesFavoritesRepository extends CrudRepository <AnnoncesFavorites,Long> {

}
