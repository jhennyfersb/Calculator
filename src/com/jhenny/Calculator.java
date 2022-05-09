package com.jhenny;

public class Calculator {
    //Classe de exemplo do exercico para Calcular os valores

    public static void soma(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("a soma de " + num1 + " mais " + num2 + " é " + resultado);
    }

    public static void subtracao(double num1 , double num2){
        double resultado = num1 - num2;
        System.out.println("a subtração de " + num1 + " menos " + num2 + " é " + resultado);
    }
    public static void divisao( double num1, double num2){
        double resultado = num1 / num2;
        System.out.println("a divisão de " + num1 + " dividido " + num2 + " é " + resultado);
    }
    public static void multiplicacao( double num1, double num2){
        double resultado = num1 * num2;
        System.out.println("a multplicação de " + num1 + " vezes " + num2 + " é " + resultado);

    }
    public static void main(String[] args){

        //Calculadora
        System.out.println("exercicio calculadora");
        Calculator.soma(3,6);
        Calculator.soma(9,1.8);
        Calculator.divisao(5,2.5);
        Calculator.multiplicacao(7,8);
        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);






    }
}