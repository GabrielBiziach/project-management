package com.example.projectmanagement.controller;

import com.example.projectmanagement.entity.Tarefa;
import com.example.projectmanagement.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/list")
    public ModelAndView list() {
        List<Tarefa> tarefas = tarefaService.findAll();
        return new ModelAndView("tarefa/list", "tarefas", tarefas);
    }

    @GetMapping("/form")
    public ModelAndView form() {
        return new ModelAndView("tarefa/form", "tarefa", new Tarefa());
    }

    @PostMapping("/save")
    public String save(Tarefa tarefa) {
        tarefaService.save(tarefa);
        return "redirect:/tarefa/list";
    }

    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable Long id) {
        Tarefa tarefa = tarefaService.findById(id);
        return new ModelAndView("tarefa/view", "tarefa", tarefa);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        tarefaService.deleteById(id);
        return "redirect:/tarefa/list";
    }
}
