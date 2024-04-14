package br.edu.principal;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1; 
        int ano = cal.get(Calendar.YEAR);

       
        String nomeMes = obterNomeMes(mes);

       
        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " - " + nomeMes + " - ");

     
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int minuto = cal.get(Calendar.MINUTE);

        
        System.out.println("Hora Atual: " + hora + ":" + minuto);
	}
	public static String obterNomeMes(int mes) {
        switch (mes) {
            case 1:
                return "janeiro";
            case 2:
                return "fevereiro";
            case 3:
                return "março";
            case 4:
                return "abril";
            case 5:
                return "maio";
            case 6:
                return "junho";
            case 7:
                return "julho";
            case 8:
                return "agosto";
            case 9:
                return "setembro";
            case 10:
                return "outubro";
            case 11:
                return "novembro";
            case 12:
                return "dezembro";
            default:
                return "";
        }
	}
}
