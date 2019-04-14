package fr.devoxx.spring.stone.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.devoxx.spring.stone.model.Stone;
import fr.devoxx.spring.stone.service.StoneService;

@RestController
@RequestMapping("/v1")
public class StoneController {

	@Autowired StoneService stoneService;
	
	@GetMapping(value= "/stone/{stonePosition}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Stone findStoneById(@PathVariable Integer stonePosition) {
		return stoneService.findById(stonePosition);
	}
	
	@GetMapping(value= "/stones", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Stone> retrieveStones(@RequestParam(required=false) String name){
		if (name == null)
			return stoneService.findAll();
		else
			return stoneService.findByName(name);
	}
}
