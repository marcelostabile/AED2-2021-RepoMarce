package aed2;

public class Burbuja {
    
    public static int[] burbuja(int[] listaEntrada) {

        if (listaEntrada != null) {
            int N = listaEntrada.length - 1;
            // Recorrida de principio a fin.
            for (int i = 0; i <= N; i++) {
                // Recorrida comparando las claves desde el final hasta i-1;
                for (int j = N; j >= (i + 1); j--) {
                    // Comparación.
                    if (listaEntrada[j] < listaEntrada[j - 1]) {
                        // Realizamos el intercambio de posiciones.
                        Intercambio.intercambia(listaEntrada, j - 1, j);
                    }
                }
            }
            return listaEntrada;
        }
        return null;
    }

}
