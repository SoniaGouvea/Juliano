package ExTentativas;
import java.util.Scanner;

public class PorcentagemIPI {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigoDaPeca;
        //String peca1;
       // String peca2;
        double priceDaPeca;
        int quantidade;

       // System.out.println("peca1");
        //String peca1 = entrada.sc.nextLine();

        System.out.println("Digite Codigo da peça : ");
        codigoDaPeca = entrada.nextInt();
        System.out.println("Digite preço : ");
        priceDaPeca = entrada.nextDouble();
        System.out.println("Digite quantidade : ");
        quantidade = entrada.nextInt();

        if (codigoDaPeca == 01) {
            System.out.println("peca1");
        } else if (codigoDaPeca == 02){
            System.out.println("valor2: " + (priceDaPeca*quantidade));
        }  else {
            System.out.println("peca não existe");

        }

    }
}
