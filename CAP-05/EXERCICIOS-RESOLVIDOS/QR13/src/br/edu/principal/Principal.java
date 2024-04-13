package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, num_cri, meses, tot_f = 0, tot_m = 0, tot_24 = 0;
		double porc_f, porc_m, porc_24;
		String sexo;
		
		System.out.println("Digite o n�mero de crian�as nascidas no periodo: ");
		num_cri = sc.nextInt();
		
		for( i = 1; i <= num_cri; i++) {
			System.out.println("Digite o sexo da " + i + "� crian�a");
			sexo = sc.next();
			
			System.out.println("Digite o tempo de vida (em meses) da " + i + "� crian�a");
			meses = sc.nextInt();
			
			if(sexo == "M") {
				tot_m = tot_m + 1;
				
			}
			if(sexo == "F") {
				tot_f = tot_f + 1;
			}
			if(meses <= 24) {
				tot_24 = tot_24 + 1;
			}
			
			
		}
		
		if(num_cri == 0) {
			System.out.println("Nenhuma crian�a digitada");
		} else {
			porc_m = tot_m * 100 / num_cri;
			porc_f = tot_f * 100/ num_cri;
			porc_24 = tot_24 * 100/ num_cri;
			
			System.out.println("Percentual de crian�as do sexo feminino mortas " + porc_f);
			System.out.println("Percentual de crian�as do sexo masculino mortas " + porc_m);
			System.out.println("Percentual de crian�as de 24 meses ou menos mortas no per�odo " + porc_24);
		}
		

	}

}
