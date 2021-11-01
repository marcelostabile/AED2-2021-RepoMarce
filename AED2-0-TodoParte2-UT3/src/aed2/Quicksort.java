package aed2;

public class Quicksort {
    
    /**
     * Ordenamiento por Quicksort.
     */
    public static int[] quicksort(int[] lista, int i, int j) {

        int cursorIzq = i;
        int cursorDer = j;
        int indicePivote = encuentraPivote(lista, i, j);
        int pivote = lista[indicePivote];
        
        while (cursorIzq <= cursorDer) {

            while (lista[cursorIzq] < pivote && cursorIzq < j) {
                cursorIzq++;
            }

            while (lista[cursorDer] > pivote && cursorDer > i) {
                cursorDer--;
            }
    
            if (cursorIzq <= cursorDer) {
                Intercambio.intercambia(lista, cursorDer, cursorIzq);
                cursorIzq++;
                cursorDer--;
            }

            if (i < cursorDer) {
                quicksort(lista, i, cursorIzq-1);
            }
    
            if (cursorIzq > j) {
                quicksort(lista, cursorIzq, j);
            }

        }
        return lista;
    }


    /**
     * Método para encontrar el pivote.
     */
    private static int encuentraPivote(int[] lista, int cursorIzq, int cursorDer) {

        return (cursorDer - cursorIzq) / 2 + cursorIzq;
    }
    
}
