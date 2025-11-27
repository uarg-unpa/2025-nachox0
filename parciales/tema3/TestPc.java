package parciales.tema3;
import java.util.Scanner;
public class TestPc {
    public static void main (String[] args) {
        //crear dos PC con datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca de la primera PC: ");
        String marca1 = scanner.nextLine();
        System.out.print("Ingrese el procesador de la primera PC: ");
        String procesador1 = scanner.nextLine();
        System.out.print("Ingrese el precio de la primera PC: ");
        double precio1 = scanner.nextDouble();
        System.out.print("Ingrese la RAM (en GB) de la primera PC: ");
        int ram1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        Pc pc1 = new Pc(marca1, procesador1, precio1, ram1);
        //PC dos
        System.out.print("Ingrese la marca de la segunda PC: ");
        String marca2 = scanner.nextLine();
        System.out.print("Ingrese el procesador de la segunda PC: ");
        String procesador2 = scanner.nextLine();
        System.out.print("Ingrese el precio de la segunda PC: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Ingrese la RAM (en GB) de la segunda PC: ");
        int ram2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        Pc pc2 = new Pc(marca2, procesador2, precio2, ram2);
        //aplicar un descuento al pc1 ingresado por el usuario
        System.out.print("Ingrese el porcentaje de descuento para la primera PC: ");
        double porcentaje = scanner.nextDouble();
        pc1.aplicarDescuento(porcentaje);
        //actualizar la ram del pc2 en 5 GB.
        pc2.actualizarRam(5);
        //mostrar que pc tiene mayor ram
        if (pc1.getRam() > pc2.getRam()) {
            System.out.println("La primera PC tiene mayor RAM.");
        } else if (pc2.getRam() > pc1.getRam()) {
            System.out.println("La segunda PC tiene mayor RAM.");
        } else {
            System.out.println("Ambas PCs tienen la misma cantidad de RAM.");
        }
        scanner.close();
    }
}

