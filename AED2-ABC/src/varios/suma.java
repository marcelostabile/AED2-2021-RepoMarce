package varios;

import java.util.Arrays;

public class suma {

    /**
     * Suma dos números.
     * @param numero1
     * @param numero2
     * @return
     */
    public int sumaEnterosPositivos(int numero1, int numero2) {

        // determinar largo del resultado.
        int largoMayorSumando = Math.max( Integer.toString(numero1).length(), Integer.toString(numero2).length() );

        // crear arreglos para números y resultado.
        int[] arrNro1 = Convertidor.enteroToArregloInverso(numero1, largoMayorSumando);
        int[] arrNro2 = Convertidor.enteroToArregloInverso(numero2, largoMayorSumando);
        int[] arrTotal = new int[largoMayorSumando + 2];

        // determinar signo del resultado. Se deja para futuros desarrollos.
        // Ambos positivos.
        if (numero1 >= 0 && numero2 >= 0) arrTotal[0] = 1;
        // Ambos negativos.
        if (numero1 < 0 && numero2 < 0) arrTotal[0] = -1;
        // El primero es mayor negativo (tot negativo).
        if (numero1 < 0 && Math.abs(numero1) > numero2) {
            arrTotal[0] = -1;
        } else {
            arrTotal[0] = 1;
        }
        // El segundo es mayor negativo (tot negativo).
        if (numero2 < 0 && Math.abs(numero2) > numero1) {
            arrTotal[0] = -1;
        } else {
            arrTotal[0] = 1;
        }

        // para cada posición, multiplicar cada número por signo y sumarlos.
        int resultado = 0;
        for (int i = 1; i <= largoMayorSumando; i++) { 
            // suma de los dígitos.
            int nro1 = arrNro1[i];
            int nro2 = arrNro2[i];
            int meLlevo = arrTotal[i];
            resultado = (nro1 * arrNro1[0]) + (nro2 * arrNro2[0]) + meLlevo;
            // decenas.
            if (resultado < 10) {
                arrTotal[i] =  resultado;
            } else {
                String arrAux[] = String.valueOf(resultado).split("(?<=.)");
                arrTotal[i] = Integer.parseInt(arrAux[1]);
                // Agregamos el dígito significativo en la siguiente posición. 
                arrTotal[i+1] = Integer.parseInt(arrAux[0]);
            }
        }

        // Obtener un fragmento del array para obtener el número, descartamos el signo.
        int[] arrNro = Arrays.copyOfRange(arrTotal, 1, arrTotal.length);

        // Convertir el arreglo en string.
        arrNro = Convertidor.invertirArreglo(arrNro);
        String aux = Arrays.toString(arrNro);

        // Convertir arreglo a entero.
        int nroResultado = Integer.parseInt(aux);
        nroResultado = nroResultado * arrNro[0];

        System.out.println(nroResultado);

        // devolvemos resultado.
        return  nroResultado;

    }

}
