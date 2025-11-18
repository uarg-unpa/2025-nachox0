package tp4;

public class ColaInt {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaInt() {
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

    public void encolar(int elem) {
        elementos[fin] = elem;
        fin = (fin + 1) % MAX;
    }

    public int desencolar() {
        int aux = elementos[frente];
        frente = (frente + 1) % MAX;
        return aux;
    }

    public int peek() {
        return elementos[frente];
    }

    public void eliminarRepetidos() {
        ColaInt auxiliar = new ColaInt(); 
        int[] vistos = new int[MAX]; 
        int indiceVistos = 0;

        while (!estaVacia()) {
            int elemento = desencolar();
            boolean esRepetido = false;
            for (int i = 0; i < indiceVistos; i++) {
                if (vistos[i] == elemento) {
                    esRepetido = true;
                    break;
                }
            }
            if (!esRepetido) {
                vistos[indiceVistos++] = elemento; 
                auxiliar.encolar(elemento); 
            }
        }
        
        while (!auxiliar.estaVacia()) {
            encolar(auxiliar.desencolar());
        }
    }
}
    
       
