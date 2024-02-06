package com.kamran.taskmanager.dao;

import com.kamran.taskmanager.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
