package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida do ângulo em graus: ");
        double angulo = sc.nextDouble();
        int voltas;

        angulo %= 360;

        if (angulo > 360 || angulo < -360) {
            voltas = (int) (angulo / 360);
            angulo %= 360;
        } else {
            voltas = 0;
        }

        String quadrante;
        if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 ||
            angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
            quadrante = "Está em cima de algum dos eixos";
        } else if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
            quadrante = "1o Quadrante";
        } else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
            quadrante = "2o Quadrante";
        } else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
            quadrante = "3o Quadrante";
        } else {
            quadrante = "4o Quadrante";
        }

        String sentido = (angulo < 0) ? "horário" : "anti-horário";

        System.out.println(quadrante);
        System.out.println("Voltas: " + voltas + ", sentido: " + sentido);

	}

}
