package tp3;

public class PilaNavegacion {
    private PaginaWeb[] paginas;
    private int cima;
    private final int MAX = 5;

    public PilaNavegacion() {
        paginas = new PaginaWeb[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public void meter(PaginaWeb pagina) {
        paginas[++cima] = pagina;
    }

    public PaginaWeb sacar() {
        return paginas[cima--];
    }

    public PaginaWeb elementoCima() {
        return paginas[cima];
    }

    public String toString() {
        return "Pila con " + (cima + 1) + " elemento(s)";
    }
}
