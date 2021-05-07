package com.lgImovel.lgImovel.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table


public class Imovel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String cidade;

    @Column (nullable = false)
    private String bairro;

    @Column (nullable = false)
    private String rua;

    @Column (nullable = false)
    private int numero;

    @Column (nullable = false)
    private int andares;

    @Column (nullable = false)
    private String piscina;

    @Column (nullable = false)
    private int quartos;

    @Column (nullable = false)
    private int banheiros;

    @Column (nullable = false)
    private String garagem;

    @Column (nullable = false)
    private String permiteAnimais;

    @Column (nullable = false)
    private String complemento;

    }
