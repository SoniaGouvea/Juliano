package exerciciosAvengers;
import java.util.Scanner;

public class Ex2Media {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Primeira Média

        float x = 8;
        float y = 7;
        float z = 9;
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);

        System.out.println("Soma = " + (x+y+z));
        float media1 = ((x+y+z)/3);
        System.out.println("Media1 = " + media1);

        //Segunda Média

        float a = 5;
        float b = 4;
        float c = 6;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

        System.out.println("Soma = " + (a+b+c));
        float media2 = ((a+b+c)/3);
        System.out.println("Media2 = " + media2);

        //Terceira Média

        float soma = (media1 + media2);
        System.out.println("Soma das duas médias é: = " + soma);
        float media3 = ((media1 + media2)/2);
        System.out.println("Media3 = " + media3);

        entrada.close();
    }
}
       /* 2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
        A média dos números 4, 5 e 6.
        A soma das duas médias.
        A média das médias.
        */
