package com.example.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectmanagement.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
