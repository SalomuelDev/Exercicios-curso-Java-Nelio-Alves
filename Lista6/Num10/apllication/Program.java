package apllication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How much Students? ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] st = new Student[n];
        String[] vectorName = new String[n];

        for (int i = 0; i < st.length; i++) {
            System.out.println("Stats " + (i + 1) + "º Student:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Primary Grade: ");
            double firstNote = sc.nextDouble();
            sc.nextLine();
            System.out.print("Second grade : ");
            double secondNote = sc.nextDouble();
            sc.nextLine();

            st[i] = new Student(name, firstNote, secondNote);
        }

        for (int i = 0; i < st.length; i++) {
            if (st[i].getAverage() >= 6.0) {
                vectorName[i] = st[i].getName();
            } else {
                vectorName[i] = null;
            }
        }

        System.out.println("Aproved Students:");
        for (int i = 0; i < vectorName.length; i++) {
            if (vectorName[i] != null) {
                System.out.println(vectorName[i]);
            }
        }
    }
}