package Main;

import Nums.num;

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How numbers to enter: ");
        int n = sc.nextInt();

        num[] vect = new num[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            vect[i] = new num(num);
        }

        int quant = 0;
        System.out.println("Pares =d ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getNum() % 2 == 0 ){
                System.out.print(vect[i].getNum() + " ");
                quant +=1;
            }
        }

        System.out.println("\nQuant = " + quant);

    sc.close();

    }

}
