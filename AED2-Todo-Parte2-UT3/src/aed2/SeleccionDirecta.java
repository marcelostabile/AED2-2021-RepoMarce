package aed2;

public class SeleccionDirecta {

    public static int[] seleccionDirecta(int[] lista) {
        
        for (int i = 0; i <= lista.length - 1; i++) {
            int indiceMenor = i;
            int ClaveMenor = lista[i];
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < ClaveMenor) {
                    indiceMenor = j;
                    ClaveMenor = lista[j];
                }
            }
            Intercambio.intercambia(lista, i, indiceMenor);
        }
        return lista;
    }

}
