package com.SpringBackEnd.TaskList.controller;

import com.SpringBackEnd.TaskList.model.InfoResponse;
import com.SpringBackEnd.TaskList.model.Tarea;
import com.SpringBackEnd.TaskList.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController


public class TareaController {
    @Autowired
    private TareaService tareaService;
    @GetMapping("/api")
    public InfoResponse homeController(){
        InfoResponse res= new InfoResponse();
        res.setMessage("welcome");
        res.setStatus(true);
        return res;
    }
    @GetMapping("/api/getTareas")
    public List<Tarea> getAllTareas(){
        return tareaService.getAllTareas();
    }
    @PostMapping("/api/create")
    public Tarea createTarea(@RequestBody Tarea tarea){
        return tareaService.createTarea(tarea);
    }
    @DeleteMapping("/api/delete/{id}")
    public Tarea delete(@PathVariable Long id ) throws Exception{
        tareaService.deleteTarea(id);
        InfoResponse res= new InfoResponse();
        res.setMessage("exito");
        res.setStatus(true);
        return null;
    }
}
