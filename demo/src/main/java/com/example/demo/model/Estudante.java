package com.example.demo.model;

import java.time.LocalDate;

public class Estudante {

    private long id;
    private String nome;
    private Integer idade;
    private LocalDate dataNascimento;
    private String email;

    public Estudante() {
    }

    public Estudante(long id, String nome, Integer idade, LocalDate dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public Estudante(String nome, Integer idade, LocalDate dataNascimento, String email) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                ", email='" + email + '\'' +
                '}';
    }
}
