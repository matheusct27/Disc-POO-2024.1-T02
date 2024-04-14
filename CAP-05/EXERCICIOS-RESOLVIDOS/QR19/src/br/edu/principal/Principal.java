package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, soma , i;
		System.out.println("Digite o primeiro número: ");
		m = sc.nextInt();
		System.out.println("Digite o segundo número ( maior que o primeiro): ");
		n = sc.nextInt();
		
		while(m < n) {
			soma = 0;
			for(i = m; i <= n; i++) {
				soma = soma + i;
			}
			System.out.println("A soma dos números de " + m + " até o segundo número " + n + " é: " + soma);
			System.out.println("Primeiro número: " + m);
			m = sc.nextInt();
			System.out.println("Segundo número: " + n);
			n = sc.nextInt();
		}
		
		

	}

}
