package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

		    System.out.println("Digite o pre�o atual do produto:");
		    double preco = sc.nextDouble();
		        
		    System.out.println("Digite o c�digo do produto:");
		    int codigo = sc.nextInt();

		        double desconto = 0;
		        if (preco <= 30) {
		            desconto = 0;
		        } else if (preco > 30 && preco <= 100) {
		            desconto = 10/100;
		        } else {
		            desconto = 15/100;
		        }
           double valorDesconto = preco * desconto;
           double novoPreco = preco - valorDesconto;

           System.out.println("C�digo do produto: " + codigo);
           System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
           System.out.println("Valor do desconto: R$" + valorDesconto);
           System.out.println("Novo pre�o: R$" + novoPreco);

		        
		    }
		}


	}

}
