package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  ArrayList<String> cpfComputado = new ArrayList<String>();
  int totalVotos;

  public GerenciamentoVotacao() {}

  /**
   * Método para cadastro da Pessoa Candidata.
   * 
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    Boolean numeroJaCadastrado = false;
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        numeroJaCadastrado = true;
      }
    }
    if (numeroJaCadastrado == false) {
      PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(pessoaCandidata);
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
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  /**
   * Método para votar.
   * 
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    Boolean cpfJaComputou = cpfComputado.contains(cpfPessoaEleitora);
    if (cpfJaComputou == true) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        if (pessoaCandidata.getNumero() == (numeroPessoaCandidata)) {
          pessoaCandidata.receberVoto();
        }
      }
      cpfComputado.add(cpfPessoaEleitora);
      totalVotos += 1;
    }
  }

  /**
   * Método para mostrar resultado.
   * 
   */
  public void mostrarResultado() {
    String resultado = "";
    if (totalVotos <= 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        resultado += "Nome: " + pessoaCandidata.getNome() + " - " + pessoaCandidata.getVotos()
            + " votos ( " + calcularPorcentagemVotos(pessoasCandidatas.indexOf(pessoaCandidata))
            + " )" + "\n";
      }
    }
    System.out.println(resultado + "\n" + "Total de votos: " + totalVotos);
  }

  /**
   * Método para calcular porcentagem.
   * 
   */
  private double calcularPorcentagemVotos(int indice) {
    int votos = this.pessoasCandidatas.get(indice).getVotos();
    double resultado = (votos * 100.0) / this.totalVotos;
    return resultado;
  }

}
