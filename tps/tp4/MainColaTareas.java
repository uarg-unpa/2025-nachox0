package tp4;

import java.util.Scanner;

public class MainColaTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaTareas cola = new ColaTareas();
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA DE TAREAS ===");
            System.out.println("1. Encolar tarea (agregar descripción y prioridad)");
            System.out.println("2. Desencolar tarea (ejecutar la más antigua)");
            System.out.println("3. Mostrar tarea en el frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese la prioridad (1-5): ");
                    int prioridad = sc.nextInt();
                    Tarea tarea = new Tarea(descripcion, prioridad);
                    if (!cola.estaLlena()) {
                        cola.encolar(tarea);
                        System.out.println("Tarea " + descripcion + " con prioridad " + prioridad + " encolada.");
                    } else {
                        System.out.println("Error: La cola está llena (máximo 9 tareas).");
                    }
                    break;

                case 2:
                    if (!cola.estaVacia()) {
                        Tarea desencolada = cola.desencolar();
                        System.out.println("Tarea ejecutada: " + desencolada);
                    } else {
                        System.out.println("Error: La cola está vacía. No hay tareas para ejecutar.");
                    }
                    break;

                case 3:
                    if (!cola.estaVacia()) {
                        Tarea frente = cola.peek();
                        System.out.println("Tarea en el frente: " + frente);
                    } else {
                        System.out.println("Error: La cola está vacía. No hay frente.");
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } 
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
