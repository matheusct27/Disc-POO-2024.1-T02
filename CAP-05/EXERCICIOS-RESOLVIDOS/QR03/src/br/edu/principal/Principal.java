package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do número:");
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			System.out.println("Digite o " + i + "° número: ");
			int num = sc.nextInt();
			int fat = 1;
			for(int J = 1; J <= num; J++) {
				fat = fat * J;
			}
			System.out.println("o valor é: " + fat);
			}
		}

	}


