package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod, num_h, cont_m, cont_f;
		double sal_b = 0, sal_l  , media_m = 0, media_f = 0;
		String sexo;
		
		System.out.println("Digite o código: ");
		cod = sc.nextInt();
		
		cont_m = 0;
		cont_f = 0;
		
		while(cod != 99999) {
			System.out.println("Digite o sexo (M ou F): "); 
			sexo = sc.next();
			
			System.out.println("Digite o número de horas trabalhadas: ");
			num_h = sc.nextInt();
			
			sal_b = num_h * 30;
			sal_l = sal_b - (sexo.equals("M") ? sal_b * 10 / 100 : sal_b * 5 / 100);
			if(sexo == "M") {
			    media_m = media_m + sal_l;
			    cont_m = cont_m + 1;
			}
			if(sexo == "F") {
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
			}
			System.out.println("Código: " + cod);
			System.out.println("Salário bruto: " + sal_b);
			System.out.println("Salário líquido: " + sal_l);
		}
		if(cont_m == 0) {
			System.out.println("Nenhum professor do sexo masculino");
		} else {
			media_m = media_m / cont_m;
			System.out.println("A média de homens é: " + media_m);
		}
		if(cont_f == 0) {
			System.out.println("Nenhuma professora do sexo feminino");
		} else {
			media_f = media_f / cont_f;
		}
		

	}

}
