import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

import aed2.*;

public class testHeapsort {

    /**
     * Listas para tests.
     */
    private static final int[] miListaDesordenada = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
    private static final int[] miListaOrdenada = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    /**
     * Partimos de una arreglo desordenado, lo ordenamos con heapsort, verificamos con búsqueda binaria.
     * Si el arreglo no queda ordenado, la búsqueda binaria falla ya que requiere una lista ordenada como entrada.
     */
    @Test
    public void testHeapSortBusquedaBin() {

        // Ordenamos la lista.
        int[] listaOrdenada = Heapsort.heapSort(miListaDesordenada);

        // Estos valores existen.
        assertEquals(2, Busqueda.busquedaBinaria(2, listaOrdenada));
        assertEquals(19, Busqueda.busquedaBinaria(19, listaOrdenada));
        assertEquals(97, Busqueda.busquedaBinaria(97, listaOrdenada));
        // // El siguiente valor no existe, debe retornar -1.
        assertEquals(-1, Busqueda.busquedaBinaria(25, listaOrdenada));
    }

}
