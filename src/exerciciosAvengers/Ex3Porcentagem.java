package exerciciosAvengers;

import java.util.Scanner;

public class Ex3Porcentagem {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo;
        double taxaDeReajuste = 1;
//Teste commit
        System.out.println("Digite saldo : ");
        saldo = entrada.nextDouble();
        System.out.println("Saldo é = " + saldo);

        double valorAReajustar;

		valorAReajustar = saldo*taxaDeReajuste;
		System.out.println("O valor a reajustar é = " + saldo * taxaDeReajuste / 100);
		System.out.println("O novo valor é = " + (saldo + (valorAReajustar / 100)));

        entrada.close();
    }
}
      // 3. Informar um saldo e imprimir o saldo com reajuste de 1%.
