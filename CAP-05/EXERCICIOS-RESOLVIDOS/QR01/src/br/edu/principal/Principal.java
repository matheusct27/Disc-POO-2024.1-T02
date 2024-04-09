/*
 * Trabalho de POO Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
 * a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00.
 * b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
 * c) A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano
 * anterior.
 * Date: 09/04/24
 * LastUpdate: 09/04/24
 */
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o ano atual: " );
	    int ano_atual = sc.nextInt();
	    // Calculo do salário novo
	    int salario = 1000;
	    double percentual = 0.015;
	    double novo_salario = salario + percentual * salario;
	    int i = 2006;
	    while(i <= ano_atual) {
	    	  percentual *= 2;
	    	 novo_salario += salario * percentual;
	    	 i++;
	    }
	    // Exibe o resultado.
		System.out.println("O novo salário do funcionário é: " + novo_salario);
		
	}

}
