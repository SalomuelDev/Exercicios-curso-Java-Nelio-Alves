package Lista2;

import javax.swing.*;
import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o X e Y: ");
        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();


        if( y > 0 && x > 0){
            System.out.println("Q1");
        }else if (y < 0 && x > 0) {
            System.out.println("Q2");
        }else if (y < 0 && x < 0) {
            System.out.println("Q3");
        }else if (y > 0 && x < 0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}