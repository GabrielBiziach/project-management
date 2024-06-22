package com.example.projectmanagement.entity;

import jakarta.persistence.*;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private int estimativaHoras;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;

    public enum Prioridade {
        MUITO_ALTA, ALTA, MEDIA, BAIXA, MUITO_BAIXA
    }
}
