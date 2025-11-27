package parciales.tema1;

public class ColaEnteros {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaEnteros() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin;
    }

    public boolean estaLlena() {
        return (fin + 1) % MAX == frente;
    }

    public void encolar(int x) {
        if (!estaLlena()) {
            elementos[fin] = x;
            fin = (fin + 1) % MAX;
        }
    }

    public int desencolar() {
        if (!estaVacia()) {
            int aux = elementos[frente];
            frente = (frente + 1) % MAX;
            return aux;
        }
        return -1; // valor indicativo de cola vacía
    }

    public int peek() {
        if (!estaVacia()) {
            return elementos[frente];
        }
        return -1;
    }

    // Método para calcular el promedio de los positivos
    public double promedioPositivos() {
        if (estaVacia()) {
            return 0;
        }

        ColaEnteros aux = new ColaEnteros();
        int suma = 0;
        int contador = 0;

        // Recorremos la cola sin acceder al arreglo directamente
        while (!estaVacia()) {
            int elemento = desencolar();

            if (elemento > 0) {
                suma += elemento;
                contador++;
            }

            aux.encolar(elemento); // guardamos en auxiliar para restaurar luego
        }

        // Restauramos la cola original respetando FIFO
        while (!aux.estaVacia()) {
            encolar(aux.desencolar());
        }

        // Evitamos división por cero
        return contador > 0 ? (double) suma / contador : 0;
    }

    // Método para mostrar todos los elementos sin perder el orden
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        ColaEnteros aux = new ColaEnteros();

        while (!estaVacia()) {
            int elemento = desencolar();
            System.out.print(elemento + " ");
            aux.encolar(elemento);
        }
        System.out.println();

        // Restauramos la cola original
        while (!aux.estaVacia()) {
            encolar(aux.desencolar());
        }
    }
}