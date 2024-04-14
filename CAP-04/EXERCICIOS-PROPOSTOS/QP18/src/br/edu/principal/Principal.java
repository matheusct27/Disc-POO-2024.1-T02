package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

		     System.out.println("Digite a idade da pessoa:");
		       int idade = sc.nextInt();

		       if (idade >= 18) {
		        System.out.println("Maior de idade.");
		     } else {
		        System.out.println("Menor de idade.");
		        }

		}


	}


