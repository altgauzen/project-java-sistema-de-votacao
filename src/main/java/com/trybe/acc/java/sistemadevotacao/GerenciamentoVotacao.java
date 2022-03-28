package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  ArrayList<String> cpfComputado = new ArrayList<String>();
  int totalVotos;
  String nomePessoaCandidata;
  int numeroPessoaCandidata;
  String nomePessoaEleitora;
  String cpf;

  public void cadastrarPessoaCandidata (String nomePessoaCandidata, int numeroPessoaCandidata) {
    if (numeroPessoaCandidata esta no array pessoasCandidatas) {
      return "Número pessoa candidata já utilizado!";
    }
  }

  public void cadastrarPessoaEleitora (String nomePessoaEleitora, String cpf) {
    if (numeroPessoaEleitora esta no array pessoasEleitoras) {
      return "Pessoa eleitora já cadastrada!";
    }
  }

  public void votar (String  cpf, int numeroPessoaCandidata) {
    if (cpf esta no array cpfComputado) {
      return "Pessoa eleitora já votou!";
    }
  }

  public void mostrarResultado () {
    if (ja existe voto computado?) {
      return "É preciso ter pelo menos um voto para mostrar o resultado.";
    }
  }

  private double calcularPorcentagemVotos (int indice) {
    if (ja existe voto computado?) {
      return "É preciso ter pelo menos um voto para mostrar o resultado.";
    }
  }

}
