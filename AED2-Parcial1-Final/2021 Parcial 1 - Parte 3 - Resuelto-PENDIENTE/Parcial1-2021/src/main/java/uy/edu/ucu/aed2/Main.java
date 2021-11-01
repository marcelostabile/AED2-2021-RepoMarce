package uy.edu.ucu.aed2;

import java.util.LinkedList;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Creo el trie.
        TArbolTrie miTrie = new TArbolTrie();

        // Leer la secuencia del mensaje.
        String[] secuencia = ManejadorArchivosGenerico.leerArchivo("./src/main/java/uy/edu/ucu/aed2/mensaje.txt");
        
        // Instanciar el indice, largo de la secuencia menos uno.
        int indice = secuencia[0].length() - 1;

        // 
        while (indice >= 0) {
            String sufijo = "";
            for (int i = indice; i < secuencia[0].length(); i++) {
                sufijo += secuencia[0].charAt(i);
            }
            miTrie.insertar(sufijo, indice);
            indice--;
        }

        // INVOCAR A  trie.encontrarPatron("110101") Y escribir los resultados en el archivo 
        // SALIDA.TXT
        String[] salida = new String[2];

        LinkedList<Integer> resultados1 = miTrie.encontrarPatron("110101");
        Integer[] salida1 = resultados1.toArray(new Integer[resultados1.size()]);
        salida[0] = generarString(salida1, "Patron 110101: ");

        LinkedList<Integer> resultados2 = miTrie.encontrarPatron("1101011");
        Integer[] salida2 = resultados2.toArray(new Integer[resultados2.size()]);
        salida[1] = generarString(salida2, "Patron 1101011: ");

        // INVOCAR A  trie.encontrarPatron("110101") Y agregar los resultados en el archivo 
        // SALIDA.TXT
        ManejadorArchivosGenerico.escribirArchivo("salida.txt", salida);
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
