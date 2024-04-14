package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int cod_est, cod_carga;
        double peso_toneladas, peso_quilos, pre_carga, imposto, valor_total;

        System.out.print("Digite o código da estação: ");
        cod_est = sc.nextInt();

        System.out.print("Digite o peso da carga em toneladas: ");
        peso_toneladas = sc.nextDouble();

        System.out.print("Digite o código da carga: ");
        cod_carga = sc.nextInt();

        peso_quilos = peso_toneladas * 1000;

        System.out.println("Peso em quilos: " + peso_quilos);

        if (cod_carga >= 10 && cod_carga <= 20) {
            pre_carga = 100 * peso_quilos;
        } else if (cod_carga >= 21 && cod_carga <= 30) {
            pre_carga = 250 * peso_quilos;
        } else if (cod_carga >= 31 && cod_carga <= 40) {
            pre_carga = 340 * peso_quilos;
        } else {
            System.out.println("Código de carga inválido.");
            return;
        }

        System.out.println("Preço da carga: " + pre_carga);

        if (cod_est >= 1 && cod_est <= 5) {
            double[] taxas = {0.35, 0.25, 0.15, 0.05, 0};
            imposto = taxas[cod_est - 1] * pre_carga;
        } else {
            System.out.println("Código de estação inválido.");
            return;
        }

        System.out.println("Imposto: " + imposto);

        valor_total = pre_carga + imposto;

        System.out.println("Valor total: " + valor_total);

	}

}
