package Exercicio03;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double area(){

        return base * altura;
    }
    public double perimetro(){

        return 2 *(base + altura);
    }

    public String formatar(){
        return String.format("%02f:%02f:%02f:%02f");
    }
}
