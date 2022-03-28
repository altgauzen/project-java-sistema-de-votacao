package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;
  ArrayList<String> pessoasCandidatas = new ArrayList<String>();

  public PessoaCandidata(String nome, int numero) {
    super(nome);
    votos = 0;
    this.numero = numero;
    super.nome = nome;
    // TODO Auto-generated constructor stub
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  @Override
  public String getNome() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setNome(String nome) {
    // TODO Auto-generated method stub

  }



}
