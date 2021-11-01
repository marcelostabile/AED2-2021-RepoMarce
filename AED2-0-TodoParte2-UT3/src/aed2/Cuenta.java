package aed2;

public class Cuenta {

    public static int[] cuenta(int[] lista) {

        int MAX = 10000;

        int[] arrCuenta = new int[MAX + 1];

        for (int i = 0; i < lista.length; i++) {
            arrCuenta[lista[i]]++;
        }

        for (int i = 1; i < MAX + 1; i++) {
            arrCuenta[i] += arrCuenta[i - 1];
        }

        int[] salida = new int[lista.length];

        for (int i = lista.length - 1; i >= 0; i--) {
            int j = arrCuenta[lista[i]] - 1;
            salida[j] = lista[i];
            arrCuenta[lista[i]]--;
        }

        return salida;
    }

}
