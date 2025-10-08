package tp4;

public class ColaNombres {
    private String[] elementos; 
    private int frente;         //índice del primer elemento
    private int fin;            //índice de la próxima posición libre
    private int cantidad;       //cantidad de elementos en la cola
    private final int MAX = 10; //capacidad máxima de la cola

    // Constructor
    public ColaNombres() {
        elementos = new String[MAX];
        frente = 0;
        fin = 0;
        cantidad = 0; //inicialmente la cola está vacía
    }

    //verifica si la cola está vacía
    public boolean estaVacia() {
        return cantidad == 0;
    }

    //verifica si la cola está llena
    public boolean estaLlena() {
        return cantidad == MAX;
    }

    //encola un nuevo nombre al final de la cola
    public void encolar(String nombre) {
        elementos[fin] = nombre;               //se coloca el nombre en la posición fin
        fin = (fin + 1) % MAX;                 //avanza el fin circularmente
        cantidad++;                             //incrementa la cantidad de elementos
    }

    //desencola el nombre del frente de la cola
    public String desencolar() {
        String aux = elementos[frente];        //se guarda el nombre del frente
        frente = (frente + 1) % MAX;           //avanza el frente circularmente
        cantidad--;                             //reduce la cantidad de elementos
        return aux;                             //retorna el nombre desencolado
    }

    //devuelve el nombre en el frente sin eliminarlo (peek mejorado)
    public String peek() {
        //solo devuelve el frente si hay elementos
        if (!estaVacia()) {
            return elementos[frente];          //retorna el primer nombre
        }
        //si la cola está vacía, retorna inválido
        return null;
    }

    //muestra el contenido de la cola en orden FIFO
    @Override
    public String toString() {
        String texto = "Cola de nombres:";
        if (estaVacia()) {
            texto = texto + "(vacía)";
        } else {
            //se recorre la cola desde el frente hasta la cantidad de elementos
            for (int i = 0; i < cantidad; i++) {
                int indice = (frente + i) % MAX;  //indice circular
                texto = texto + elementos[indice];
            }
        }
        return texto;
    }
}
