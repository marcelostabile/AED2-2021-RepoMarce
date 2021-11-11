import java.util.LinkedList;

public class TNodoTrieProteina implements INodoTrieProteina{

    private final int cantDeElementos = 20;
    private TNodoTrieProteina[] hijos;
    private boolean esPalabra;
    private int inicioDePalabra;

    public TNodoTrieProteina() {
        hijos = new TNodoTrieProteina[cantDeElementos];
        esPalabra = false;
    }

    @Override
    public void encontrarPatron(String patron, LinkedList<Integer> locations) {
        TNodoTrieProteina nodoActual = this;
        
        for (int i = 0; i < patron.length(); i++){
            int indice = getIndice(patron.charAt(i));
            if (nodoActual.hijos[indice] == null)
                return;
            nodoActual = nodoActual.hijos[indice];
        }
        nodoActual.recorrer(nodoActual,locations);
    }

    @Override
    public void insertar(String unaPalabra, int posicion) {
        TNodoTrieProteina nodoActual = this;
        for (int i=0; i<unaPalabra.length(); i++){
                int indice = getIndice(unaPalabra.charAt(i));
                if (nodoActual.hijos[indice] == null){
                    nodoActual.hijos[indice] = new TNodoTrieProteina();
                }
                nodoActual = nodoActual.hijos[indice];
            }
            nodoActual.esPalabra = true;
            nodoActual.inicioDePalabra= posicion;
    }
    
    public void recorrer (TNodoTrieProteina unNodo, LinkedList<Integer> unaLista){
        TNodoTrieProteina nodoActual = unNodo;
        if (nodoActual.esPalabra){
            unaLista.add(nodoActual.inicioDePalabra);
        }
        for (int i = 0; i < cantDeElementos; i++){
            if (nodoActual.hijos[i] != null){
                nodoActual.hijos[i].recorrer(nodoActual.hijos[i], unaLista);
            }  
        }
    }
    
    public int getIndice(char unChar){
        switch ((int) unChar){
            case 'A':
                return 0;
            case 'R':
                return 1;
            case 'N':
                return 2;
            case 'D':
                return 3;
            case 'C':
                return 4;
            case 'E':
                return 5;
            case 'Q':
                return 6;            
            case 'G':
                return 7;            
            case 'H':
                return 8;            
            case 'I':
                return 9;            
            case 'L':
                return 10;            
            case 'K':
                return 11;            
            case 'M':
                return 12;            
            case 'F':
                return 13;            
            case 'P':
                return 14;            
            case 'S':
                return 15;            
            case 'T':
                return 16;            
            case 'W':
                return 17;            
            case 'Y':
                return 18;            
            case 'V':
                return 19;            
            default:
                return -1;
        }
    }

    
}
