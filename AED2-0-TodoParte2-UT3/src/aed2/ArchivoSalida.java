package aed2;

import java.util.LinkedList;

public class ArchivoSalida {
    
    public static String generarLinea(LinkedList<Integer> listaEncadenada, String titulo) {
        Integer[] lista = listaEncadenada.toArray(new Integer[listaEncadenada.size()]);
        String resultado = generarString(lista, titulo);
        return resultado;
    }

    public static String generarLinea(int[] arrEntrada, String titulo) {
        String resultado = generarString(Convertir.convertirXAInteger(arrEntrada), titulo);
        return resultado;
    }

    public static String generarString(Integer[] lista, String titulo) {

        // Título.
        String lineas = titulo;
        // Lineas.
        int N = lista.length;
        for (int r = 0; r <= N-1; r++) {
            lineas += lista[r];
            if (r < N-1) {
                lineas += ",";
            } 
        }
        return lineas;
    }

}
