package Program;

import java.util.Scanner;
import java.util.Locale;
import Nums.Num;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int HowMany = sc.nextInt();
        Num[] numbers = new Num[HowMany];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a numbers: ");
            int num = sc.nextInt();
            numbers[i] = new Num(num);
        }
        double soma = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            soma+= numbers[i].getNum();
        }
        double avg = soma / numbers.length;

        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i].getNum() + " ");
        }
        System.out.printf("\nSum: %.2f%n", soma);
        System.out.printf("Averange %.2f%n", avg);

    }
}
