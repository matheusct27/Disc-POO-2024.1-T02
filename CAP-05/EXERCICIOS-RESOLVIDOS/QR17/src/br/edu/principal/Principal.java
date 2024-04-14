package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int meses = 0;
		double sal_carlos, sal_joao;
		
		System.out.println("Digite o salário de carlos: ");
		sal_carlos = sc.nextDouble();
		
		sal_joao = sal_carlos / 3;
		
		while(sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * 2/100);
			sal_joao = sal_joao + (sal_joao * 5/100);
			meses = meses + 1;
		}
		System.out.println("A quantidade de meses para que João iguale ou ultrapasse Carlos é: " + meses);

	}

}
