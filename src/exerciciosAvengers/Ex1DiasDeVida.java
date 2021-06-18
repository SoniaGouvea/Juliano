package exerciciosAvengers;

import java.util.Scanner;

public class Ex1DiasDeVida {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int anos ;
        int meses;
        int dias;
        System.out.println("Digite quantos anos: ");
        anos = entrada.nextInt();
        System.out.println("Digite quantos meses: ");
        meses = entrada.nextInt();
        System.out.println("Digite quantos dias: ");
        dias = entrada.nextInt();

        int idade;
        System.out.println("idade em dias= " + ((anos*365) + (meses*30) + dias));
    }
}
        /*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
         e mostre-a expressa em dias.
         Leve em consideração o ano com 365 dias e o mês com 30.
         (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         */