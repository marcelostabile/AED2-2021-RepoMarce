package uy.edu.ucu.aed2;

import java.util.*;

public class TNodoTrie {
    
    public int CARAC_EN_ALFABETO = 2;    
    public TNodoTrie[] hijos;
    public boolean finPalabra;
    public int comienzaPalabra;


    public TNodoTrie() {
        hijos = new TNodoTrie[CARAC_EN_ALFABETO];
        finPalabra = false;
    }

    public void insertar(String unaPalabra, int posicion) {
        TNodoTrie actual = this;
        for (int i=0; i < unaPalabra.length(); i++){
            int indice = obtenerIndice(unaPalabra.charAt(i));
            if (actual.hijos[indice] == null){
                actual.hijos[indice] = new TNodoTrie();
            }
            actual = actual.hijos[indice];
        }
        actual.finPalabra = true;
        actual.comienzaPalabra = posicion;
    }


    public void encontrarPatron(String patron, LinkedList<Integer> resultados) {

        // nodo actual.
        TNodoTrie actual = this;
        // recorrer el patron.
        for (int i = 0; i < patron.length(); i++) { 
            int indice = obtenerIndice(patron.charAt(i));
            // hijo nulo.
            if (actual.hijos[indice] == null)
                return;
            actual = actual.hijos[indice];
        }
        actual.recorrer(actual,resultados);
    }

    private void recorrer(TNodoTrie unNodo, LinkedList<Integer> resultados) {
        TNodoTrie actual = unNodo;
        if (actual.finPalabra){
            resultados.add(actual.comienzaPalabra);
        }
        for (int i = 0; i < CARAC_EN_ALFABETO; i++){
            if (actual.hijos[i] != null){
                actual.hijos[i].recorrer(actual.hijos[i], resultados);
            }  
        }
    }
    public int obtenerIndice(char unChar){
        switch ((int) unChar){
            case '0':
                return 0;
            case '1':
                return 1;
            default:
                return -1;
        }
    }

}
