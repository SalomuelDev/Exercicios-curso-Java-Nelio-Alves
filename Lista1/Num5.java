package Lista1;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(Peça 1) Digite o codigo de uma peça, o numero de peças e o valor de cada peça 1. (EXEMPLO: 10 30  1)");

        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();
        sc.nextLine();
        double num3 = sc.nextInt();
        sc.nextLine();

        double soma = num2 * num3;

        System.out.println("(Peça 2) Digite o codigo de uma peça, o numero de peças e o valor de cada peça 1. (EXEMPLO: 10 30  1)");

        int num4 = sc.nextInt();
        sc.nextLine();
        int num5 = sc.nextInt();
        sc.nextLine();
        double num6 = sc.nextInt();
        sc.nextLine();

        double soma2 = num5 * num6;

        System.out.printf("VALOR A PAGAR: R$ %.2f", soma + soma2);

        sc.close();
    }
}
