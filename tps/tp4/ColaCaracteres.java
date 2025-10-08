package tp4;

public class ColaCaracteres {
    private char[] elementos;
    private int frente, fin;
    private final int MAX = 10;

    public ColaCaracteres() {
        elementos = new char[MAX];
        frente = 0;
        fin = 0;
    }

    //revisa si la cola está vacía
    public boolean estaVacia() {
        return fin == 0;
    }

    //revisa si la cola está llena
    public boolean estaLlena() {
        return fin == MAX;
    }

    //encola un nuevo carácter
    public void encolar(char elem) {
        elementos[fin] = elem;
        fin++;
    }

    //desencola el carácter del frente
    public char desencolar() {
        char aux = elementos[frente]; 
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    //devuelve el caracter en el frente sin quitarlo (peek mejorado)
    public char peek() {
        if (!estaVacia()) {
            return elementos[frente];
        }
        else {
            return '\0'; //retorna un caracter nulo si la cola está vacía
        }
    }

    //muestra el contenido de la cola
    @Override
    public String toString() {
        String texto = "Cola: ";
        if (estaVacia()) {
            texto = texto + "(vacía)";
        } else {
            for (int i = 0; i < fin; i++) {
                texto = texto + elementos[i] + " ";
            }
        }
        return texto;
    }
}
