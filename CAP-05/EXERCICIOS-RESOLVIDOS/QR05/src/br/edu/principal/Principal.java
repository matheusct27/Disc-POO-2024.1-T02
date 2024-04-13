package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fim, i, j, x, expoente, num_termos;
        double den = 0, denominador, fat, s;

        System.out.print("Digite o número de termos da série: ");
        num_termos = scanner.nextInt();
        System.out.print("Digite o valor de x: ");
        x = scanner.nextInt();

        s = 0;
        denominador = 1;

        for (i = 1; i <= num_termos; i++) {
            fim = (int) denominador;
            fat = 1;

            for (j = 1; j <= fim; j++) {
                fat = fat * j;
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s = s - Math.pow(x, expoente) / fat;
            } else {
                s = s + Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador++;
            } else {
                denominador--;
            }
        }

        System.out.println("Resultado da série: " + s);
    }
}
