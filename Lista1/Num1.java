package Lista1;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2= sc.nextInt();

        System.out.printf("A soma dos números é: %d%n", num1 + num2);

        sc.close();
    }
}