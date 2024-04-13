package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	 int i; 
	 double valor_inicial, juros = 0, valor_parc, total, valor_juros, num_parc = 1;
	 
	 System.out.println("Digite o valor inicial da sua dívida: ");
	 valor_inicial = sc.nextDouble();
	 
	 total = valor_inicial;
	 valor_parc = valor_inicial;
	 
	 System.out.println("O total da divida é: " + total);
	 System.out.println("O valor do juros inicial: " + juros);
	 System.out.println("O número da parcela: " + num_parc); 
	 System.out.println("O valor da parcela inicial " + valor_parc); 
	 
	 juros = juros + 10;
	 num_parc = num_parc + 2;
	 
	 for(i = 1; i <= 4; i++) {
		 valor_juros = valor_inicial * juros/100;
		 total = valor_inicial + valor_juros; 
		 valor_parc = total / num_parc;
		  
		 System.out.println("valor total da divida: " + total);
		 System.out.println("O valor do juros é: " + valor_juros); 
		 System.out.println("O  número da parcela: " + num_parc);
		 System.out.println("O valor da sua parcela é: " + valor_parc);
		 
		 juros = juros + 5;
		 num_parc = num_parc + 3;
		 
	 }
	 

	}

}
