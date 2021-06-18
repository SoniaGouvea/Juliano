package exerciciosAvengers;

import java.util.Scanner;

public class Ex4ValorComIPI {
    private static double Ipi;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigoPeca1 = 01;
        System.out.println("Codigo da peca1 é: " + codigoPeca1);
        double valor1;
        System.out.println("Digite o valor1: ");
        valor1 = entrada.nextDouble();
        System.out.println("O valor peca1 = " + valor1);
        int quant1;
        System.out.println("Digite quantidade de peca1: ");
        quant1 = entrada.nextInt();
        System.out.println("Quantidade de peca1 = " + (quant1));

        int codigoPeca2 = 02;
        System.out.println("Codigo da peca2 é: " + codigoPeca2);
        double valor2;
        System.out.println("Digite o valor2: ");
        valor2 = entrada.nextDouble();
        System.out.println("O valor peca2 = " + valor2);
        int quant2;
        System.out.println("Digite o quant2: ");
        quant2 = entrada.nextInt();
        System.out.println("quantidade de peca2 = " + (quant2));

        double Ipi;
        System.out.println("Digite valor do IPI: ");
        Ipi = entrada.nextDouble();
        System.out.println("O valor do IPI é= " + Ipi);

        System.out.println("O valor do Total das pecas sem IPI = " + ((valor1*quant1) + (valor2*quant2)));
        double total = (((valor1*quant1) + (valor2*quant2)) * Ipi / 100);
        System.out.println("O valor do IPI e = " + total);
        System.out.println("O valor do Total das pecas e = " + (((valor1*quant1) + (valor2*quant2)) + total));

    }
}
       /*4. Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        -O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) */