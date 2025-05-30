package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Digite o X e Y: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y > 0 && x > 0) {
                System.out.println("Q1");
            } else if (y < 0 && x > 0) {
                System.out.println("Q2");
            } else if (y < 0 && x < 0) {
                System.out.println("Q3");
            } else if (y > 0 && x < 0) {
                System.out.println("Q4");

            }
            if( x == 0 || y == 0) {
                break;
            }
        }
    }
}
