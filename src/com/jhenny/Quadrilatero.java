package com.jhenny;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado " + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do retangulo " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapezio " + ((baseMaior + baseMenor) * altura) / 2);
    }
    public static void main(String[] args){
        //Quadrilátero
        System.out.println("Exercicio quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,9);

    }
}
