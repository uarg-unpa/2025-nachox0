package parciales.tema2;
import java.util.Scanner;
public class TestRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //crear dos rectangulos con datos ingresados por el usuario
        System.out.print("Ingrese la altura del primer rectángulo: ");
        double altura1 = sc.nextDouble();
        System.out.print("Ingrese la base del primer rectángulo: ");
        double base1 = sc.nextDouble();
        Rectangulo R1 = new Rectangulo(altura1, base1);
        sc.nextLine();
        //rectangulo dos
        System.out.print("Ingrese la altura del segundo rectángulo: ");
        double altura2 = sc.nextDouble();
        System.out.print("Ingrese la base del segundo rectángulo: ");
        double base2 = sc.nextDouble();
        Rectangulo R2 = new Rectangulo(altura2, base2);
        sc.nextLine();
        //imprimir el area de R1
        System.out.println("El area del primer rectángulo es: " + R1.calcularArea());
        //im|mprimir el perimetro de R2
        System.out.println("El perímetro del segundo rectángulo es: " + R2.calcularPerimetro());
        //imprimir que rectangulo tiene mayor area (usar metodo de esMayorElArea)
        if (R1.esMayorElArea(R2)) {
            System.out.println("El primer rectángulo tiene mayor área.");
        } else if (R2.esMayorElArea(R1)) {
            System.out.println("El segundo rectángulo tiene mayor área.");
        } else {
            System.out.println("Ambos rectángulos tienen la misma área.");
        }
        sc.close();
    }
}
