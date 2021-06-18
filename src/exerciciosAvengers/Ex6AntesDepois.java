package exerciciosAvengers;
import java.util.Scanner;

public class Ex6AntesDepois {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println("O numero é: " + numero);

        System.out.println("A sequencia é: " + ((numero - 1) + "," + numero + "," + (numero + 1)));

    }

}

        /* 6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima
         o seu antecessor e seu sucessor */