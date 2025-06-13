package Main;

import java.util.Scanner;
import java.util.Locale;
import Entities.Num;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How much number to enter: ");
        int n = sc.nextInt();

        Num[] numbers = new Num[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number: ");
            int num = sc.nextInt();
            numbers[i] = new Num(num);
        }

        int HighValue = 0;
        int HighValuePosition = 0;

        for (int i = 0; i < numbers.length; i++) {
            if( HighValue < numbers[i].getNum()) {
                HighValue = numbers[i].getNum();
                HighValuePosition = i;
            }
        }

        System.out.println("The highest number = " + numbers[HighValue].getNum());
        System.out.println("The highest number position = " + numbers[HighValuePosition].getNum());

        sc.close();

    }
}