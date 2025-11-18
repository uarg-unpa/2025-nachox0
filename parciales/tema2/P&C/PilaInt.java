
//crear un método dentro de la clase PilaInt que reciba otra pila de enteros P2 también, calcule y retorne verdadero si la pila tiene más elementos pares que la pila P2 que se envía por parámetro o falso si P2 tiene más elementos pares. Las pilas deben quedar como estaban originalmente
public class PilaInt {
    private int[] elementos;
    private int cima;
    private final int MAX = 100;

    public PilaInt() {
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public void push(int elem) { //meter
        if (!estaLlena()) {
            elementos[++cima] = elem;
        }
    }

    public int pop() { //sacar
        if (!estaVacia()) {
            return elementos[cima--];
        }
        return -1; // 
    }

    // Método para comparar la cantidad de elementos pares entre dos pilas
    public boolean masElementosPares(PilaInt P2) {
        PilaInt aux1 = new PilaInt();
        PilaInt aux2 = new PilaInt();
        int contPares1 = 0;
        int contPares2 = 0;

        // Contar pares en la primera pila
        while (!this.estaVacia()) {
            int elemento = this.pop();
            if (elemento % 2 == 0) {
                contPares1++;
            }
            aux1.push(elemento);
        }

        // Restaurar la primera pila
        while (!aux1.estaVacia()) {
            this.push(aux1.pop());
        }

        // Contar pares en la segunda pila
        while (!P2.estaVacia()) {
            int elemento = P2.pop();
            if (elemento % 2 == 0) {
                contPares2++;
            }
            aux2.push(elemento);
        }

        // Restaurar la segunda pila
        while (!aux2.estaVacia()) {
            P2.push(aux2.pop());
        }

        return contPares1 > contPares2;
    }
}