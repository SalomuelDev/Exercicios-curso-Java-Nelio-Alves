package Rectangle;


public class Retangulo {

    public double altura;
    public double largura;

    public double area() {
        return altura * largura;
    }
    public double perimetro() {
        return 2 * (altura + largura);
    }
    public double perimetroDiagonal() {
        return Math.sqrt((altura * altura) + (largura * largura));
    }
    public String toString() {
        return "Area: " + String.format("%.2f", area()) + "\n" +
               "Perimetro: " + String.format("%.2f", perimetro()) + "\n" +
               "Diagonal: " + String.format("%.2f", perimetroDiagonal());
    }




}
