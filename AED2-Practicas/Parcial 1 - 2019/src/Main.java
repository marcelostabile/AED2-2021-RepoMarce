
import java.util.LinkedList;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // INSTANCIAR UN ARBOL DE SUFIJOS
        TArbolSufijosProteina asProteina = new TArbolSufijosProteina();

        // LEER LA CADENA DE AMINOACIDOS DESDE EL ARCHIVO
        String[] secuencia = ManejadorArchivosGenerico.leerArchivo("src/proteina.txt");

        // cargar el árbol de sufijos en la forma apropiada
        int indice = secuencia[0].length()-1;

        while (indice >= 0) {
            String sufijo ="";
            for (int i = indice; i < secuencia[0].length(); i++) {
                sufijo += secuencia[0].charAt(i);
            }
            asProteina.insertar(sufijo, indice);
            indice--;
        }
        // buscar las ocurrencias del patrón "KPL" 
        //String titular = "Ocurrencias del padrón " + elPatron + ":";
        String elPatron = "KPL";
        LinkedList<Integer> locations = asProteina.encontrarPatron(elPatron);
        System.out.println("archivo locations:" + locations.size());

        // buscar las ocurrencias del patrón "PQL" 
        elPatron = "PQL";
        LinkedList<Integer> locations1 = asProteina.encontrarPatron(elPatron);
        System.out.println("archivo locations1:" + locations1.size());

        // buscar las ocurrencias del patrón "CIEAL" 
        elPatron = "CIEAL";
        LinkedList<Integer> locations2 = asProteina.encontrarPatron(elPatron);
        System.out.println("archivo locations2:" + locations2.size());

        // Y escribir los resultados en el archivo 
        // SALIDA.TXT, titulando para cada patrón.
        String [] salida = new String[3];

        // locations
        String registros = "Ocurrencias del patrón KPL";
        for (Integer reg : locations) {
            registros += ", " + reg;           
        }
        salida[0] = registros;

        // locations1
        registros = "Ocurrencias del patrón PQL";
        for (Integer reg : locations1) {
            registros += ", " + reg;
        }
        salida[1] = registros;

        // locations2
        registros = "Ocurrencias del patrón CIEAL";
        for (Integer reg : locations2) {
            registros += ", " + reg;
        }
        salida[2] = registros;

        // Escribir archivo.
        ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salida);

    }
}
