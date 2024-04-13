package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, n1, n2, media, ta = 0, te = 0, tr = 0;
		double media_classe, total_classe;
		
		total_classe = 0;
		for(cont = 1; cont <= 6; cont++) {
			System.out.println("Digite a nota 1: ");
			n1 = sc.nextInt();
			System.out.println("Digite a nota 2: ");
			n2 = sc.nextInt();
			
			media = (n1 + n2) / 2;
			System.out.println("Média: " + media);
			
			if(media <= 3) {
				tr = tr + 1;
				System.out.println("Reprovado");
			}
			if(media > 3 && media < 7) {
				te = te + 1;
				System.out.println("Exame");
			}
			if(media >= 7) {
				ta = ta + 1;
				System.out.println("Aprovado");
				
			}
			
			total_classe = total_classe + media;
		}
		
		System.out.println("Total de reprovados: " + tr);
		System.out.println("Total de exames: " + te);
		System.out.println("Total de aprovados: " + ta);
		
		media_classe = total_classe/6;
		
		System.out.println("A média da classe é: " + media_classe);
		

	}

}
