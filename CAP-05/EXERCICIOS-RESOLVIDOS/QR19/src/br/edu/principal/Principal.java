package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, soma , i;
		System.out.println("Digite o primeiro n�mero: ");
		m = sc.nextInt();
		System.out.println("Digite o segundo n�mero ( maior que o primeiro): ");
		n = sc.nextInt();
		
		while(m < n) {
			soma = 0;
			for(i = m; i <= n; i++) {
				soma = soma + i;
			}
			System.out.println("A soma dos n�meros de " + m + " at� o segundo n�mero " + n + " �: " + soma);
			System.out.println("Primeiro n�mero: " + m);
			m = sc.nextInt();
			System.out.println("Segundo n�mero: " + n);
			n = sc.nextInt();
		}
		
		

	}

}
