package tp4;

public class ColaTareas {
    private Tarea[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaTareas() {
        elementos = new Tarea[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin;
    }

    public boolean estaLlena() {
        return (fin + 1) % MAX == frente;
    }

    public void encolar(Tarea tarea) {
        elementos[fin] = tarea;
        fin = (fin + 1) % MAX;
    }

    public Tarea desencolar() {
        Tarea aux = elementos[frente];
        frente = (frente + 1) % MAX;
        return aux;
    }

    public Tarea peek() {
        return elementos[frente];
    }
}