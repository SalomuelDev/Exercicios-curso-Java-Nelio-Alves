package Main;

import java.util.Scanner;
import java.util.Locale;
import Entidades.CalculoDeNota;

public class aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("===Cadastro de Alunos===");
        String continuar;
        do {
            CalculoDeNota aluno = new CalculoDeNota();
            cadastro(aluno, sc);

            System.out.println();

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.nextLine().trim().toLowerCase();

        }while(continuar.equals("s"));
         System.out.println("Programa encerrado.");
        sc.close();

    }
    public static void cadastro(CalculoDeNota aluno, Scanner sc) {
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a nota 1 2 e 3: ");
        aluno.nota1 = sc.nextDouble();
        sc.nextLine();
        aluno.nota2 = sc.nextDouble();
        sc.nextLine();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno);

        sc.nextLine();
    }

}
