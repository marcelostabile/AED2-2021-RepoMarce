package tareadom;

import extras.*;

public class mainUT1PD1 {

    public static void ejecutar() {
        
        /*  
        UT1-PD1
        Consigna:
        -Método Búsqueda Lineal
        -Método Búsqueda Binaria
        -Vector de Claves Enteras, orden ascendente
        -Indicar comparaciones
        -Promedio de búsquedas exitosas y no exi.
        */

        Buscador buscador = new Buscador();
            
        // Búsqueda Lineal en lista desordenada.
        int[] listaDesordenada = {89, 3, 79, 43, 5, 67, 13, 61, 17, 31, 37, 47, 29, 53, 23, 2, 59, 71, 11, 73, 19, 83, 7, 41, 97};
        System.out.println("Resultado búsqueda lineal 89: " + buscador.busquedaLineal(89, listaDesordenada));
        System.out.println("Resultado búsqueda lineal 29: " + buscador.busquedaLineal(29, listaDesordenada));
        System.out.println("Resultado búsqueda lineal 97: " + buscador.busquedaLineal(97, listaDesordenada));
        System.out.println("Resultado búsqueda lineal 25: " + buscador.busquedaLineal(25, listaDesordenada));

        // Búsqueda binaria en lista ordenada exclusivamente.
        int[] listaOrdenada = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println("Resultado búsqueda binaria 2:  " + buscador.busquedaBinaria(2, listaOrdenada));
        System.out.println("Resultado búsqueda binaria 19: " + buscador.busquedaBinaria(19, listaOrdenada));
        System.out.println("Resultado búsqueda binaria 97: " + buscador.busquedaBinaria(97, listaOrdenada));
        System.out.println("Resultado búsqueda binaria 25: " + buscador.busquedaBinaria(25, listaOrdenada));

        System.out.println("Fin del ejercicio.");

    }
}