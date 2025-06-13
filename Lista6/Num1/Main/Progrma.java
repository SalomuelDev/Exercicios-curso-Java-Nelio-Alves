package Main;

import entities.num;

import java.util.Scanner;
import java.util.Locale;

public class Progrma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        while(quantity > 10){
            System.out.println("Digite um numero (abaixo de 10) : ");
            quantity = sc.nextInt();
        }
        num[] vect = new num[quantity];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero : ");
            int num1 = sc.nextInt();
            if(num1 < 0){
            vect[i] = new num(num1);}
        }
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i].getNum1());
        }
        sc.close();
    }
}
