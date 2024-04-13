package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, codigo, nht;
        double valor, sal_min, sal_inicial, aux, sal_final;
        String turno, categoria;
        
        sal_min = 450;
        for(cont = 1; cont <= 10; cont++) {
        	System.out.println("Digite o código: ");
        	codigo = sc.nextInt();
        	System.out.println("Digite o número de horas trabalhadas: ");
        	nht = sc.nextInt();
        	System.out.println("Digite o turno: ");
        	turno = sc.next();
        	System.out.println("Digite a categoria: ");
        	categoria = sc.next();
        	
        	while(!(turno.equals("M") || turno.equals("V") || turno.equals("N"))) {
        		System.out.println("Turno invalidado. Informe novamente");
        		turno = sc.next();
        		
        	}
        	while(!(categoria.equals("G") || categoria.equals("O"))) {
        		System.out.println("Categoria invalidada. Informe novamente");
        		categoria = sc.next();
        		
        	}
        	if(categoria.equals("G")) {
        		if(turno.equals("N")) {
        			valor = sal_min * 0.18;
        			
        		} else {
        			valor = sal_min * 0.10;
        		}
        		
        	} else {
        		if(turno.equals("N")) {
        			valor = sal_min * 0.13;
        			
        		} else {
        			valor = sal_min * 0.10;
        		}
        		
        	}
        	
        	sal_inicial = nht * valor;
        	
        	 if(sal_inicial <= 300) {
        		 aux = sal_inicial * 0.20;
        		 
        	 } else if(sal_inicial < 600) {
        		 aux = sal_inicial * 0.15;
        		 
        	 } else {
        		 aux = sal_inicial * 0.05;
        	 }
        	 
        	 sal_final = sal_inicial + aux;
        	 
        	 System.out.println("Código: " + codigo);
        	 System.out.println("Números de horas trabalhadas (nht) :" + nht);
        	 System.out.println("Valor: " + valor);
        	 System.out.println("Salário inicial: " + sal_inicial);
        	 System.out.println("Auxílio: " + aux);
        	 System.out.println("Salário final: " + sal_final);
        }
	}

}
