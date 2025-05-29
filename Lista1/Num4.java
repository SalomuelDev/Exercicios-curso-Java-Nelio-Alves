package Lista1;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu número de identificação?: ");
        int num = sc.nextInt();

        System.out.println("Número de horas trabalhadas: ");
        int hora = sc.nextInt();

        System.out.println("Valor recebido por horas trabalhadas: ");
        double valor = sc.nextInt();

        System.out.printf("Numero de identificação: %d%n Salário: U$ %.2f%n", num, hora * valor);

        sc.close();
    }
}
