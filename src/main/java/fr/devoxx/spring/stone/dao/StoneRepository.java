package fr.devoxx.spring.stone.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.devoxx.spring.stone.model.Stone;

@Repository
public interface StoneRepository extends CrudRepository<Stone, Integer>{

	List<Stone> findByName(String name);
}
