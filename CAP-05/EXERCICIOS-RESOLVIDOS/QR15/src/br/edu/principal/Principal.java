package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, maior_p = 0, menor_p = 0, qtd_b = 0, qtd_n = 0, qtd_c = 0;
		double preco, custo_est = 0, imp = 0, tot_imp = 0, preco_final = 0, adicional = 0;  
		String refri, categ;
		
		for(i = 1; i <= 12; i++) { 
			System.out.println("Digite o preço: "); 
			preco = sc.nextDouble();
			System.out.println("Digite a refrigeração: "); 
			refri = sc.next();
            System.out.println("Digite a categoria: " );
            categ = sc.next();
            
            if(preco <= 20) {
            	if(categ == "A") {
            		custo_est = 2;
            	}
            	if(categ == "L") {
            		custo_est = 3;
            	    
            	}
            	if(categ == "V") {
            		custo_est = 4;
            		
            	}
            }
            if(preco > 20 && preco <= 50) {
            	if(refri == "S") {
            		custo_est = 6;
            	} else {
            		custo_est = 0;
            	}
            }
            if(preco > 50) {
            	if(refri == "S") {
            		if(categ == "A") {
            			custo_est = 5;
            			
            		}
            		if(categ == "L") {
            			custo_est = 2;
            			
            		}
            		if(categ == "V") {
            			custo_est = 4;
            			
            		} else {
            			if(categ == "A" & categ == "V") {
            				custo_est = 0;
            			}
            			if(categ == "L" ) {
            				custo_est = 1;
            			}
            		}
            	}
            }
            if(categ != "A" & refri != "S") {
            	imp = preco * 2/100;
            	imp = preco * 4/100;
        	preco_final = preco + custo_est + imp;
        	System.out.println("Custo de estocagem: " + custo_est);
        	System.out.println("Imposto: " + imp);
        	System.out.println("Preço final: " + preco_final);
            }
        	if(preco_final <= 20) {
        		qtd_b = qtd_b + 1;
        		System.out.println("Classificação: Barato");
        	}
        	if(preco_final > 20 & preco_final <= 100) {
        		qtd_n = qtd_n + 1;
        		System.out.println("Classificação: Normal");
        	}
        	if(preco_final > 100) {
        		qtd_c = qtd_c + 1;
        		System.out.println("Classificação: Caro");
        	}
        	adicional = adicional + custo_est + imp;
        	tot_imp = imp;
        	
        	if(i == 1) {
        		maior_p = (int)preco_final;
        		menor_p = (int)preco_final;
        	} else {
        		if(preco_final > maior_p) {
        			maior_p = (int)preco_final;
        			
        		}
        		if(preco_final < menor_p) {
        			menor_p = (int)preco_final;
        		}
        	}
        	
            }
		adicional = adicional / 12;
		System.out.println("O adicional será de: " + adicional);
		System.out.println("O maior imposto é de: " + maior_p);
		System.out.println("O menor imposto é de: " + menor_p);
		System.out.println("O total de imposto é de: " + tot_imp);
		System.out.println("Quantidade de produtos baratos: " + qtd_b);
		System.out.println("Quantidadee de produtos normais: " + qtd_n);
		System.out.println("Quantidade de produtos caros: " + qtd_c);
		
		
		}
		

	}


