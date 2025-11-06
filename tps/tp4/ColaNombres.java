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

    public int getCantidad() {
        return cantidad;
    
    }
    //simula manejo de cola, retorna el frente como si fuera una operación controlada
    public String peek() {
        return obtenerFrente();
    }

    private String obtenerFrente() {
        return elementos[frente]; //metodo auxiliar para encapsular acceso
    }
    
}
