package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in);

		    System.out.println("Digite o primeiro n�mero:");
		        double numero1 = sc.nextDouble();

		        System.out.println("Digite o segundo n�mero:");
		        double numero2 = sc.nextDouble();

		        System.out.println("Escolha a opera��o:");
		        System.out.println("1 - M�dia entre os n�meros digitados");
		        System.out.println("2 - Diferen�a do maior pelo menor");
		        System.out.println("3 - Produto entre os n�meros digitados");
		        System.out.println("4 - Divis�o do primeiro pelo segundo");

		        int escolha = sc.nextInt();

		        if (escolha == 1) {
		            double media = (numero1 + numero2) / 2;
		            System.out.println("M�dia: " + media);
		        } else if (escolha == 2) {
		            double diferenca = (numero1 - numero2);
		            System.out.println("Diferen�a: " + diferenca);
		        } else if (escolha == 3) {
		            double produto = numero1 * numero2;
		            System.out.println("Produto: " + produto);
		        } else if (escolha == 4) {
		            if (numero2 != 0) {
		                double divisao = numero1 / numero2;
		                System.out.println("Divis�o: " + divisao);
		            } else {
		                System.out.println("Erro: divis�o por zero.");
		            }
		        } else {
		            System.out.println("Erro: Op��o inv�lida.");
		        }

		       
		    }



	}

