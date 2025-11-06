package parciales.tema1;

import java.util.Scanner;

// Programa principal para probar la eliminación de un elemento en una pila
public class MainPilaInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaInt pila = new PilaInt();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PILA DE ENTEROS ===");
            System.out.println("1. Apilar número");
            System.out.println("2. Desapilar número");
            System.out.println("3. Ver número en el tope (peek)");
            System.out.println("4. Eliminar un número específico");
            System.out.println("5. Mostrar cantidad de elementos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // apilar número
                    if (pila.estaLlena()) {
                        System.out.println("Error: la pila está llena (máximo 100 enteros).");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int valor = sc.nextInt();
                        pila.push(valor);
                        System.out.println("Número " + valor + " apilado con éxito.");
                    }
                    break;

                case 2: // desapilar número
                    if (pila.estaVacia()) {
                        System.out.println("Error: la pila está vacía. No se puede desapilar.");
                    } else {
                        int desapilado = pila.pop();
                        System.out.println("Número desapilado: " + desapilado);
                    }
                    break;

                case 3: // ver número en el tope
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        int tope = pila.peek();
                        System.out.println("Número en el tope: " + tope);
                    }
                    break;

                case 4: // eliminar un número específico
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía. No se puede eliminar.");
                    } else {
                        System.out.print("Ingrese el número a eliminar: ");
                        int x = sc.nextInt();
                        int movidos = pila.eliminarElemento(x);

                        if (movidos == -1) {
                            System.out.println("El número " + x + " no se encontró en la pila.");
                        } else {
                            System.out.println("Número " + x + " eliminado correctamente.");
                            System.out.println("Cantidad de elementos movidos: " + movidos);
                        }
                    }
                    break;

                case 5: // mostrar cantidad de elementos
                    System.out.println("La pila contiene " + pila.getCantidad() + " elemento(s).");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

