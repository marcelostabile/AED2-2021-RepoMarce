
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

        while (indice >= 0){
            String sufijo = "";
            for (int i = indice; i < secuencia[0].length(); i++) {
                sufijo += secuencia[0].charAt(i);
            }
            asProteina.insertar(sufijo, indice);
            indice --;   
        }
// buscar las ocurrencias del patrón "KPL" 
        String elPatron = "KPL";
        LinkedList<Integer> locations = asProteina.encontrarPatron(elPatron);

// buscar las ocurrencias del patrón "PQL" 
        elPatron = "PQL";
        LinkedList<Integer> locations1 = asProteina.encontrarPatron(elPatron);

// buscar las ocurrencias del patrón "CIEAL" 
        elPatron = "CIEAL";
        LinkedList<Integer> locations2 = asProteina.encontrarPatron(elPatron);

        String[] salida = new String[3];
        String data = "Ocurrencias del patron KPL: ";
        for(Integer loc : locations){
            data += "," + loc;
        }
        salida[0] = data;

        data = "Ocurrencias del patron PQL: ";
        for(Integer loc : locations1){
            data += "," + loc;
        }
        salida[1] = data;
        
        data = "Ocurrencias del patron CIEAL: ";
        for(Integer loc : locations2){
            data += "," + loc;
        }
        salida[2] = data;
        ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salida);
// Y escribir los resultados en el archivo 
// SALIDA.TXT, titulando para cada patrón. 
    }
}
