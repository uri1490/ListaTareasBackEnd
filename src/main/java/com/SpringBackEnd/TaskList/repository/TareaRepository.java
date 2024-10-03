package com.SpringBackEnd.TaskList.repository;

import com.SpringBackEnd.TaskList.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
