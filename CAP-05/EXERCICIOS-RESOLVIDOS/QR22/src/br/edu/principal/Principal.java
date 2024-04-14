package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, tot_f = 0, tot_m = 0, somal = 0, cont_ml = 0, cont_m2 = 0, tot = 0, cont_fl = 0, menor_idade = 0;
        String sexo, exp;
        double media_idade = 0, perc = 0;

        System.out.println("Digite a idade (ou 0 para sair):");
        idade = sc.nextInt();

        while (idade != 0) {
            System.out.println("Digite o sexo (M ou F):");
            sexo = sc.next();

            System.out.println("Digite a experiência (S ou N):");
            exp = sc.next();

            if (sexo.equals("F") && exp.equals("S")) {
                if (tot == 0) {
                    menor_idade = idade;
                    tot++;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
                tot_f++;
            } else if (sexo.equals("M")) {
                tot_m++;
                if (exp.equals("S")) {
                    somal += idade;
                    cont_m2++;
                }
                if (idade > 45) {
                    cont_ml++;
                }
            }

            System.out.println("Digite a idade (ou 0 para sair):");
            idade = sc.nextInt();
        }

        System.out.println("Total de mulheres com experiência: " + tot_f);
        System.out.println("Total de homens: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência.");
        } else {
            media_idade = (double) somal / cont_m2;
            System.out.println("Média de idade dos homens com experiência: " + media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            perc = (double) cont_ml * 100 / tot_m;
            System.out.println("Porcentagem de homens com mais de 45 anos: " + perc + "%");
        }

        System.out.println("Total de mulheres com menos de 21 anos de idade e experiência: " + cont_fl);
        System.out.println("Menor idade entre mulheres com experiência: " + menor_idade);
    }
}
			
		

	


