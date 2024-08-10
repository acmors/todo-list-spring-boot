package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todos")
@Getter
@Setter
public class Todo {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY ) //->gera valor sequencial
	private Long id;
	
	private String name;
	
	private String description;
	
	private boolean completed;
	
	private int priority;
	
	
	
}
