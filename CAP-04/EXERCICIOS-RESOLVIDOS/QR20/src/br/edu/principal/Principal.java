package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int cod_prod, cod_pais, peso_quilos, peso_gramas, pre_total, imposto, valor_total, pre_grama = 0;

        System.out.println("Informe o código do produto, o peso em quilos e o código do país:");
        cod_prod = sc.nextInt();
        peso_quilos = sc.nextInt();
        cod_pais = sc.nextInt();

        peso_gramas = peso_quilos * 1000;
        
        System.out.println("Peso em gramas: " + peso_gramas);

        if (cod_prod >= 1 & cod_prod <= 4) {
            pre_grama = 10;
        } else if (cod_prod >= 5 & cod_prod <= 7) {
            pre_grama = 25;
        } else if (cod_prod >= 8 & cod_prod <= 10) {
            pre_grama = 35;
        }

        pre_total = peso_gramas * pre_grama;
        
        System.out.println("Preço total sem imposto: " + pre_total);

        if (cod_pais == 1) {
            imposto = 0;
        } else if (cod_pais == 2) {
            imposto = pre_total * 15 / 100;
        } else {
            imposto = pre_total * 25 / 100;
        }

        System.out.println("Imposto: " + imposto);

        valor_total = pre_total + imposto;
        System.out.println("Valor total: " + valor_total);
		
		

	}

}
