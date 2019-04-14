package fr.devoxx.spring.stone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data @NoArgsConstructor @AllArgsConstructor
public class Stone {

	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private String color;
}
