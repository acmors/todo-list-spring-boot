package com.example.TodoList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;
import com.example.TodoList.entity.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TodoListApplicationTests {
	@Autowired
	private WebTestClient webTestClint;
	
	@Test
	void testeCreateTodoSuccess() {
		var todo = new Todo("todo01", "description description", false, 1);
		
		
		webTestClint
			.post()
			.uri("/todos")
			.bodyValue(todo)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").isArray()
			.jsonPath("$.lenght()").isEqualTo(1)
			.jsonPath("$[0].name").isEqualTo(todo.getName())
			.jsonPath("$[0].description").isEqualTo(todo.getDescription())
			.jsonPath("$[0].completed").isEqualTo(todo.isCompleted())
			.jsonPath("$[0].priority").isEqualTo(todo.getPriority())
			;
			
	}
	
	@Test
	void testeCreateTodoFailure() {
		webTestClint
			.post()
			.uri("/todos")
			.bodyValue(
					new Todo("", "", false, 0)).exchange()
			.expectStatus().isBadRequest();
	}

}
