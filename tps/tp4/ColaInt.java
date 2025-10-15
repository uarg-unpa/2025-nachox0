package tp4;

public class ColaInt{
    private int []elementos;
    private int frente, fin;
    private final int MAX=10;

    public ColaInt()
    {
        elementos=new int[MAX];
        frente=0;
        fin=0;
    }
    
    public boolean estaVacia() {
        return fin == 0; //vacía si no se ha encolado nada
    }
    
    public boolean estaLlena() {
        return fin == MAX; //llena si fin llega al final
    }

    public void encolar(int elem) {
        elementos [fin] = elem;
        fin++; //avanza linealmente
    }

    public int desencolar() {
        int aux = elementos[frente]; // Toma el primer elemento
        // Desplaza los elementos restantes hacia la izquierda
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--; // Reduce fin tras el desplazamiento
        return aux;
    }

    public int peek() {
        return elementos[frente]; // Siempre muestra el primero
    }
}

    
       
