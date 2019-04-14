package fr.devoxx.spring.stone.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.devoxx.spring.stone.dao.StoneRepository;
import fr.devoxx.spring.stone.model.Stone;

@Service
public class StoneService {

//	static Map<Integer, Stone> stones = new HashMap<>();

//	@PostConstruct
//	public void init(){
//		stones.put(1, new Stone(1, "Time", "Green"));
//		stones.put(2, new Stone(2, "Power", "Purple"));
//		stones.put(3, new Stone(3, "Space", "Blue"));
//		stones.put(4, new Stone(4, "Reality", "Red"));
//		stones.put(5, new Stone(5, "Soul", "Orange"));
//		stones.put(6, new Stone(6, "Mind", "Yellow"));
//	}
	
	@Autowired StoneRepository stoneRepository;
//	public StoneService() {
//		super();
//	}

	public Optional<Stone> findById(Integer id) {
		return stoneRepository.findById(id);
	}

	public List<Stone> findAll(){
		return StreamSupport.stream(stoneRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
	
	public List<Stone> findByName(String name) {
		return stoneRepository.findByName(name);
	}

}
