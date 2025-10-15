package tp3;

import java.util.Scanner;

public class SimuladorNavegador {
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Historial historial = new Historial();
        int opcion;

        do {
            System.out.println("\n=== NAVEGADOR WEB ===");
            System.out.println("1. Visitar página (meter)");
            System.out.println("2. Atrás (sacar)");
            System.out.println("3. Mostrar historial");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (!historial.estaLlena()) {
                        System.out.print("URL: ");
                        String url = sc.nextLine();
                        historial.meter(url);
                        System.out.println("Página visitada: " + url);
                    } else {
                        System.out.println("Historial lleno.");
                    }
                    break;
                case 2:
                    String pagina = historial.sacar();
                    if (pagina != null) {
                        System.out.println("Atrás: " + pagina);
                    } else {
                        System.out.println("No hay páginas previas.");
                    }
                    break;
                case 3:
                    System.out.println(historial);
                    break;
                case 4:
                {
                    while (!historial.estaVacia()) {
                        System.out.println("Pagina visitada:" +historial.sacar() );
        
                        }


                }break;
                case 0:
                    System.out.println("Cerrando navegador...");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
/*@Override
public String toString() {
    return "Pila con " + (cima + 1) + " elemento(s)";
}

public String elementoCima() {
    return paginas[cima];
}

public String vaciarPila() {
    
    String resultado = "Historial vaciado: ";
    while (!estaVacia()) {
        resultado += paginas[cima] + " ";
        cima--;
    }
    return resultado.trim();
}*/