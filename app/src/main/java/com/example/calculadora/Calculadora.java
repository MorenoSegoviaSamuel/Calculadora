package com.example.calculadora;

/**
 *Clase calculadora para poder sumar, restar o multiplicar parametros.
 * @author Samuel Moreno Segovia
 * @version 10/10/23A
 */
public class Calculadora {

        /**
         * El metodo que permite calcular la operación.
        * @return cadena El resultado de la operación.
         *@param cadena La operación que el usuario quiere calcular.
        */
    public static String calculator(String cadena)  {
        /**
         * parametros mas, menos y multiplica son delimitadores
         */
        int mas, menos, multiplica;

        try {
            /**
             * la condicion para sumar
             */
             if (cadena.contains("+")) {
                mas = cadena.indexOf("+");
                String num1 = cadena.substring(0,(mas));
                String num2 = cadena.substring((mas)+1,cadena.length());
                return String.valueOf(Integer.parseInt(calculator(num1)) + Integer.parseInt(calculator(num2)));
                 /**
                  * la condicion para restar
                  */
            } else if (cadena.contains("-")) {
                menos = cadena.indexOf("-");
                String num1 = cadena.substring(0,(menos));
                String num2 = cadena.substring((menos)+1,cadena.length());
                return String.valueOf(Integer.parseInt(calculator(num1)) - Integer.parseInt(calculator(num2)));
                 /**
                  * la condicion para el producto
                  */
            } else if (cadena.contains("*")) {
                 multiplica = cadena.indexOf("*");
                 String num1 = cadena.substring(0,(multiplica));
                 String num2 = cadena.substring((multiplica)+1,cadena.length());
                 return String.valueOf(Integer.parseInt(calculator(num1)) * Integer.parseInt(calculator(num2)));
            }
            /**
             * Error que devuelve -1 cuando la operación es imposible
             * @return "-1"
             */
        } catch (Exception e){
            return "-1";
        }
        return cadena;
    }
}
