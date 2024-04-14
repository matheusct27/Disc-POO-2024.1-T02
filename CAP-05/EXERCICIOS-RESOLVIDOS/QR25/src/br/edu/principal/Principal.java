package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double preco, imp, transp = 0;, seguro, fim , total_imp = 0;
        int origem;
        String meioT, carga;

        System.out.println("Digite o preço do produto (ou 0 para sair):");
        preco = sc.nextDouble();

        while (preco > 0) {
            System.out.println("Digite a origem do produto (1, 2 ou 3):");
            origem = sc.nextInt();

            System.out.println("Digite o meio de transporte (A ou T):");
            meioT = sc.next();

            System.out.println("O produto é carga perigosa? (S ou N):");
            carga = sc.next();

            if (preco <= 100) {
                imp = preco * 5 / 100;
            } else {
                imp = preco * 10 / 100;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    transp = 50;
                } if (origem == 2) {
                    transp = 21;
                } if(origem == 3) {
                    transp = 24;
                }
            } if(carga.equals("N")) {
                if (origem == 1) {
                    transp = 12;
                } if (origem == 2) {
                    transp = 21;
                } if(origem == 3) {
                    transp = 60;
                }
            }

            if (origem == 2 || meioT.equals("A")) {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }
            
             fim = preco + imp + transp + seguro;
 
            total_imp = total_imp + imp;

            System.out.println("Imposto: " + imp);
            System.out.println("Transporte: " + transp);
            System.out.println("Seguro: " + seguro);
            System.out.println("Preço final: " + fim);

            System.out.println("Digite o preço do próximo produto: ");
            preco = sc.nextDouble();
        }

        System.out.println("Total de impostos: " + total_imp);
	}

}
