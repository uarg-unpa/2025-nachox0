package parciales.tema1;

import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaEnteros cola = new ColaEnteros();
        int opcion;

        do {
            System.out.println("\n--- MENÚ COLA DE ENTEROS ---");
            System.out.println("1. Encolar elemento");
            System.out.println("2. Mostrar elementos");
            System.out.println("3. Calcular promedio de positivos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println(" La cola está llena.");
                    } else {
                        System.out.print("Ingrese un número entero: ");
                        int num = sc.nextInt();
                        cola.encolar(num);
                        System.out.println("Elemento encolado correctamente.");
                    }
                    break;

                case 2:
                    System.out.println("Contenido de la cola:");
                    cola.mostrar();
                    break;

                case 3:
                    double promedio = cola.promedioPositivos();
                    if (promedio == 0) {
                        System.out.println("No hay elementos positivos en la cola.");
                    } else {
                        System.out.println("Promedio de positivos: " + promedio);
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}