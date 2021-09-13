import javax.management.relation.InvalidRelationServiceException;

import aed2.*;
import archivos.*;
import tdas.*;
import tdas_extras.*;

public class main {

    public static void main(String[] args) throws Exception {

        /**
         * Listas de entrada.
         */
        int[] miListaDesordenada = {5,6,10,18,8,9,9,10,3,9};
        //int[] miListaDesordenada = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
        int[] miListaOrdenada = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};


        /**
         * MÉTODOS DE BÚSQUEDA.
         */
        System.out.println("\nMÉTODOS DE BÚSQUEDA\n");

        /**
         * Búsqueda Lineal.
         */
        System.out.println("\nBúsqueda Lineal\n");
        System.out.println("Búsqueda 2: " + Busqueda.busquedaLineal(2, miListaDesordenada));
        System.out.println("Búsqueda 17: " + Busqueda.busquedaLineal(17, miListaDesordenada));
        System.out.println("Búsqueda 97: " + Busqueda.busquedaLineal(97, miListaDesordenada));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaLineal(25, miListaDesordenada));

        /**
         * Búsqueda Binaria.
         * La lista de entrada debe estar ordenanda ascendente.
         */
        System.out.println("\nBúsqueda Binaria\n");
        System.out.println("Búsqueda 2: " + Busqueda.busquedaBinaria(2, miListaOrdenada));
        System.out.println("Búsqueda 17: " + Busqueda.busquedaBinaria(17, miListaOrdenada));
        System.out.println("Búsqueda 97: " + Busqueda.busquedaBinaria(97, miListaOrdenada));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, miListaOrdenada));


        /**
         * MÉTODOS DE ORDENAMIENTO.
         */
        System.out.println("\nMÉTODOS DE ORDENAMIENTO\n");

        /**
         * Inserción Directa.
         */
        System.out.println("\nInserción Directa\n");
        int[] ordenadaID = InsercionDirecta.insercionDirecta(miListaDesordenada.clone());
        imprimirLista(ordenadaID);
        System.out.println("Búsqueda 2: " + Busqueda.busquedaBinaria(2, ordenadaID));
        System.out.println("Búsqueda 17: " + Busqueda.busquedaBinaria(17, ordenadaID));
        System.out.println("Búsqueda 97: " + Busqueda.busquedaBinaria(97, ordenadaID));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaID));

        /**
         * Shell sort.
        */

        /**
         * Burbuja. 
        */

        /**
         * Quick sort.
        */

        /**
         * Selección directa. 
        */

        /**
         * Heap sort.
        */
        System.out.println("\nHeapsort\n");
        int[] ordenadaHeapsort = Heapsort.heapSort(miListaDesordenada.clone());
        imprimirLista(ordenadaHeapsort);
        System.out.println("Búsqueda 2: " + Busqueda.busquedaBinaria(2, ordenadaHeapsort));
        System.out.println("Búsqueda 17: " + Busqueda.busquedaBinaria(17, ordenadaHeapsort));
        System.out.println("Búsqueda 97: " + Busqueda.busquedaBinaria(97, ordenadaHeapsort));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaHeapsort));

        /**
         * Merge sort. 
        */

        /**
         * Bucket sort.
        */

        /**
         * Bin sort. 
        */

        /**
         * Radix.
        */

        /**
         * Cuenta por distribución. 
        */


    }


    /**
     * Imprime por pantalla el contenido de una lista.
     * @param lista
     */
    private static void imprimirLista(int[] lista) {

        System.out.println("Imprimiendo lista:");
        for (int i = 0; i <= lista.length-1; i++) {
            System.out.println("[" + i + "]: " + lista[i]);
        }
    }

}
