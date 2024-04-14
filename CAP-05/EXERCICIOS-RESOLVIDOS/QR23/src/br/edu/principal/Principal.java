package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, qtd, tipo, valor_kw, gasto, acresc = 0, total, tot_geral = 0, qtd_cons = 0;
		
		System.out.println("Digite o salário: "); 
		sal = sc.nextDouble();
		System.out.println("Digite a quantidade: ");
		qtd = sc.nextDouble();
		
		valor_kw = sal/8;
		
		while(qtd != 0) {
			gasto = qtd * valor_kw;
			System.out.println("Digite o tipo(1, 2 ou 3): ");
			tipo = sc.nextDouble();
			
			if(tipo == 1) {
				acresc = gasto * 5/100;
			}
			if(tipo == 2) {
				acresc = gasto * 10/100;
			}
			if(tipo == 3) {
			    acresc = gasto * 15/100;
			}
			total = gasto + acresc;
		    tot_geral = tot_geral + total;
		    if(total >= 500 && total <= 1000) {
		    	qtd_cons = qtd_cons + 1;
		    }
		    System.out.println("GASTO:" + gasto);
		    System.out.println("ACRESCIMO:" + acresc);
		    System.out.println("TOTAL:" + total);
		    System.out.println("Digite a quantidade novamente: ");
		    qtd = sc.nextDouble();
		}
		System.out.println("Total geral: " + tot_geral);
		System.out.println("Quantidade de consumidores: " + qtd_cons);
		
	}

}
