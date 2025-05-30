package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida! Tente novamente.");
            senha = sc.nextInt();

        sc.close();
        }
    }
}
