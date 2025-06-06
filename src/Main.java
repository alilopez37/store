import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int opc = 0;


        do {
            System.out.println("T I E N D A   A M I G A");
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Agregar productos al inventario");
            System.out.println("2. Iniciar una venta");
            System.out.println("3. Salir");
            System.out.print("Digite una opción: ");
            opc = keyboard.nextInt();
        } while (opc != 3);
    }
}