package br.edu.principal;

import java.util.Scanner;

public class Principal {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int codigoCliente;
	        double valorInvestido, rendimentoMensal, totalInvestido = 0, totalJuros = 0;

	        do {
	            System.out.println("Informe o código do cliente:");
	            codigoCliente = sc.nextInt();

	            if (codigoCliente <= 0) {
	                break;
	            }

	            System.out.println("Informe o tipo de investimento (1 = P, 2 = P+, 3 = F:");
	            int tipoInvestimento = sc.nextInt();

	            System.out.println("Informe o valor investido:");
	            valorInvestido = sc.nextDouble();
	            totalInvestido = totalInvestido + valorInvestido;

	            double taxa;
	            if (tipoInvestimento == 1) {
	                taxa = 0.015;
	            } else if (tipoInvestimento == 2) {
	                taxa = 0.02;
	            } else if (tipoInvestimento == 3) {
	                taxa = 0.04;
	            } else {
	                System.out.println("Tipo de investimento inválido.");
	                taxa = 0;
	            }

	            rendimentoMensal = valorInvestido * taxa;
	            totalJuros = totalJuros + rendimentoMensal;

	            System.out.println("Rendimento mensal: R$" + rendimentoMensal);
	        } while (codigoCliente > 0);

	        System.out.println("Total investido: R$" + totalInvestido);
	        System.out.println("Total de juros pagos: R$" + totalJuros);

	    }
	}
