package com.example.philips.devweek.Entity;

import javax.persistence.*;

@Entity
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String faixa_i;
    private Long faixa_n;
    private String descricao;

    public FaixaEtaria(String faixa_i, Long faixa_n, String descricao) {
        this.faixa_i = faixa_i;
        this.faixa_n = faixa_n;
        this.descricao = descricao;
    }

    public FaixaEtaria() {
    }

    public Long getId() {
        return id;
    }

    public String getFaixa_i() {
        return faixa_i;
    }

    public void setFaixa_i(String faixa_i) {
        this.faixa_i = faixa_i;
    }

    public Long getFaixa_n() {
        return faixa_n;
    }

    public void setFaixa_n(Long faixa_n) {
        this.faixa_n = faixa_n;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
