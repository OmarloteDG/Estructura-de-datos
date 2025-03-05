import java.util.Scanner; // DANIEL LOTE GARCIA

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombre, direccion, tel;
        double saldo, recargar, extraccionRapida, retirar = 0;

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese su dirección: ");
        direccion = teclado.nextLine();

        System.out.print("Ingrese su teléfono: ");
        tel = teclado.nextLine();

        System.out.print("Ingrese su saldo inicial: ");
        saldo = teclado.nextDouble();

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Recargar");
            System.out.println("2. Retirar");
            System.out.println("3. Extracción rápida ");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el monto a recargar: ");
                    recargar = teclado.nextDouble();
                    saldo += recargar;
                    System.out.println("Recarga exitosa. Nuevo saldo: " + saldo);
                }
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    retirar = teclado.nextDouble();
                    if (retirar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retirar;
                        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
                    }
                }
                case 3 ->{
                    System.out.print("Extraccion rapida: ingresa el monto a retirar ");
                    retirar = teclado.nextDouble();
                    extraccionRapida = saldo * 0.2;
                    saldo -= extraccionRapida;
                    System.out.println("Extracción rápida realizada. Se descontó: " + extraccionRapida);
                    System.out.println("Nuevo saldo: " + saldo);
                }
                case 4 ->{
                    System.out.println("CUENTA ACTUAL ");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Teléfono: " + tel);
                    System.out.println("Direccion: " + direccion);
                    System.out.println("Saldo actual: " + saldo);
                }
                case 5->{
                    System.out.println("CUENTA FINAL");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Teléfono: " + tel);
                    System.out.println("Direccion: " + direccion);
                    System.out.println("Saldo final: " + saldo);
                }
            }
        }while (opcion != 5);
        System.out.println("GRACIAS A FINALIZADO" );
    }
}