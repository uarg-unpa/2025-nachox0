//desde el método main, dadas dos pilas de caracteres P1 y P2 de igual cantidad de elementos, generar una cola de caracteres Q1 resultante de intercalar los elementos de ambas colas, de modo que las pilas queden como estaban originalmente.
public static void main (String[] args) {
        PilaChar P1 = new PilaChar();
        PilaChar P2 = new PilaChar();
        ColaChar Q1 = new ColaChar();

        //llen0 las pilas con valores
        P1.push(A);
        P1.push(B);
        P1.push(C);

        P2.push(D);
        P2.push(E);
        P2.push(F);

        //intercalar elementos de P1 y P2 en Q1
        PilaChar aux1 = new PilaChar();
        PilaChar aux2 = new PilaChar();

        //desapilar ambas pilas y almacenar en auxiliares
        while (!P1.estaVacia()) {
            aux1.push(P1.pop());
        }
        while (!P2.estaVacia()) {
            aux2.push(P2.pop());
        }

        //intercalar elementos en la cola
        while (!aux1.estaVacia() && !aux2.estaVacia()) {
            Q1.push((char) aux1.pop());
            Q1.push((char) aux2.pop());
        }

        //restaurar las pilas originales
        while (!aux1.estaVacia()) {
            P1.push(aux1.pop());
        }
        while (!aux2.estaVacia()) {
            P2.push(aux2.pop());
        }

        //Q1 tiene los elementos intercalados de P1 y P2
    }