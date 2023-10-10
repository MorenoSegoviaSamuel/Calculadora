package com.example.calculadora;

public class Calculadora {

    public static String calculator(String cadena) {
        int mas, menos, multiplica;


        try {
             if (cadena.contains("+")) {
                mas = cadena.indexOf("+");
                String num1 = cadena.substring(0,(mas));
                String num2 = cadena.substring((mas)+1,cadena.length());
                return String.valueOf(Integer.parseInt(calculator(num1)) + Integer.parseInt(calculator(num2)));
            } else if (cadena.contains("-")) {
                menos = cadena.indexOf("-");
                String num1 = cadena.substring(0,(menos));
                String num2 = cadena.substring((menos)+1,cadena.length());
                return String.valueOf(Integer.parseInt(calculator(num1)) - Integer.parseInt(calculator(num2)));
            } else if (cadena.contains("*")) {
                 multiplica = cadena.indexOf("*");
                 String num1 = cadena.substring(0,(multiplica));
                 String num2 = cadena.substring((multiplica)+1,cadena.length());
                 return String.valueOf(Integer.parseInt(calculator(num1)) * Integer.parseInt(calculator(num2)));
            }
        } catch (Exception e){
            cadena = "-1";
        }
        return cadena;
    }
}
/*
(cadena.contains("*")) {
                multiplica = cadena.indexOf("*");
                String num1 = cadena.substring(0,(multiplica));
                String num2 = cadena.substring((multiplica)+1,cadena.length());
                return String.valueOf(Integer.parseInt(calculator(num1)) * Integer.parseInt(calculator(num2)));
*/