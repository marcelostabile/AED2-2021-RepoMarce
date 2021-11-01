import tdas.*;
import tdas2.*;
import extras.*;
import tareadom.*;
import tareadom.mainUT1PD1;

public class main {

    public static void main(String[] args) throws Exception {


        /**
         * Listas de entrada.
         */
        int[] miLista = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
        int[] miListaOrdenada = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};


        /**
         * Métodos de ordenamiento.
         */
        System.out.println("MÉTODOS DE BÚSQUEDA\n");

        /**
         * UT1-PD1
         * Búsqueda Lineal.
         * Búsqueda Binaria.
         */
        mainUT1PD1.ejecutar();

        /**
         * UT1-PD3
         * Suma, Multiplicación de Enteros positivos.
         */
        //mainUT1PD3.ejecutar();


        /**
         * Métodos de ordenamiento.
         */
        System.out.println("MÉTODOS DE ORDENAMIENTO-*\n");

        /**
         * Inserción Directa (1)
         */
        InsercionDirecta inserDir = new InsercionDirecta();
        
        System.out.println("Inserción Directa - 1\n");
        inserDir.ordenarInsercionDirecta(miLista);
        imprimirLista(miLista);


        /**
         * Inserción Directa (2)
         */
        System.out.println("Inserción Directa - 2\n");
        int[] listaResultado = inserDir.ordenaInsercionDirecta(miLista);
        imprimirLista(listaResultado);
    }


    /**
     * Imprime por pantalla el contenido de una lista.
     * @param lista
     */
    private static void imprimirLista(int[] lista) {

        System.out.println("Imprimiendo lista:\n");
        for (int i = 0; i <= lista.length-1; i++) {
            System.out.println(lista[i]);
        }
    }

}











//         //Ordenador ordena = new Ordenador();

//         //int[] arrResultado = ordena.insercionDirecta(arregloDesordenado);

//         // for (int i = 0; i <= arrResultado.length-1; i++) {
//         //     System.out.println(arrResultado[i]);
//         // }

//         /**
//          * TAREAS DOMICIALIARIAS.
//          */


        
//     }
// }
