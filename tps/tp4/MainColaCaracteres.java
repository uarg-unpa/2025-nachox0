package tp4;

import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres();
        int opcion;
        //menú
        do {
            System.out.println("\n=== MENÚ COLA DE COMANDOS (Frente Fijo) ===");
            System.out.println("1. Encolar comando (agregar carácter)");
            System.out.println("2. Desencolar comando (sacar carácter)");
            System.out.println("3. Ver comando en frente (peek)");
            System.out.println("4. Mostrar estado (vacía, llena o contenido)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //agregar caracter
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (máximo 10 comandos).");
                    } else {
                        System.out.print("Ingrese un carácter: ");
                        char comando = sc.next().charAt(0);
                        cola.encolar(comando);
                        System.out.println("Comando '" + comando + "' encolado con éxito.");
                    }
                    break;

                case 2: //sacar caracter
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        char desencolado = cola.desencolar();
                        System.out.println("Comando desencolado: " + desencolado);
                    }
                    break;
 
                case 3: //ver caracter en frente
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No hay comando en el frente.");
                    } else {
                        char frente = cola.peek();
                        System.out.println("Comando en frente: " + frente);
                    }
                    break;

                case 4: //mostrar estado de la cola
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } else {
                        System.out.println(cola.toString());
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
