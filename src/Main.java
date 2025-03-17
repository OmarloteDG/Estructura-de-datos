import java.util.Random;   ///// daniel lote garcia
import java.util.Scanner;  //// PARIAL PRACTICO


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int max = 12;
        int min = 1;

        int vida = 15;
        int experiencia = 0;
        boolean envenenado = false;

        System.out.print("VIENVENIDO AL JUEGO");
        while (vida > 0 && experiencia < 50) {

            System.out.println("Presiona Enter para lanzar el dado...");
            teclado.nextLine();
            int num = ale.nextInt((max - min + 1)) + min;
            System.out.println("Número obtenido: " + num);

            switch (num) {
                case 1, 2 -> {
                    System.out.print("Encuentras una fuente de vida ");
                    vida += 1;
                    System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                }

                case 3, 5 -> {
                    System.out.print("Eres atacado brutalmente");
                    vida -= 5;
                    System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                }

                case 4 -> {
                    System.out.print("NO OBTIENES NADA");
                }

                case 6, 7 -> {
                    System.out.print("Ganas experiencia en la aventura ");
                    experiencia += 3;
                    System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                }

                case 8, 9 -> {
                    System.out.print("Cometes un error grave ");
                    experiencia -= 6;
                    System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                }

                case 10, 11 -> {
                    System.out.print("Caes en una trampa letal  ");
                    vida -= 8;
                    System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                }

                case 12 -> {
                    int eventoEspecial = ale.nextInt(3) + 1;
                    System.out.print("Evento especial aleatorio ");
                    System.out.print(" Puede ser bueno o malo ");
                    switch (eventoEspecial) {
                        case 1 -> {
                            System.out.print("Encuentras un pergamino antiguo ");
                            experiencia += 10;
                            System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                        }

                        case 2 -> {
                            System.out.print("Te infectas con veneno,  Empiezas a perder -2 puntos de vida por turno ");
                            envenenado = true;
                            System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                        }
                        case 3 -> {
                            System.out.println("Un demonio te ataca. Tu vida se reduce a la mitad.");
                            vida /= 2;
                            System.out.println("Vida: " + vida + " | Experiencia: " + experiencia);
                        }
                    }
                    if (vida <= 0) {
                        System.out.println("Has muerto. Fin del juego.");

                    } else if (experiencia >= 50) {
                        System.out.println("¡Has alcanzado 50 puntos de experiencia y escapaste de la dimensión! ¡Ganaste!");

                    }

                }
            }

        }
    }
}
