package com.SpringBackEnd.TaskList.service;
import com.SpringBackEnd.TaskList.model.Tarea;

import java.util.List;

public interface TareaService {
    public List<Tarea> getAllTareas();
    public Tarea createTarea(Tarea tarea);
    public void deleteTarea(Long id) throws Exception;
}
