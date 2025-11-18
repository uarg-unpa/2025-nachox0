package tp3;

import java.util.Scanner;

public class MainPilaNavegacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaNavegacion pila = new PilaNavegacion();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PILA DE NAVEGACIÓN ===");
            System.out.println("1. Meter página (agregar URL y visitas)");
            System.out.println("2. Sacar página (volver atrás)");
            System.out.println("3. Mostrar página en la cima");
            System.out.println("4. Mostrar estado de la pila");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la URL: ");
                    String url = sc.nextLine();
                    System.out.print("Ingrese el número de visitas: ");
                    int visitas = sc.nextInt();
                    PaginaWeb pagina = new PaginaWeb(url, visitas);
                    if (!pila.estaLlena()) {
                        pila.meter(pagina);
                        System.out.println("Página " + url + " con " + visitas + " visitas agregada.");
                    } else {
                        System.out.println("Error: La pila está llena (máximo 5 páginas).");
                    }
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        PaginaWeb sacada = pila.sacar();
                        System.out.println("Página sacada: " + sacada);
                    } else {
                        System.out.println("Error: La pila está vacía. No hay páginas para sacar.");
                    }
                    break;

                case 3:
                    if (!pila.estaVacia()) {
                        PaginaWeb cima = pila.elementoCima();
                        System.out.println("Página en la cima: " + cima);
                    } else {
                        System.out.println("Error: La pila está vacía. No hay cima.");
                    }
                    break;

                case 4:
                    System.out.println(pila.toString());
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
