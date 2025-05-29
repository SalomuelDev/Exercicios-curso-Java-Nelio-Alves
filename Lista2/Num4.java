package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double hora1, hora2, resultado;

        System.out.println("Que horas começou o jogo?");
        hora1 = sc.nextDouble();
        System.out.println("Que horas terminou o jogo?");
        hora2 = sc.nextDouble();

        if (hora1 < hora2) {
            resultado = hora2 - hora1;
        }else {
            resultado = 24 - hora1 - hora2;
        }

        System.out.printf("%.2f", resultado);

        sc.close();
    }
}