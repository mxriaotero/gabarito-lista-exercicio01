package Exercicio06;

public class Main {
    public static void main(String[] args) {
    Hora hora1 = new Hora(1,60,60);
    Hora hora2 = new Hora(3, 30, 0);
    Hora hora3 = new Hora(48,125,963);

        System.out.println("Hora1:" + hora1.getHoraFormatada() );
        System.out.println("Hora2:" + hora2.getHoraFormatada() );
        System.out.println("Hora3:" + hora3.getHoraFormatada() );



    }
}
