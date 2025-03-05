import java.util.Random;     //DANIEL LOTE GARCIA--
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int max = 100;
        int min = 1;
        int num1, num2, op = 0;
        String operacion;
        double resultado = 0;

        System.out.println("CALCULADORA");

        do {
            num1 = ale.nextInt((max - min + 1)) + min;
            num2 = ale.nextInt((max - min + 1)) + min;
            System.out.println("Números generados: " + num1 + " y " + num2);
            System.out.print(" operaciónes disponibles (+, -, *, /, ^, %): ");
            operacion = teclado.next();

            switch (operacion) {
                case "+" -> resultado = num1 + num2;
                case "-" -> resultado = num1 - num2;
                case "*" -> resultado = num1 * num2;
                case "/" -> resultado = (double) num1 / num2;
                case "^" -> resultado = Math.pow(num1, num2);
                case "%" -> resultado = num1 % num2;
            }
            System.out.println("RESULTADO: " + resultado);
            System.out.print("¿Desea realizar otra operación? (1: SI, 2: NO): ");
            op = teclado.nextInt();

        }
        while (op == 1) ;
        System.out.println("FINALIZO.");
    }
}