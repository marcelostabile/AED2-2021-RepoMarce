package varios;

import java.util.LinkedList;

public class Convertidor {
    
    /**
     * Recibe un número entero y devuelve un arreglo con los dígitos invertidos.
     * Posición [0] indica el signo (1 o -1).
     * @param numeroEntero
     * @return
     */
    public static int[] enteroToArregloInverso(int numeroEntero) {
        
        // largo del número.
        int largoNumero = Integer.toString(numeroEntero).length();
        return enteroToArregloInverso(numeroEntero, largoNumero);
    }


    /**
     * Recibe un entero y retorna un arreglo con los dígitos invertidos.
     * Posición [0] indica el signo (1 o -1).
     * @param numeroEntero
     * @param largoNumero
     * @return
     */
    public static int[] enteroToArregloInverso(int numeroEntero, int largoNumero) {

        // número resultado.
        int[] arrResultado = new int[largoNumero + 1];

        // Signo del número.
        if (numeroEntero >= 0) { 
            arrResultado[0] = 1;
        } else {
            arrResultado[0] = -1;
        }

        // Almacenamos los dígitos en una pila.
        LinkedList<Integer> pila = new LinkedList<>();
        while(numeroEntero > 0) {
            pila.push(numeroEntero % 10);
            numeroEntero = numeroEntero / 10;
        }

        // Insertamos los dígitos en el vector.
        int i = largoNumero;
        while ( !pila.isEmpty() ) {
            arrResultado[i] = pila.pop();
            i--;
        }

        // Devolver resultado.
        return arrResultado;
    }


    /**
     * Invierte un arreglo a partir de la posición 1.
     * @param arregloEntero
     * @return
     */
    public static int[] invertirArreglo(int[] arreglo) {

        // largo del arreglo.
        int largo = arreglo.length;
        // creamos un arreglo para el resultado.
        int[] arrResultado = new int[largo];
        // invertir el arreglo.
        int pos = 0;
        for (int i = 0; i <= largo-1; i++) {
            pos = largo-i-1;
            arrResultado[i] = arreglo[pos];
        }
        // Devolvemos el resultado.
        return arrResultado;
    }

}
