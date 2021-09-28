/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author germanpujadas
 */
public class OrdenadorIT {
    Ordenador clasificador;

    @Before
    public void setUp() throws Exception {
        this.clasificador = new Ordenador();        
    }

    @Test
    public void testOrdenarPorHeapVacio() {
        LinkedList<TProduct> a = new LinkedList<>();
        clasificador.ordenarPorHeapSort(a);
        assertEquals(new LinkedList<TProduct>(), a);
    }

    @Test
    public void testOrdenarPorHeapSingle() throws Exception {
        LinkedList<TProduct> lista = new LinkedList<>();
        TProduct producto1 = new TProduct("12,sad");
        lista.add(producto1);
        
        clasificador.ordenarPorHeapSort(lista);
        assertEquals(lista, lista);
    }

   
}
