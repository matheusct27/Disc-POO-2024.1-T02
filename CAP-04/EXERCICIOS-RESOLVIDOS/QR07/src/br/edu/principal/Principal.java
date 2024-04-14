package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int A, B, C, I;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um valor para A: ");
		A = sc.nextInt();
		System.out.println("Valor de A é "+A+"\n");
		
		System.out.println("Digite um valor para B: "+"\n");
		B = sc.nextInt();
		System.out.println("Valor de B é "+B+"\n");
		
		System.out.println("Digite um valor para C: "+"\n");
		C = sc.nextInt();
		System.out.println("Valor de C é "+C +"\n");
		
		System.out.println("Digite um valor para I (1, 2 ou 3): "+"\n");
		I = sc.nextInt();
		System.out.println("Valor de I é "+I +"\n");
		
		
		if(I == 1) {
			if(A<B & A<C) {
				if(B<C) {
					System.out.println("A ordem crescente dos números é: "+A+"-"+B+"-"+C);
				}else {
					System.out.println("A ordem crescente dos números é: "+A+"-"+C+"-"+B);
					
				}
			}
		if(B<A & B<C){
			if(A<C) {
				System.out.println("A ordem crescente dos números é: "+B+"-"+A+"-"+C);
				
			}else {
				System.out.println("A ordem crescente dos números é: "+B+"-"+C+"-"+A);
			}
		}	
		if(C<A & C<B){
			if(A<B) {
				System.out.println("A ordem crescente dos números é: "+C+"-"+A+"-"+B);
				
			}else {
				System.out.println("A ordem crescente dos números é: "+C+"-"+B+"-"+A);
			}
		}	
		}
		
		
		if(I == 2) {
			if(A>B & A>C) {
				if(B>C) {
					System.out.println("A ordem decrescente dos números é: "+A+"-"+B+"-"+C);
				}else {
					System.out.println("A ordem decrescente dos números é: "+A+"-"+C+"-"+B);
					
				}
			}
			
			
			if(B>A & B>C){
				if(A>C) {
					System.out.println("A ordem decrescente dos números é: "+B+"-"+A+"-"+C);
					
				}else {
					System.out.println("A ordem decrescente dos números é: "+B+"-"+C+"-"+A);
				}
			}	
			
			
			if(C>A & C>B){
				if(A>B) {
					System.out.println("A ordem decrescente dos números é: "+C+"-"+A+"-"+B);
					
				}else {
					System.out.println("A ordem decrescente dos números é: "+C+"-"+B+"-"+A);
				}
			}	
		}
		
		if(I == 3) {
			if(A>B & A>C) {
				System.out.println("A ordem desejada é: "+B+"-"+A+"-"+C);
			}
			if(B>A & B>C) {
				System.out.println("A ordem desejada é: "+A+"-"+B+"-"+C);
			}
			if(C>A & C>B) {
				System.out.println("A ordem desejada é: "+A+"-"+C+"-"+B);
			}
			
		}
		
		
	}
}
