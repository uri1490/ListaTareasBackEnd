package com.SpringBackEnd.TaskList.service;

import com.SpringBackEnd.TaskList.model.Tarea;
import com.SpringBackEnd.TaskList.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TareaServiceImp implements TareaService{
    @Autowired
    private TareaRepository tareaRepository;
    @Override
    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea createTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public void deleteTarea(Long id) throws Exception {
        Tarea tarea=tareaRepository.findById(id).orElseThrow(()->new Exception("tarea no encontrada"));
        tareaRepository.delete(tarea);
    }
}
