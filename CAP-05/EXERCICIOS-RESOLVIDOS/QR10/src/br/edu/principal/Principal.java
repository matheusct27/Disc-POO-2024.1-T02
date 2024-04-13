package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont_time, cont_jog, idade;
		double peso, alt, qtde, media_idade, media_altura = 0, porc, tot80;
		
		qtde = 0;
        tot80 = 0;
        
        for(cont_time = 1; cont_time <= 5; cont_time++) {
        	media_idade = 0;
        	
        	for(cont_jog = 1; cont_jog <= 11; cont_jog++) {
        		System.out.println("Digite a idade: ");
        		idade = sc.nextInt();
        		System.out.println("Digite o peso: ");
        		peso = sc.nextDouble();
        		System.out.println("Digite a altura: ");
        		alt = sc.nextDouble();
        		
        		if(idade < 18) {
        			qtde = qtde + 1;
        			media_idade = media_idade + idade;
        			media_altura = media_altura + alt;
        		}
        		if(peso > 80) {
        			tot80 = tot80 + 1;
        		}
        		
        	}
        	System.out.println("A média de idade do time " + cont_time + ": " + (media_idade/11));
        }
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);
        System.out.println("Média de altura dos jogadores: " + (media_altura/55));
        
        porc = (tot80 * 100.0) / 55;
        
        System.out.println("Porcentagem de jogadores com peso maior que 80kg: " + porc + "%");
        
        
	}

}
