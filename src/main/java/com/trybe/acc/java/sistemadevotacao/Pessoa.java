package com.trybe.acc.java.sistemadevotacao;

public abstract class Pessoa {
  protected String nome;

  public Pessoa(String nome) {
    super();
    this.nome = nome;
  }

  public abstract String getNome();

  public abstract void setNome(String nome);
}
