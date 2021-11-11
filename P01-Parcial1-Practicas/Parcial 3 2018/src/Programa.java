
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciar productos del ecommerce leyendo del archivo.
        String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/flipkart-ecommerce-sample.csv", true);
        LinkedList<TProduct> productos = new LinkedList<>();
        Ordenador sort = new Ordenador();
        int i = 0;
        
        
        for(String linea : lineas) {
            try {
                TProduct producto = new TProduct(linea);
                if (producto.isValid()) {
                    i += 1;
                    productos.add(producto); 
                }
            } catch (Exception ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        sort.ordenarPorHeapSort(productos);
        System.out.println("Se cargaron " + i + " productos");
        
        
        String[] salida = new String[productos.size()];
        int j = 0;
        for(TProduct product : productos){
            salida[j] = product.datos();
            j+=1;
        }
        
        ManejadorArchivosGenerico.escribirArchivo("salida.txt", salida);
        // Escribir los resultados al archivo "salida.txt"
        // Emitir un archivo de salida, "salida.txt" con la lista de productos ordenados por la propiedad indicada en el pizarrón.
    }
}
