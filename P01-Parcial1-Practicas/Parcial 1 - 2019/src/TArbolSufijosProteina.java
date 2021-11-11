
import java.util.LinkedList;

public class TArbolSufijosProteina implements IArbolSufijosProteina{

    private TNodoTrieProteina raiz = new TNodoTrieProteina();

    @Override
    public LinkedList<Integer> encontrarPatron(String patron) {
        LinkedList<Integer> locations = new LinkedList<>();
        raiz.encontrarPatron(patron, locations);
        return locations;
    }

    @Override
    public void insertar(String palabra, int posicion) {
        raiz.insertar(palabra, posicion);
    }

}
