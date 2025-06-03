package Program;

import java.util.Scanner;
import java.util.Locale;
import Rectangle.Retangulo;



public class program {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Retangulo rec = new Retangulo();

    System.out.println("Fale as medias de um retangulo (altura e largura): ");
    rec.altura = sc.nextDouble();
    rec.largura = sc.nextDouble();

    System.out.println(rec.toString());


    sc.close();
}

}
