package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  ArrayList<String> cpfComputado = new ArrayList<String>();
  int totalVotos;

  /**
   * Método para cadastro da Pessoa Candidata.
   * 
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    // PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
      }
    }
  }

  /**
   * Método para cadastro da Pessoa Eleitora.
   * 
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }
  }

  // public void votar (String cpf, int numeroPessoaCandidata) {
  // if (cpf esta no array cpfComputado) {
  // System.out.println("Pessoa eleitora já votou!");
  // }
  // }
  //
  // public void mostrarResultado () {
  // if (ja existe voto computado?) {
  // return "É preciso ter pelo menos um voto para mostrar o resultado.";
  // }
  // }
  //
  // private double calcularPorcentagemVotos (int indice) {
  // if (ja existe voto computado?) {
  // return "É preciso ter pelo menos um voto para mostrar o resultado.";
  // }
  // }

}
