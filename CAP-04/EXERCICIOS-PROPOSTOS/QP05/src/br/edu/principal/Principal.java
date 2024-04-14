package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in);

		    System.out.println("Digite o primeiro número:");
		        double numero1 = sc.nextDouble();

		        System.out.println("Digite o segundo número:");
		        double numero2 = sc.nextDouble();

		        System.out.println("Escolha a operação:");
		        System.out.println("1 - Média entre os números digitados");
		        System.out.println("2 - Diferença do maior pelo menor");
		        System.out.println("3 - Produto entre os números digitados");
		        System.out.println("4 - Divisão do primeiro pelo segundo");

		        int escolha = sc.nextInt();

		        if (escolha == 1) {
		            double media = (numero1 + numero2) / 2;
		            System.out.println("Média: " + media);
		        } else if (escolha == 2) {
		            double diferenca = (numero1 - numero2);
		            System.out.println("Diferença: " + diferenca);
		        } else if (escolha == 3) {
		            double produto = numero1 * numero2;
		            System.out.println("Produto: " + produto);
		        } else if (escolha == 4) {
		            if (numero2 != 0) {
		                double divisao = numero1 / numero2;
		                System.out.println("Divisão: " + divisao);
		            } else {
		                System.out.println("Erro: divisão por zero.");
		            }
		        } else {
		            System.out.println("Erro: Opção inválida.");
		        }

		       
		    }



	}

