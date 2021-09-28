package extras;

public class Ordenador {
    
    /**
     * Ordenamiento por inserción directa.
     * Tipo: inserción - Estable.
     * @param arregloEntero
     * @return
     */
    public int[] insercionDirecta(int[] arreglo) {

        System.out.println("\nInserción Directa\n");

        int valorActual = 0;
        int posAnteriorj = 0;
        for (int i = 1; i <= arreglo.length-1; i++) {
            // elemento actual.
            valorActual = arreglo[i];
            // posición elemento anterior.
            posAnteriorj = i - 1;
            // ordenamiento.
            while ( (posAnteriorj >= 0) && (valorActual < arreglo[posAnteriorj]) ) {
                // Intercambiamos las posiciones.
                arreglo[posAnteriorj + 1] = arreglo[posAnteriorj];
                posAnteriorj = posAnteriorj - 1;
            }
            arreglo[posAnteriorj+1] = valorActual;
        }
        // Devolvemos el arreglo ordenado.
        return arreglo;
    }



    // public int[] shellsort(int[] arreglo) {

    //     System.out.println("\nShellsort\n");

    //     int[] arregloResultado = new int[arreglo.length];

    //     // Determinar el vector de incrementos.

    //     // 
    //     for (int k = t; k <= 1; i++) {
    //         int 
    //     }

    //     // Devolvemos el arreglo ordenado.
    //     return arregloResultado;
    // }
}
