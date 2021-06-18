package exerciciosAvengers;

import java.util.Scanner;

public class Ex5Salario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    double salario = 788.00;
    double seuSalario;
    double salariosMinimos;

    System.out.println("Digite o valor do seu salario : ");
    seuSalario = entrada.nextDouble();
    System.out.println("O valor do seu salario e  = " + seuSalario);
    salariosMinimos = (seuSalario / salario);

        System.out.println("O seu salario é equivalente á : " + salariosMinimos + " salarios minimos");

    }
}
        /*  5. Crie um algoritmo que leia o valor do salário mínimo
          e o valor do salário de um usuário,
          calcule a quantidade de salários mínimos esse usuário ganha
          e imprima o resultado. (1SM=R$788,00) */