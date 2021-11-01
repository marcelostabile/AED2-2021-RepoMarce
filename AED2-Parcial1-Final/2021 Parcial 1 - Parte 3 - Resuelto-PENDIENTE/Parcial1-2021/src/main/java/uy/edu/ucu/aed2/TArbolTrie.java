package uy.edu.ucu.aed2;

import java.util.LinkedList;

public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz = new TNodoTrie();

    @Override
    public LinkedList<Integer> encontrarPatron(String patron) {
        LinkedList<Integer> resultados = new LinkedList<>();
        raiz.encontrarPatron(patron, resultados);
        return resultados;
    }

    @Override
    public void insertar(String elemento, int posicion) {
        raiz.insertar(elemento, posicion);
    }

}
