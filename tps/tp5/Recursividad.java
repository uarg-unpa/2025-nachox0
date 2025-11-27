package tps.tp5;


public class Recursividad {
    //punto 4: suma 1 + 2 + 3 + … + (n - 1) + n
    public static int Suma(int n) {
        if (n == 1)
            return 1;
        else
            return n + Suma(n - 1);
}
    //punto 5: un método recursivo para encontrar la suma de los enteros pares hasta N
    public static int SumaPares(int n) {
        if (n<=0) {
            return 0;
        }
        else {
            if (n%2==0) {
                return n+SumaPares(n-1);
            }
            else {
                return SumaPares(n-2);
            }
        }
    }
    //punto 6
    public static int FuncionG(int x, int y) {
        if (x<=y) {
            return 1;
        }
        else {
            return 1+FuncionG(x,y+1);
        }
    }
    //punto 7: método recursivo int vocales(String cd) para calcular el número de vocales de una cadena
    public static int Vocales(String cadena) {
        if (cadena.length()==0) {
            return 0;
        }
        else {
            // Tomo el primer carácter en minúscula para unificar comparación
            char ch = Character.toLowerCase(cadena.charAt(0));

            // Si el primer carácter es una vocal, cuento 1 + recursión sobre el resto
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return 1 + Vocales(cadena.substring(1));
            else
                return Vocales(cadena.substring(1))
    }
    //punto 9: método recursivo que determine si un número está presente en un arreglo
    public static boolean Presente(int []array, int n, int indice) {
        if (indice==array.length)
            return false;
        else
            if (array[indice]==n)
                return true;
            else 
                return Presente(array,n,indice+1);
        }
    //punto 11:un método recursivo que cuente las ocurrencias de un número dado en un arreglo de enteros
    public static int Ocurrencias (int []array, int n, int indice) {
        if (indice==array.length)
            return 0;
        else
            if (array[indice]==n)
                return 1+Ocurrencias(array, n, indice+1);
            else 
                return Ocurrencias(array, n, indice+1);
    }
    //punto 10: método recursivo que encuentre el valor mínimo en un arreglo de enteros
    public static int ValorMinimo(int [] array, int indice) {
        if (indice==array.length-1)
            return array[indice];
        else {
            int minResto=ValorMinimo(array, indice+1);
            if (array [indice]<minResto) 
                return array[indice];
            else 
                return minResto;
    }
    //escribir un metodo recursivo que calcule el maximo elemento en un vector de enteros
    public static int ValorMaximo(int [] array, int indice) {
        if (indice==array.length-1)
            return array[indice];
        else {
            int maxResto=ValorMaximo(array, indice+1);
            if (array [indice]>maxResto)
                return array[indice];
            else 
                return maxResto;
        }
    }
    //programar un algoritmo recursivo que permita sumar los elementos de un vector
    public static int SumaElementos(int [] array, int indice) {
        if (indice==array.length)
            return 0;
        else
            return array[indice]+SumaElementos(array, indice+1);
    }
    //escribir un metodo recursivo que calcule la suma de los digitos de un numero entero positivo. Por ejemplo si el numero es 1234, el resultado deberia ser 1+2+3+4=10
    public static int SumaDigitos(int n) {
        if (n<==0)
            return 0;
        else
            return (n%10)+SumaDigitos(n/10);
    }
    //escribir un metodo recursivo que calcule a^b (a elevado a la potencia b). Por ejemplo 2^3=2*2*2=8
    public static int Potencia(int a, int b) {
        if (b==0)
            return 1;
        else
            return a*Potencia(a, b-1);
    }
    //escribir un metodo recursivo que calcule la suma de los primeros n numeros multiplos de 3. Por ejemplo si n=15, el resultado deberia ser 3+6+9+12+15=45
    public static int SumaMultiplosDe3(int n) {
        if (n<3)
            return 0;
        else
            return n+SumaMultiplosDe3(n-3);
    }
    //dado un array de elementos enteros, escribir metodos recursivos que permitan:
    //a) Calcular el promedio de los elementos del array
    public static double Promedio(int [] array, int indice) {
        if (indice==array.length)
            return 0;
        else
            return (array[indice]+Promedio(array, indice+1)*array.length)/(array.length);
    }
    //b)el producto de los elementos del array
    public static int Producto(int [] array, int indice) {
        if (indice==array.length)
            return 1;
        else
            return array[indice]*Producto(array, indice+1);
    }
    //c)la cantidad de numeros negativos
    public static int CantidadNegativos(int [] array, int indice) {
        if (indice==array.length)
            return 0;
        else
            if (array[indice]<0)
                return 1+CantidadNegativos(array, indice+1);
            else
                return CantidadNegativos(array, indice+1);
    }
    //d)el factorial de un numero n
    public static int Factorial(int n) {
        if (n==0)
            return 1;
        else
            return n*Factorial(n-1);
    }
}