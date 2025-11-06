package parciales.tema1;

// Clase que implementa una pila de enteros con tope y operaciones básicas
public class PilaInt {
    private final int MAX = 100; // Capacidad máxima de la pila
    private int[] elementos;     // Vector para guardar los datos
    private int tope;            // Índice del último elemento apilado

    // Constructor: inicializa la pila vacía
    public PilaInt() {
        elementos = new int[MAX];
        tope = -1; // pila vacía
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return tope == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return tope == MAX - 1;
    }

    // Agrega un nuevo elemento al tope de la pila
    public void push(int valor) {
        if (!estaLlena()) {
            tope = tope + 1;
            elementos[tope] = valor;
        }
    }

    // Quita y devuelve el elemento del tope
    public int pop() {
        int aux = elementos[tope];
        tope = tope - 1;
        return aux;
    }

    // Devuelve el elemento del tope sin quitarlo
    public int peek() {
        return elementos[tope];
    }

    // Muestra cuántos elementos hay actualmente
    public int getCantidad() {
        return tope + 1;
    }

    // ---------------------------------------------------------
    // MÉTODO PEDIDO EN EL PARCIAL:
    // Buscar y eliminar un valor X sin perder la información
    // ---------------------------------------------------------
    public int eliminarElemento(int x) {
        PilaInt auxiliar = new PilaInt(); // pila auxiliar para guardar los elementos
        boolean encontrado = false;
        int movidos = 0; // contador de elementos desapilados

        // Paso 1: desapilar elementos hasta encontrar el valor buscado
        while (!estaVacia()) {
            int elemento = pop(); // quitar del tope
            movidos++;            // contar movimiento
            if (elemento == x) {  // si encontramos el valor, lo eliminamos
                encontrado = true;
                break; // salimos del ciclo, ya no seguimos desapilando
            } else {
                auxiliar.push(elemento); // guardamos en la auxiliar para no perderlo
            }
        }

        // Paso 2: restaurar la pila original (sin el elemento eliminado)
        while (!auxiliar.estaVacia()) {
            push(auxiliar.pop()); // volvemos a apilar los elementos
        }

        // Si no se encontró el elemento, devolvemos -1
        // Si se encontró, devolvemos cuántos movimientos se hicieron
        return encontrado ? movidos : -1;
    }
}

