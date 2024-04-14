package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int op;
	        double sal, imp, aum, novo_sal;

	        do {
	            System.out.println("MENU DE OP��ES");
	            System.out.println("1- Imposto");
	            System.out.println("2- Novo Sal�rio");
	            System.out.println("3- Classifica��o");
	            System.out.println("4- Finalizar o programa");
	            System.out.println("Digite a op��o desejada:");
	            op = sc.nextInt();

	            if (op > 4 || op < 1) {
	                System.out.println("Op��o inv�lida !");
	            } else if (op == 1) {
	                System.out.println("Digite o sal�rio:");
	                sal = sc.nextDouble();
	                if (sal < 500) {
	                    imp = sal * 5 / 100;
	                } else if (sal >= 500 && sal <= 850) {
	                    imp = sal * 10 / 100;
	                } else {
	                    imp = sal * 15 / 100;
	                }
	                System.out.println("Imposto: " + imp);
	            } else if (op == 2) {
	                System.out.println("Digite o sal�rio:");
	                sal = sc.nextDouble();
	                if (sal > 1500) {
	                    aum = 25;
	                } else if (sal >= 750 && sal <= 1500) {
	                    aum = 50;
	                } else if (sal >= 450 && sal < 750) {
	                    aum = 75;
	                } else {
	                    aum = 100;
	                }
	                novo_sal = sal + (sal * aum / 100);
	                System.out.println("Novo sal�rio: " + novo_sal);
	            } else if (op == 3) {
	                System.out.println("Digite o sal�rio:");
	                sal = sc.nextDouble();
	                if (sal <= 700) {
	                    System.out.println("Mal Remunerado");
	                } else {
	                    System.out.println("Bem Remunerado");
	                }
	            }
	        } while (op != 4);
	    }
	}
        
	
