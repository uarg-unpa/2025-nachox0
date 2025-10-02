package tp3;

public class Historial {
    private String[] paginas;
    private int cima;
    private final int MAX = 5;

    public Historial() {
        paginas = new String[MAX];
        cima = -1;
    }

    public boolean estaVacia() { 
        if (cima == -1)
            return true;
        else
            return false;
     }
    public boolean estaLlena() { return cima == MAX - 1; }
    public void meter(String pagina) {
        cima++;    
        paginas[cima] = pagina;
    }
    public String sacar() {
            return paginas[cima--];
    }

public String toString() {
    return "Pila con " + (cima + 1) + " elemento(s)";
    }
}