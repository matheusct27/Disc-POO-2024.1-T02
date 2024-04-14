package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, quad, cubo;
		double raiz;
		
		System.out.println("Digite um número positivo e maior que zero: ");
		num = sc.nextInt();
		
		while(num > 0) {
			quad = num * num;
			cubo = num * num * num;
			raiz = Math.sqrt(num);
			
			System.out.println("quadrado: " + quad);
			System.out.println("cubo: " + cubo);
			System.out.println("raíz: " + raiz);
			
			System.out.println("Digite um número para sair:" );
			num = sc.nextInt();
		}
		
		
	}

}
