package Aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidades.salario;

public class progam {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        salario salario = new salario();

        System.out.println("Digite o nome do funcionário: ");
        salario.nome = entrada.nextLine();
        System.out.println("Digite o valor do salário: ");
        salario.salario = entrada.nextDouble();
        System.out.println("Digite o valor da taxa: ");
        salario.taxa = entrada.nextDouble();

        System.out.println("Status:\n" + salario);

        System.out.println("Quantos % sera o aumento do funcionário: ");
        salario.bonus = entrada.nextDouble();
        salario.Adicionarbonus(salario.bonus);
        System.out.println("Status atualizado:\n" + salario);

    entrada.close();
    }
}
