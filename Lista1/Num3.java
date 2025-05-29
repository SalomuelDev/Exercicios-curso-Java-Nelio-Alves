package Lista1;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva 4 numeros: ");
        sc.nextLine();

        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.nextLine();
        int D = sc.nextInt();

        System.out.printf("DIFERENÇA = %d", (A * B - C * D));

        sc.close();
    }
}
