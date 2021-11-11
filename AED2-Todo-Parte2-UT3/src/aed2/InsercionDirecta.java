package aed2;

public class InsercionDirecta {

    /**
     * Ordenamiento por inserción directa retornando una lista.
     * @param lista
     * @return una lista.
     */
    public static int[] insercionDirecta(int[] lista) {

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


}
