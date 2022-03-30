package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   * 
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    short choice = 1;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      String input = scanner.next();
      choice = Short.parseShort(input);

      if (choice == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeCandidata = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        String numeroEntrada = scanner.next();
        int numeroCandidata = Integer.parseInt(numeroEntrada);

        gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidata, numeroCandidata);
      } else if (choice == 2) {
        break;
      }
    } while (choice == 1);

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      String input = scanner.next();
      choice = Short.parseShort(input);

      if (choice == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomeEleitora = scanner.next();

        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitora, cpf);
      } else if (choice == 2) {
        break;
      }
    } while (choice == 1);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      String input = scanner.next();
      choice = Short.parseShort(input);

      if (choice == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitora = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        String numeroEntrada = scanner.next();
        int numeroCandidata = Integer.parseInt(numeroEntrada);
        return;
        // gerenciamentoVotacao.votar
      } else if (choice == 2) {
        // mostrar resultado;
        break;
      }
    } while (choice == 1);
    scanner.close();

  }
}
