package com.example.TodoList.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoList.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
