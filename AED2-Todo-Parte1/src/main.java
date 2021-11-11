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
        int[] miListaDesordenada1 = {9,2,7,4,5,6,3,8,1};
        int[] miListaOrdenada1 = {1,2,3,4,5,6,7,8,9};

        int[] miListaDesordenada2 = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
        int[] miListaOrdenada2 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        /**
         * MÉTODOS DE BÚSQUEDA.
         */

        /**
         * Búsqueda Lineal.
         */
        System.out.println("\nBúsqueda Lineal\n");
        System.out.println("Búsqueda 9: " + Busqueda.busquedaLineal(9, miListaDesordenada1));
        System.out.println("Búsqueda 5: " + Busqueda.busquedaLineal(5, miListaDesordenada1));
        System.out.println("Búsqueda 1: " + Busqueda.busquedaLineal(1, miListaDesordenada1));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaLineal(25, miListaDesordenada1));

        
        /**
         * Búsqueda Binaria.
         * La lista de entrada debe estar ordenanda ascendente.
         */
        System.out.println("\nBúsqueda Binaria\n");
        System.out.println("Búsqueda 1 " + Busqueda.busquedaBinaria(1, miListaOrdenada1));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, miListaOrdenada1));
        System.out.println("Búsqueda 6 " + Busqueda.busquedaBinaria(6, miListaOrdenada1));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, miListaOrdenada1));


        /**
         * MÉTODOS DE ORDENAMIENTO.
         */

        /**
         * Inserción Directa.
         */
        System.out.println("\nInserción Directa\n");

        System.out.println("Imprimir desordenada:");
        imprimirLista(miListaDesordenada1);

        int[] ordenadaXInsercionDirecta = InsercionDirecta.insercionDirecta(miListaDesordenada1.clone());
        imprimirLista(ordenadaXInsercionDirecta);

        System.out.println("\nBúsqueda Binaria\n");
        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXInsercionDirecta));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXInsercionDirecta));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXInsercionDirecta));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXInsercionDirecta));


        /**
         * Burbuja. 
        */
        System.out.println("\nBurbuja\n");

        System.out.println("Imprimir desordenada:");
        imprimirLista(miListaDesordenada1);

        int[] ordenadaXBurbuja = Burbuja.burbuja(miListaDesordenada1.clone());
        imprimirLista(ordenadaXBurbuja);

        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXBurbuja));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXBurbuja));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXBurbuja));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXBurbuja));


        /**
         * Quick sort.
        */
        System.out.println("\nQuick sort\n");

        int[] lista = miListaDesordenada1.clone();
        int i = 0;
        int j = lista.length-1;

        System.out.println("Imprimir desordenada:");
        imprimirLista(lista);

        int[] ordenadaXQuicksort = Quicksort.quicksort(lista, i, j);
        imprimirLista(ordenadaXQuicksort);

        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXQuicksort));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXQuicksort));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXQuicksort));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXQuicksort));


        /**
         * Selección directa. 
        */
        System.out.println("\nSelección Directa\n");

        lista = miListaDesordenada1.clone();
        System.out.println("Imprimir desordenada:");
        imprimirLista(lista);

        int[] ordenadaXSeleccionDi = Heapsort.heapSort(lista);
        imprimirLista(ordenadaXSeleccionDi);

        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXSeleccionDi));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXSeleccionDi));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXSeleccionDi));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXSeleccionDi));

        /**
         * Heap sort.
        // */
        System.out.println("\nHeapsort\n");

        lista = miListaDesordenada1.clone();
        System.out.println("Imprimir desordenada:");
        imprimirLista(lista);

        int[] ordenadaXHeapsort = Heapsort.heapSort(lista);
        imprimirLista(ordenadaXHeapsort);

        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXHeapsort));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXHeapsort));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXHeapsort));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXHeapsort));


        /**
         * Shell sort.
        */
        System.out.println("\nShellsort\n");

        System.out.println("Imprimir desordenada:");
        imprimirLista(miListaDesordenada1);

        int[] ordenadaXShellsort = Shellsort.shellsort(miListaDesordenada1.clone());
        imprimirLista(ordenadaXShellsort);

        System.out.println("\nBúsqueda Binaria\n");
        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXShellsort));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXShellsort));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXShellsort));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXShellsort));


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
        System.out.println("\nCuenta por Distribución\n");

        System.out.println("Imprimir desordenada:");
        imprimirLista(miListaDesordenada1);

        int[] ordenadaXCuenta = Cuenta.cuenta(miListaDesordenada1.clone());
        imprimirLista(ordenadaXCuenta);

        System.out.println("\nBúsqueda Binaria\n");
        System.out.println("Búsqueda 1: " + Busqueda.busquedaBinaria(1, ordenadaXCuenta));
        System.out.println("Búsqueda 9: " + Busqueda.busquedaBinaria(9, ordenadaXCuenta));
        System.out.println("Búsqueda 6: " + Busqueda.busquedaBinaria(6, ordenadaXCuenta));
        System.out.println("Búsqueda 25: " + Busqueda.busquedaBinaria(25, ordenadaXCuenta));

        /**
        * Entrada desde archivo.
        */





        /**
        * Salida para archivo con título.
        */
        String[] salida = new String[3];

        salida[0] = ArchivoSalida.generarLinea(ordenadaXBurbuja, "Burbuja: ");
        salida[1] = ArchivoSalida.generarLinea(ordenadaXInsercionDirecta, "Insercion:");
        salida[2] = ArchivoSalida.generarLinea(ordenadaXQuicksort, "Quicksort: ");

        // Salida.
        ManejadorArchivosGenerico.escribirArchivo("salida.txt", salida);


        

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
