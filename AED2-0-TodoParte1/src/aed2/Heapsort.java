package aed2;

public class Heapsort {
    
    /**
     * Ordenamiento por heapsort.
     * @param lista
     * @return una lista de enteros.
     */
    public static int[] heapSort(int[] lista) {

        int N = lista.length;

        for (int i = (N-1) / 2; i >= 0; i--) {
            desplazaElemento(lista, i, N-1);
        }

        for (int i = N-1; i > 0; i--) {
            Intercambio.intercambia(lista, 0, i);
            desplazaElemento(lista, 0, i-1);
        }

        return lista;
    }    
     

    /**
     * Desplaza los elementos.
     * @param lista
     * @param primero
     * @param ultimo
     */
    private static void desplazaElemento(int[] lista, int primero, int ultimo) {

        if (primero < ultimo) {
            int actual = primero;
            while (actual <= (ultimo / 2) ) {
                if (ultimo == actual * 2) {
                    if (lista[actual] > lista[actual * 2]) {
                        Intercambio.intercambia(lista, actual, actual * 2);
                    }
                    actual = ultimo;
                } else {
                    int menor = Math.min(actual * 2, actual * 2 + 1);
                    if (lista[actual] > lista[menor]) {
                        Intercambio.intercambia(lista, actual, menor);
                        actual = menor;
                    } else {
                        actual = ultimo;
                    }
                }
            }
        }
    }

    /**
     * Imprime por pantalla el contenido de una lista.
     * @param lista
     */
    public static void imprimirLista(int[] lista) {

        System.out.println("Imprimiendo lista:");
        for (int i = 0; i <= lista.length-1; i++) {
            System.out.println("[" + i + "]: " + lista[i]);
        }
    }

}
