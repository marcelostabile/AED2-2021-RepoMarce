/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GermanPujadas
 */
public class TNodoTrieProteinaTest {
    
    public TArbolSufijosProteina TreeInit() {
        
        TArbolSufijosProteina treeTest = new TArbolSufijosProteina();
        String[] secuencia = ManejadorArchivosGenerico.leerArchivo("src/proteina.txt");       
        int indice = secuencia[0].length()-1;

        while (indice >= 0){
            String sufijo = "";
            for (int i = indice; i < secuencia[0].length(); i++) {
                sufijo += secuencia[0].charAt(i);
            }
            treeTest.insertar(sufijo, indice);
            indice --;   
        }
        
        return treeTest;
    }

    /**
     * Test of encontrarPatron method, of class TNodoTrieProteina.
     */
    @Test
    public void testEncontrarPatronExitoso() {
        System.out.println("encontrarPatron");
        String patron = "PQL";
        LinkedList<Integer> locations = new LinkedList<Integer>();
        TArbolSufijosProteina treeTest = TreeInit();
        locations = treeTest.encontrarPatron(patron);
    }
    
    @Test
    public void testEncontrarPatronSinExito() {
        System.out.println("encontrarPatron");
        String patron = "asd";
        LinkedList<Integer> locations = new LinkedList<Integer>();
        TArbolSufijosProteina treeTest = TreeInit();
        locations = treeTest.encontrarPatron(patron);
    }

}
