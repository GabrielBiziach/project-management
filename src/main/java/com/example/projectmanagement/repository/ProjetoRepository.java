package com.example.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectmanagement.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

}
