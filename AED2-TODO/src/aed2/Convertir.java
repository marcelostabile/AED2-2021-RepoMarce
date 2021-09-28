package aed2;

public class Convertir {

    public static Integer[] convertirXAInteger(int[] arrInt) {
        Integer[] resultado = new Integer[arrInt.length];
        for (int i = 0; i < arrInt.length; i++) {
            resultado[i] = Integer.valueOf(arrInt[i]);
        }
        return resultado;
    }

    public static int[] convertirXAInt(Integer[] arrInteger) {
        int[] resultado = new int[arrInteger.length];
        for (int i = 0; i < arrInteger.length; i++) {
            resultado[i] = arrInteger[i].intValue();            
        }
        return resultado;
    }
    
}
