package Main;

import Persons.Entities;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How much people: ");
        int n = sc.nextInt();
        Entities[] vect = new Entities[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Enter person %d ", i + 1);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            vect[i] = new Entities(name, age, height);
        }

        int LowAge = 0;
        double avrHeight = 0.0;

        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getYears() < 16){
                LowAge+=1;
            }
            avrHeight+=vect[i].getHeight();
        }
        avrHeight = avrHeight / vect.length;
        double PercentualUnder = ((double)LowAge * vect.length) / 100;

        System.out.println("Low age: " + LowAge);
        System.out.printf("Avr height: %.2f%n" , avrHeight);
        System.out.printf("Percentual under: %.2f%n", PercentualUnder);
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getYears() < 16) {
                System.out.println(vect[i].getName() + " ");
            }
        }

        sc.close();
    }
}
