package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int contador = 0;
		        int totalPessoasMais50 = 0;
		        double somaAlturasMais50 = 0;

		        while (true) {
		            System.out.println("Informe a idade da pessoa " + (contador + 1) );
		            int idade = sc.nextInt();

		            if (idade <= 0) {
		                break;
		            }

		            System.out.println("Informe a altura da pessoa " + (contador + 1) );
		            double altura = sc.nextDouble();

		            if (idade > 50) {
		                somaAlturasMais50 = somaAlturasMais50 + altura;
		                totalPessoasMais50 = totalPessoasMais50 + 1;
		            }

		            contador = contador + 1;
		        }

		        if (totalPessoasMais50 > 0) {
		            double mediaAlturasMais50 = somaAlturasMais50 / totalPessoasMais50;
		            System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAlturasMais50 );
		        } else {
		            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
		        }


		    }


	}

