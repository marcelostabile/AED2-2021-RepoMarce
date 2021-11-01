
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author germanpujadas
 */
public class Ordenador{

    public void Ordenador(){}
    
    public LinkedList<TProduct> ordenarPorHeapSort(LinkedList<TProduct> datosParaClasificar) {
            for (int i = (datosParaClasificar.size() - 1) / 2; i >= 0; i--) {
                armaHeap(datosParaClasificar, i, datosParaClasificar.size() - 1);
            }
            for (int i = datosParaClasificar.size() - 1; i >= 1; i--) {
                intercambiar(datosParaClasificar, 0, i);
                armaHeap(datosParaClasificar, 0, i - 1);
            }
            return datosParaClasificar;
        }

    private void armaHeap(LinkedList<TProduct> datos, int primero, int ultimo) {
            if (primero < ultimo) {
                int r = primero;
                while (2 * r + 1 <= ultimo) {
                    if (ultimo == 2 * r + 1) {
                        if (datos.get(2 * r + 1).compareTo(datos.get(r)) <0) {
                            intercambiar(datos, r, 2 * r + 1);
                        }
                        break;
                    } else {
                        int izq = 2 * r + 1;
                        int der = 2 * r + 2;
                        int hijoMenor = datos.get(izq).compareTo(datos.get(der)) < 0 ? izq : der;
                        if (datos.get(hijoMenor).compareTo(datos.get(r)) < 0) {
                            intercambiar(datos, r, hijoMenor);
                            r = hijoMenor;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    private void intercambiar(LinkedList<TProduct> vector, int pos1, int pos2) {
        TProduct temp = vector.get(pos2);
        vector.set(pos2, vector.get(pos1)); 
        vector.set(pos1, temp);
    }
    
}
