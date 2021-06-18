package ExTentativas;
import java.util.Scanner;

public class Peca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nome da peca : ");
        String peca = entrada.nextLine();

        int codigo;
        int quantidade;
        double valor;

        System.out.println("Digite codigo da peca : ");
        codigo = entrada.nextInt();
        System.out.println("Digite quantidade de pecas : ");
        quantidade = entrada.nextInt();
        System.out.println("Digite valor da peca : ");
        valor = entrada.nextDouble();

        entrada.close();

    }
}