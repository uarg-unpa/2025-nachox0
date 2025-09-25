package parciales.tema4;
import java.util.Scanner;
public class TestVehiculo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //crear dos vehiculos V1 y V2 con datos ingresador por el usuario
        System.out.println("Ingrese el tipo del primer vehiculo:");
        String tipo1=sc.nextLine();
        System.out.println("Ingrese la velocidad maxima del primer vehiculo:");
        int velocidad1=sc.nextInt();
        sc.nextLine(); //limpio buffer
        System.out.println("Ingrese el precio del primer vehiculo:");
        double precio1=sc.nextDouble();
        System.out.println("Ingrese el tipo del segundo vehiculo:");
        String tipo2=sc.nextLine();
        System.out.println("Ingrese la velocidad maxima del segundo vehiculo:");
        int velocidad2=sc.nextInt();
        sc.nextLine(); //limpio buffer
        System.out.println("Ingrese el precio del segundo vehiculo:");
        double precio2=sc.nextDouble();
        Vehiculo v1=new Vehiculo(tipo1,velocidad1,precio1);
        Vehiculo v2=new Vehiculo(tipo2,velocidad2,precio2);
        //aplicar un descuento al primer vehiculo ingresado por el usuario
        System.out.println("Ingrese el porcentaje de descuento para el primer vehiculo:");
        double porcentaje=sc.nextDouble();
        v1.aplicarDescuento(porcentaje);
        //aumentar la velocidad maxima del segundo vehiculo en 5km
        v2.aumentarVelocidadMaxima(5);
        //mostrar que vehiculo tiene mayor velocidad maxima
        if (v1.mayorVelocidad(v2)) {
            System.out.println("El primer vehiculo tiene mayor velocidad maxima.");
        } 
        else {
            if (v2.mayorVelocidad(v1)) {
                System.out.println("El segundo vehiculo tiene mayor velocidad maxima.");
            } 
            else {
                System.out.println("Ambos vehiculos tienen la misma velocidad maxima.");
            }
        }
        sc.close();
    }
}