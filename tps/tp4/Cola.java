package tp4;

public class Cola{
    private final int MAX=5;
    private int frente, fin;
    private int []elementos;

    public Cola()
    {
        frente=0;
        fin=0;
        elementos=new int[MAX];
    }
    private int siguiente(int subind)
    
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
    public int borrar() {
       
    }
    
       
