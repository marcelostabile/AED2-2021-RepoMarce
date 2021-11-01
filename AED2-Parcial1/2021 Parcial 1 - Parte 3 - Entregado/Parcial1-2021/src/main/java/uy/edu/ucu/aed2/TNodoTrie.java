package uy.edu.ucu.aed2;

import java.util.*;

public class TNodoTrie {
    
    public TNodoTrie[] hijos;
    public boolean finPalabra;
    public int comienzaPalabra;
    public int items = 1000;

    public TNodoTrie() {
        hijos = new TNodoTrie[items];
        finPalabra = false;
    }

    public void insertar(String elemento, int posicion) {
        TNodoTrie actual = this;
        for (int i=0; i < elemento.length(); i++){
            if (actual.hijos[i] == null){
                actual.hijos[i] = new TNodoTrie();
            }
            actual = actual.hijos[i];
        }
        actual.finPalabra = true;
        actual.comienzaPalabra = posicion;
    }


    public void encontrarPatron(String patron, LinkedList<Integer> resultados) {

        // nodo actual.
        TNodoTrie actual = this;
        // recorrer el padron.
        for (int i = 0; i < patron.length(); i++) { 
            // hijo nulo.
            if (actual.hijos[i] == null)
                return;
            actual = actual.hijos[i];
        }
        actual.recorrer(actual,resultados);
    }

    private void recorrer(TNodoTrie actual, LinkedList<Integer> resultados) {
        if (actual.finPalabra){
            resultados.add(actual.comienzaPalabra);
        }
        for (int i = 0; i < items; i++){
            if (actual.hijos[i] != null){
                actual.hijos[i].recorrer(actual.hijos[i], resultados);
            }  
        }
    }


}
