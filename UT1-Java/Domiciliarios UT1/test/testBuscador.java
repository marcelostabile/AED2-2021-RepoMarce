package testBusquedas;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.event.InternalFrameAdapter;

import tdas.*;
import extras.*;

/**
 * Tests
 */
public class testBusquedas {

    @BeforeEach
    public void setUp() throws Exception {
        
        // vectores de prueba.
        final int[] arregloDesordenado = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
        final int[] arregloOrdenado = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        // Buscador.
        Buscador buscador = new Busquedas();
    }

    /**
     * Búsqueda Lineal.
     */
    @Test
    public void testBusquedaLineal() {
        assertEquals(89, buscador.busquedaLineal(89, listaDesordenada));
        assertEquals(29, buscador.busquedaLineal(29, listaDesordenada));
        assertEquals(97, buscador.busquedaLineal(97, listaDesordenada));
        assertEquals(-1, buscador.busquedaLineal(25, listaDesordenada));
    }

    /**
     * Búsqueda Binaria.
     */
    @Test
    public void testBusquedaBinaria() {
        assertEquals(2, buscador.busquedaBinaria(2, listaOrdenada));
        assertEquals(19, buscador.busquedaBinaria(19, listaOrdenada));
        assertEquals(97, buscador.busquedaBinaria(97, listaOrdenada));
        assertEquals(-1, buscador.busquedaBinaria(25, listaOrdenada));
    }

}
