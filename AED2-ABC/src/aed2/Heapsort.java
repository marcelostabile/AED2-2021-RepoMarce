package aed2;

public class Heapsort {
    
    /**
     * Ordenamiento por heapsort.
     * @param listaOrigen
     * @return una lista.
     */
    public static int[] heapSort(int[] lista) {

        imprimirLista(lista);
        int N = lista.length - 1;
        // APO a partir de lista desordenado.
        for (int i = (N / 2); i >= 0; i--) {
            desplazaElemento(lista, i, N);
            imprimirLista(lista);
        }
        // Para cada i, quita la raíz y la intercambia con esa posición i, final de la lista de salida.
        // Desplaza elem. de la raíz a su posición. APO desde 1 hasta i-1; lista salida i hasta N.
        for (int i = N; i > 0; i--) {
            intercambiar(lista, 0, i);
            desplazaElemento(lista, 0, i - 1);
            //imprimirLista(lista);
        }
        return lista;
    }

    private static void imprimirLista(int[] lista) {

        String a = "";
        for (int i = 0; i <= lista.length-1; i++) {
            a = a + "-" + lista[i];
            
        }
        System.out.println(a);
    }

    /**
     * Recibe una lista y dos posiciones, desplaza los elementos indicados en las posiciones.
     * @param lista
     * @param primero
     * @param ultimo
     */
    private static void desplazaElemento(int[] lista, int primero, int ultimo) {
        
        if (primero < ultimo) {
            int actual = primero;
            while (actual <= ultimo / 2 ) {

                if (ultimo == actual * 2 ) {                  // Actual tiene un hijo.
                    if (lista[actual] > lista[actual * 2]) {
                        intercambiar(lista, actual, actual * 2);
                    }
                    actual = ultimo;

                } else {                                        // Actual tiene dos hijos.
                    // Determinar cúal es el hijo menor.
                    int hijoUno = lista[actual * 2];
                    int hijoDos = lista[actual * 2 + 1];
                    // Indice del hijo menor.
                    int menor = 0;
                    if (hijoUno < hijoDos) {
                        menor = actual * 2;
                    } else {
                        menor = actual * 2 + 1;
                    }
                    // Comparamos con el padre y si corresponde intercambiamos.
                    if (lista[actual] < lista[menor]) {
                        intercambiar(lista, actual, menor);
                        actual = menor;
                    } else {
                        actual = ultimo;
                    }
                }
            }
        }
    }


    /**
     * Recibe una lista y dos posiciones, intercambia los elementos.
     * @param lista
     * @param pos1
     * @param pos2
     */
    private static void intercambiar(int[] lista, int pos1, int pos2) {
        int aux = lista[pos2];
        lista[pos2] = lista[pos1];
        lista[pos1] = aux;
    }

}
