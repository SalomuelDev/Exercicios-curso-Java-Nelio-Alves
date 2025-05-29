package Lista1;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        int num1 = sc.nextInt();

        double pi = (Math.pow(num1,2) ) * 3.14;

        System.out.printf("A área do círculo é %.4f%n", pi);

        sc.close();
    }
}
