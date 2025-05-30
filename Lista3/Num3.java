package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int gasolina = 0, alcool = 0, diesel = 0;

        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Sair");
        int opcao;

        while (true) {
            opcao = sc.nextInt();

            if(opcao == 1) {
                alcool++;
            }
            if(opcao == 2) {
                gasolina++;
            }
            if (opcao == 3) {
                diesel ++;
            }
            if(opcao == 4) {
                break;
            }
        }

        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
