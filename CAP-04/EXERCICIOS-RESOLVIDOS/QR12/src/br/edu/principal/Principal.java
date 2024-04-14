package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int sal, aum, n_sal, cargo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o cargo do funcionário (1,2,3,4 ou 5): ");
		cargo = sc.nextInt();
		
		
		System.out.println("\nDigite o valor do salário: ");
		sal = sc.nextInt();
		System.out.println("O salário é: "+ sal);
		
		if(cargo == 1) {
			System.out.println("O cargo é Escriturário");
			aum = sal * 50 / 100;
			System.out.println("O valor do aumento é: "+ aum);
			n_sal = sal + aum;
			System.out.println("O novo salário é: "+ n_sal);
		}else if(cargo == 2) {
		System.out.println("O cargo é Secretário");
		aum = sal * 35 / 100;
		System.out.println("O valor do aumento é: "+ aum);
		n_sal = sal + aum;
		System.out.println("O novo salário é: "+ n_sal);
		}else if(cargo == 3) {
			System.out.println("O cargo é Caixa");
			aum = sal * 20 / 100;
			System.out.println("O valor do aumento é: "+ aum);
			n_sal = sal + aum;
			System.out.println("O novo salário é: "+ n_sal);
		}else if(cargo == 4) {
			System.out.println("O cargo é Gerente");
			aum = sal * 10 / 100;
			System.out.println("O valor do aumento é: "+ aum);
			n_sal = sal + aum;
			System.out.println("O novo salário é: "+ n_sal);
		}else if(cargo == 5) {
			System.out.println("O cargo é Diretor");
			aum = sal * 0 / 100;
			System.out.println("O valor do aumento é: "+ aum);
			n_sal = sal + aum;
			System.out.println("O novo salário é: "+ n_sal);
		}else {
			System.out.println("Cargo enexistente!");
		}
		
	}

}
