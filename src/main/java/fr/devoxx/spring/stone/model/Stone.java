package fr.devoxx.spring.stone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Stone {

	private Integer id;
	private String name;
	private String color;
}
