package Exercicio06;

public class Hora {

    private int horas;
    private int minutos;
    private int segundos;


    public Hora(int horas, int minutos, int segundos) {
        this.horas = validarHora(horas);
        this.minutos = validarMinutosouSegundos(minutos);
        this.segundos = validarMinutosouSegundos(segundos);
    }

    private int validarHora(int horas) {
        return (horas >= 0 && horas <= 23) ? horas : 0;
    }

    private int validarMinutosouSegundos(int valor) {
        return (valor >= 0 && valor <= 59) ? valor:0;
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}