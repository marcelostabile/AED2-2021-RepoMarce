import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

import aed2.*;

public class testBusqueda {

    /**
     * Listas para tests.
     */
    private static int[] miListaDesordenada = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
    private static int[] miListaOrdenada = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    @BeforeEach
    public void setUp() throws Exception {
    }

    /**
     * Búsqueda Lineal.
     */
    @Test
    public void testBusquedaLineal() {
        assertEquals(89, Busqueda.busquedaLineal(89, miListaDesordenada));
        assertEquals(29, Busqueda.busquedaLineal(29, miListaDesordenada));
        assertEquals(97, Busqueda.busquedaLineal(97, miListaDesordenada));
        assertEquals(-1, Busqueda.busquedaLineal(25, miListaDesordenada));
    }

    /**
     * Búsqueda Binaria ingresando un arreglo ordenado.
     */
    @Test
    public void testBusquedaBinaria() {
        assertEquals(2, Busqueda.busquedaBinaria(2, miListaOrdenada));
        assertEquals(19, Busqueda.busquedaBinaria(19, miListaOrdenada));
        assertEquals(97, Busqueda.busquedaBinaria(97, miListaOrdenada));
        assertEquals(-1, Busqueda.busquedaBinaria(25, miListaOrdenada));
    }

    /**
     * Búsqueda Binaria ingresando un arreglo desordenado.
     * Para ordenar el arreglo antes de la búsqueda, ejecutamos una inserción directa.
     */
    @Test
    public void testBusquedaBinariaPreordenandoArreglo() {

        // Ordenamos la lista por inserción directa.
        int[] listaOrdenada = InsercionDirecta.insercionDirecta(miListaDesordenada);
        // Ejecutamos la búsqueda.
        assertEquals(2, Busqueda.busquedaBinaria(2, listaOrdenada));
        assertEquals(19, Busqueda.busquedaBinaria(19, listaOrdenada));
        assertEquals(97, Busqueda.busquedaBinaria(97, listaOrdenada));
        assertEquals(-1, Busqueda.busquedaBinaria(25, listaOrdenada));
    }

}
