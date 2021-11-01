package aed2;

public class Shellsort {
    
    /**
     * Ordenamiento por shellsort.
     * @param listaEntrada
     * @return
     */
    public static int[] shellsort(int[] listaEntrada) {

        int j = 0;
        int incre = 0;

        int[] incrementos = new int[]{103, 73, 43, 23, 13, 3, 1};

        for (int incremento = 0; incremento < incrementos.length; incremento++) {
            // tomo valor del incremento.
            incre = incrementos[incremento];
            // recorrido
            if (incre < (listaEntrada.length / 2)) {
                for (int i = incre; i < listaEntrada.length; i++) {
                    j = i - incre;
                    // si cumple, realizamos el intercambio.
                    while ( (j >= 0) && (listaEntrada[j + incre] < listaEntrada[j]) ) {
                        Intercambio.intercambia(listaEntrada, j, j + incre);
                        j = j - incre;
                    }
                }
            }
        }
        return listaEntrada;
    }

}
