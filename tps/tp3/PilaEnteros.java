package tp3;

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX]; // Crear el array
        // Completar: inicializar cima
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
       return cima == -1;
    }
    // Verifica si la pila está llena
    public boolean estaLlena() {
        // Completar: devolver true si cima está en el límite del array
        return false;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
              // Completar: incrementar cima y asignar el elemento
        
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
                  // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
        
         }
}