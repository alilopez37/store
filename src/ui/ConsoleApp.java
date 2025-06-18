package ui;

import domain.service.InventarioService;

import java.util.Scanner;

public class ConsoleApp {
    private final InventarioService service;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleApp(InventarioService service) {
        this.service = service;
    }

    public void start() {
        while (true) {
            System.out.println("T I E N D A   A M I G A");
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Agregar productos al inventario");
            System.out.println("2. Imprimir productos del inventario");
            System.out.println("3. Iniciar venta");
            System.out.println("4. Imprimir ventas ");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (option) {
                case 1 -> {
                    System.out.println("A L T A  D E  P R O D U C T O S \n");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Precio: ");
                    float price = scanner.nextFloat();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    if (service.addProduct(id, name, price, stock))
                        System.out.println("¡Producto agregado exitosamente! \n");
                    else
                        System.out.println("Ha ocurrido un error! \n");
                }
                case 2 -> {
                    System.out.println("ID\tNombre\t\tPrecio\tStock");
                    service.listProducts().forEach(p ->
                        System.out.println(p.getId() + "\t" + p.getNombre() + "\t" + p.getPrecio() + "\t" + p.getStock()));
                }
                case 3 -> {}
                case 4 -> {}
                case 0 -> {
                    System.out.println("Adiós!");
                    return;
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }
}
