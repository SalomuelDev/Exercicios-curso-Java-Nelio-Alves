package Lista1;

import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores: ");
        double A = sc.nextInt();
        sc.nextLine();
        double B = sc.nextInt();
        sc.nextLine();
        double C = sc.nextInt();

        System.out.printf("A área do triângulo é: %.3f%n", (C * A) /2);
        System.out.printf("A área do círulo é: %.3f%n",(Math.pow(C,2) * 3.14));
        System.out.printf("A área do traézio é: %.3f%n", ((A + B) * C) /2 );
        System.out.printf("A área do Quadrado é: %.3f%n", B*B);
        System.out.printf("A area do retângulo é: %.3f%n", (A * B) /2);

        sc.close();
    }
}
