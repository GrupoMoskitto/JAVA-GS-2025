package com.moskitto.monitor.model;

public class Funcionario {

    private String nome;
    private int idade;
    private String profissao;
    private int nivelBurnout; // vai de 0 até 10

    public Funcionario(String nome, int idade, String profissao, int nivelBurnout) { // Construtor
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.nivelBurnout = nivelBurnout;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    public int getNivelBurnout() { return nivelBurnout; }
    public void setNivelBurnout(int nivelBurnout) { this.nivelBurnout = nivelBurnout; }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Profissão: " + profissao + " - Idade: " + idade + " - Nível de Burnout: " + nivelBurnout;
    }


}
