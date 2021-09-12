package aed2;

public class Ordenamiento {

    /**
     * Ordenamiento por inserción directa retornando una lista.
     * @param lista
     * @return una lista.
     */
    public static int[] InsercionDirecta(int[] lista) {

        for (int i = 1; i < lista.length; i++) {
            int aux = lista[i];
            int anterior = i - 1;
            while (anterior >= 0 && aux < lista[anterior]) {
                lista[anterior + 1] = lista[anterior];
                anterior = anterior - 1;
            }  
            lista[anterior + 1] = aux;
        }
        return lista;
    }


    /**
     * Ordenamiento por inserción directa, se pasa una lista por parámetro.
     * @param lista
     */
    public static void ordenaInsercionDirecta(int[] lista) {

        for (int i = 1; i < lista.length; i++) {
            int aux = lista[i];
            int anterior = i - 1;
            while (anterior >= 0 && aux < lista[anterior]) {
                lista[anterior + 1] = lista[anterior];
                anterior = anterior - 1;
            }  
            lista[anterior + 1] = aux;
        }
    }


}
