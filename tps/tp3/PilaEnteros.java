package tp3;

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX]; // Crear el array
        // Completar: inicializar cima
        cima= -1;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
       return cima == -1;
    }
    // Verifica si la pila está llena
    public boolean estaLlena() {
    // Completar: devolver true si cima está en el límite del array
        return cima == MAX - 1;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
    // Incrementar cima y asignar el elemento
        cima++;
        elementos[cima] = elem;
        
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
    // Guardar el elemento de la cima, decrementar cima y devolverlo
        int aux = elementos[cima];
        cima--;
        return aux;
        }

    //Contar la cantidad de ocurrencias
    public int contarOcurrencias(int valor) {
        PilaEnteros aux = new PilaEnteros();
        int contador = 0;
        while (!estaVacia()) {
                int elemento = sacar();
                aux.meter(elemento);
                if ( elemento == valor) {
                    contador++;
                }
            }
            //restaurar.
            
            while (!aux.estaVacia()) {
                meter(aux.sacar());
            }
            return contador;
        }
    }
