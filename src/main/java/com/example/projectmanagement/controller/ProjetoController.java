package com.example.projectmanagement.controller;

import com.example.projectmanagement.entity.Projeto;
import com.example.projectmanagement.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/list")
    public ModelAndView list() {
        List<Projeto> projetos = projetoService.findAll();
        return new ModelAndView("projeto/list", "projetos", projetos);
    }

    @GetMapping("/form")
    public ModelAndView form() {
        return new ModelAndView("projeto/form", "projeto", new Projeto());
    }

    @PostMapping("/save")
    public String save(Projeto projeto) {
        projetoService.save(projeto);
        return "redirect:/projeto/list";
    }

    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable Long id) {
        Projeto projeto = projetoService.findById(id);
        return new ModelAndView("projeto/view", "projeto", projeto);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        projetoService.deleteById(id);
        return "redirect:/projeto/list";
    }
}
