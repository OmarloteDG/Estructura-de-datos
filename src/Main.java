import java.util.Random; // DANIEL LOTE GARCIA
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random ale = new Random();
        int max = 3;
        int min = 2;
        int d1;
        int aletorio = ale.nextInt((max - min + 1)) + min;

        int monto, op;
        System.out.println("APUESTA Y GANA");
        System.out.println("INGRESE UN MONTO INCIAL:");
        monto = teclado.nextInt();

        do {
            System.out.println("Generando número aleatorio...");
            System.out.println("El número obtenido es: " + aletorio);

            switch (aletorio) {
                case 1 -> {
                    monto *= 2;
                    System.out.println("¡Felicidades! Tu monto ahora es: " + monto);
                }
                case 2 -> {
                    monto /= 2;
                    System.out.println("Perdiste la mitad. Tu monto ahora es: " + monto);
                }
                case 3 -> {
                    monto = 0;
                    System.out.println("¡Perdiste todo! Juego terminado.");
                }
            }

            if (monto > 0) {
                System.out.print("¿Quieres seguir jugando? (1: Sí, 2: No): ");
                op = teclado.nextInt();

            } else {
                op= 2;
            }

        } while (op == 1);

        System.out.println("Te retiras con: " + monto);
        System.out.println("FIN DEL JUEGO.");

    }

}
