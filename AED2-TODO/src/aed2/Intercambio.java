package aed2;

public class Intercambio {
    
    public static void intercambia(int[] arreglo, int elemento1, int elemento2) {

        // clave del elemento 2.
        int aux = arreglo[elemento2];
        // reasignamos el elemento 1 a la posición del elemento 2.
        arreglo[elemento2] = arreglo[elemento1];
        // reasignamos el elemento 2.
        arreglo[elemento1] = aux;
    }

}
