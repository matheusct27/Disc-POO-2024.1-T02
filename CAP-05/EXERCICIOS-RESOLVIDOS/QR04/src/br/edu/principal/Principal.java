package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0, cid_maior = 0, menor = 0, cid_menor = 0;
		int soma_vei = 0, soma_acid = 0, cont_acid = 0;
		
		for(int cont = 1; cont <= 5; cont++) {
			System.out.println("Digite o código da cidade: ");
			int cod = sc.nextInt();
			System.out.println("Digite o número de veículos de passeio: ");
			int num_vei = sc.nextInt();
			System.out.println("Digite o número de acidentes de trânsito: ");
			int num_acid = sc.nextInt();
			
			soma_vei += num_vei;
			soma_acid += num_acid;
			cont_acid++;
			
			if(cont ==1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			}else {
				if(num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				}if(num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			}
		}
               double media_vei = soma_vei / 5.0;
               double media_acid = soma_acid / (double) cont_acid;
               
               System.out.println("Maior acontecimentos de acidente: " + maior + " (Cidade " + cid_maior + ")");
               System.out.println("Menor acontecimentos de acidentes: " + menor + " (Cidade: " + cid_menor + ")");
               System.out.println("Média de veículos de passeio: " + media_vei);
               System.out.println("Média de acidentes: " + media_acid);

	}

}
