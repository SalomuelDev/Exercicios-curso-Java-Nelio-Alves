package Main;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How much to enter: ");
        int n = sc.nextInt();

        int[] vect1 = new int[n];

        for (int i = 0; i < vect1.length ; i++) {
            System.out.print("Enter a number(Vect 1): ");
            int num = sc.nextInt();
            vect1[i] = num;
        }
        int[] vect2 = new int[vect1.length];

        for (int i = 0; i < vect2.length; i++) {
            System.out.print("Enter a number(Vect 2): ");
            int num = sc.nextInt();
            vect2[i] = num;
        }

        int[] vect3 = new int[vect1.length];

        System.out.print("Sum: ");
        for (int i = 0; i < vect3.length; i++) {
            System.out.println((vect3[i] = vect1[i] + vect2[i]) + " ");
        }

        sc.close();
    }
}