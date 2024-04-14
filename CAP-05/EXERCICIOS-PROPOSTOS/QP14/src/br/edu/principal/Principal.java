package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int contador = 0;
		        int somaIdadesOtimo = 0;
		        int pessoasRegular = 0;
		        int pessoasBom = 0;
		        int totalPessoasOtimo = 0;

		        while (contador < 15) {
		            System.out.println("Informe a idade do espectador " + (contador + 1) );
		            int idade = sc.nextInt();

		            System.out.println("Informe a opinião do espectador (otimo = 3, bom = 2, regular = 1) " + (contador + 1) );
		            int opiniao = sc.nextInt();

		            if (opiniao == 3) {
		                somaIdadesOtimo = somaIdadesOtimo + idade;
		                totalPessoasOtimo = totalPessoasOtimo + 1;
		            } else if (opiniao == 1) {
		                pessoasRegular = pessoasRegular + 1;
		            } else if (opiniao == 2) {
		                pessoasBom = pessoasBom + 1;
		            }

		            contador = contador + 1;
		        }

		        double mediaIdadesOtimo = totalPessoasOtimo > 0 ? somaIdadesOtimo / (double) totalPessoasOtimo : 0;
		        double percentualBom = pessoasBom / 15.0 * 100;

		        System.out.println("Média das idades das pessoas que responderam ótimo: " + mediaIdadesOtimo);
		        System.out.println("Quantidade de pessoas que responderam regular: " + pessoasRegular);
		        System.out.println("Percentual de pessoas que responderam bom: " + percentualBom + "%");
		    }
		


	}


