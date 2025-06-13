package Main;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How much to enter: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            sc.nextLine();
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.println("Averange: " + avg + "\n below average elements :");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg) {
                System.out.printf("%.2f%n", vect[i]);
            }
        }

        sc.close();
    }
}