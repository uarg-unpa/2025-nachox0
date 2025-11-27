package tp3;

public class Pila {
    private int[] elementos;
    private int cima;
    private final int MAX = 100; // Tamaño máximo arbitrario

    public Pila() {
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public void push(int elem) { //meter
        if (!estaLlena()) {
            elementos[++cima] = elem;
        }
    }

    public int pop() { //sacar
        if (!estaVacia()) {
            return elementos[cima--];
        }
        return -1; // Valor por defecto en caso de error (validación externa)
    }

    public int top() {
        if (!estaVacia()) {
            return elementos[cima];
        }
        return -1; // Valor por defecto en caso de error (validación externa)
    }

    public int contarOcurrencias(int x) {
        Pila auxiliar = new Pila(); // Pila auxiliar para preservar la original
        int contador = 0;

        // Desapilar y contar ocurrencias
        while (!estaVacia()) {
            int elemento = pop();
            if (elemento == x) {
                contador++;
            }
            auxiliar.push(elemento); // Preservar en auxiliar
        }

        // Restaurar la pila original
        while (!auxiliar.estaVacia()) {
            push(auxiliar.pop());
        }

        return contador;
    }
}
