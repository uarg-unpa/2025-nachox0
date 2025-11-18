package tp3;

import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PILA DE ENTEROS ===");
            System.out.println("1. Agregar elemento (push)");
            System.out.println("2. Contar ocurrencias de un valor");
            System.out.println("3. Mostrar cima (top)");
            System.out.println("4. Desapilar (pop)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un entero: ");
                    int elem = sc.nextInt();
                    pila.push(elem);
                    System.out.println("Elemento " + elem + " agregado.");
                    break;
                case 2:
                    System.out.print("Ingrese el valor a contar: ");
                    int x = sc.nextInt();
                    int ocurrencias = pila.contarOcurrencias(x);
                    System.out.println("El valor " + x + " aparece " + ocurrencias + " vez(s).");
                    break;
                case 3:
                    int cima = pila.top();
                    if (cima != -1) {
                        System.out.println("Cima: " + cima);
                    } else {
                        System.out.println("Pila vacía.");
                    }
                    break;
                case 4:
                    int pop = pila.pop();
                    if (pop != -1) {
                        System.out.println("Elemento desapilado: " + pop);
                    } else {
                        System.out.println("Pila vacía.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
