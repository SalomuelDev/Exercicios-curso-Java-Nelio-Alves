package Entidades;

public class CalculoDeNota {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculo() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String resultado() {
        double media = calculo();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return String.format("Recuperação por %.2f pontos.%n", 7.0 - media);
        } else {
            return String.format("Reprovado por %.2f pontos.%n", 7.0 - media);
        }
    }

    public String toString() {
        return String.format("Nome: %s%nNota 1: %.2f%nNota 2: %.2f%nNota 3: %.2f%nMédia: %.2f%nResultado: %s",
                nome, nota1, nota2, nota3, calculo(), resultado());
    }

}
