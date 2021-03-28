package com.jaewoo.todo.dao

import com.jaewoo.todo.domain.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long> {
}