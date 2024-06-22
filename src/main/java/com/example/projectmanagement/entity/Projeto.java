package com.example.projectmanagement.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tarefa> tarefas;
}
