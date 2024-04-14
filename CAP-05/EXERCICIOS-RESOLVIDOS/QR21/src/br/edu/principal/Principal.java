package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtd_par = 0, qtd_impar = 0, soma_par = 0;
        double media_par = 0, media = 0, perc = 0;
		
		
		System.out.println("Digite um número(ou 30000 para sair): ");
		num = sc.nextInt();
		
		while(num != 30000) {
			
			if(qtd == 0) {
				maior = num;
				menor = num;
			} else {
				if(num > maior) {
					maior = num;
				}
				if(num < menor) {
					menor = num;
				}
				
			}
			
			soma = soma + num;
			qtd = qtd + 1;
			
			if(num % 2 == 0) {
				soma = soma_par + num;
				qtd_par = qtd_par + 1;
				
			}else {
				qtd_impar = qtd_impar + 1;
			}
			
			System.out.println("Digite um número (ou 30000 para sair):");
            num = sc.nextInt();
			
		}
		
		if(qtd == 0) {
			System.out.println("Nenhum número digitado");
		} else {
			System.out.println("Soma:" + soma);
			System.out.println("Quantidade: " + qtd);
			media = (double)soma / qtd;
			System.out.println("Média: " + media);
			System.out.println("Maior número: " + maior);
			System.out.println("Menor número: " + menor);
			
			if(qtd_par == 0) {
				System.out.println("Nenhum par");
			} else {
				media_par = (double)soma_par / qtd_par;
				System.out.println("Média de parcelas: " + media_par);
			}
			perc = (double)qtd_impar * 100 / qtd;
			System.out.println("Percentual de impares " + perc + "%");
		}
		

	}

}
