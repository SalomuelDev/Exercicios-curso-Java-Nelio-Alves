package entidades;

public class salario {

    public String nome;
    public double salario;
    public double taxa;
    public double bonus;


    public double taxa(){
        return salario - taxa;
    }

    public void Adicionarbonus(double bonus){
        this.salario += this.salario * bonus /100;
    }
    public String toString(){
        return nome + ", $ " + String.format("%.2f", taxa());
    }

}
