package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int p50Amenor60KG = 0;
	        int total_palturainf150 = 0;
	        int total_p = 6;
	        int pOlhoAzul = 0;
	        int pR_sem_Oazul = 0;
	        double soma_i_A_menor150 = 0;

	        for (int i = 0; i < total_p; i++) {
	            System.out.println("Pessoa " + (i + 1));
	            System.out.print("Idade: ");
	            int idade = sc.nextInt();
	            System.out.print("Peso: ");
	            double peso = sc.nextDouble();
	            System.out.print("Altura: ");
	            double altura = sc.nextDouble();
	            System.out.print("Cor dos olhos (A ou P ou V ou C): ");
	            char corOlhos = sc.next().charAt(0);
	            System.out.print("Cor dos cabelos (P ou C ou L ou R): ");
	            char corCabelos = sc.next().charAt(0);

	            if (idade > 50 && peso < 60) {
	                p50Amenor60KG = p50Amenor60KG + 1;
	            }

	            if (altura < 1.50) {
	            	soma_i_A_menor150 = soma_i_A_menor150 + idade;
	            	total_palturainf150 = total_palturainf150 + 1;
	            }

	            if (corOlhos == 'A') {
	            	pOlhoAzul = pOlhoAzul + 1;
	            }

	            if (corCabelos == 'R' && corOlhos != 'A') {
	            	pR_sem_Oazul = pR_sem_Oazul + 1;
	            }
	        }

	        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + p50Amenor60KG);
	        if (total_palturainf150 > 0) {
	            double media_I_A_Menor150 = soma_i_A_menor150 / total_palturainf150;
	            System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + media_I_A_Menor150);
	        } else {
	            System.out.println("Não houve pessoas com altura inferior a 1,50 m.");
	        }
	        double porc_OAzuis = (double) pOlhoAzul / total_p * 100;
	        System.out.println("Porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: " + porc_OAzuis + "%");
	        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + pR_sem_Oazul);
	    }
	

	}


