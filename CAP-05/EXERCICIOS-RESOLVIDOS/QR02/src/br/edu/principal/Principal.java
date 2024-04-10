package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double E = 1;
		for(int i = 1; i <= N; i++) {
			int fat = 1;
			for( int J = 1; J <= i; J++) {
				fat = fat * J;
			}
			E = E + 1.0/fat;
		}
System.out.println("O valor de E é: " + E);
	}

}
