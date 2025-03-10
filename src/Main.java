import java.util.Scanner;   /// daniel lote garcia

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, cantidad = 0;
        String nombre, fecha, tel, producto = "";
        double totalCompra = 0, precioUnitario = 0, subtotal = 0, iva = 0 , totalFactura = 0;

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese la fecha: ");
        fecha = teclado.nextLine();

        System.out.print("Ingrese su teléfono: ");
        tel = teclado.nextLine();

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. MAUSE 80.000");
            System.out.println("2. TECLADO 320.000");
            System.out.println("3. MONITOR 940.000");
            System.out.println("4. DISCO DURO 230.000");
            System.out.println("5. RAM 180.000");
            System.out.println("6. SALIR");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    producto = "Mause";
                    precioUnitario = 80000;
                }
                case 2 -> {
                    producto = "Teclado";
                    precioUnitario = 320000;
                }
                case 3 -> {
                    producto = "Monitor";
                    precioUnitario = 940000;
                }
                case 4 -> {
                    producto = "Disco Duro";
                    precioUnitario = 230000;
                }
                case 5 -> {
                    producto = "Ram";
                    precioUnitario = 180000;
                }
                case 6 -> {
                    totalCompra += precioUnitario * cantidad;
                    iva = subtotal * 0.16;
                    totalFactura = subtotal + iva;
                    System.out.println("****** FACTURA DE COMPRA ******");
                    System.out.println("Tienda Tecnológica");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha: " + fecha);
                    System.out.println("Teléfono: " + tel);
                    System.out.println("Detalle de compra:");
                    System.out.println("Producto\tCantidad\tValor Unitario\tTotal");
                    System.out.println("-----------------------------------------------");

                    if (producto.equals("Mause")) {
                        System.out.println("Mause" + cantidad + "\t\t" + 80000 + "\t\t" + (80000 * cantidad));
                    }
                    if (producto.equals("Teclado")) {
                        System.out.println("Teclado\t" + cantidad + "\t\t" + 320000 + "\t\t" + (320000 * cantidad));
                    }
                    if (producto.equals("Monitor")) {
                        System.out.println("Monitor\t" + cantidad + "\t\t" + 940000 + "\t\t" + (940000 * cantidad));
                    }
                    if (producto.equals("Ram")) {
                        System.out.println("Ram\t" + cantidad + "\t\t" + 180000 + "\t\t" + (180000 * cantidad));
                    }
                    System.out.println("\nSubtotal: " + subtotal);
                    System.out.println("IVA (16%): " + iva);
                    System.out.println("Total de la compra: " + totalFactura);
                    System.out.println("\nGracias por su compra.");
                }
            }

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese la cantidad de " + producto + " a comprar: ");
                cantidad = teclado.nextInt();
                subtotal += precioUnitario * cantidad;
                System.out.println("Producto: " + producto);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Valor Unitario: " + precioUnitario);
                System.out.println("Total del producto: " + (precioUnitario * cantidad));


            }

            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor Unitario: " + precioUnitario);
            System.out.println("Total del producto: " + (precioUnitario * cantidad));

        } while (opcion != 6);
    }
}