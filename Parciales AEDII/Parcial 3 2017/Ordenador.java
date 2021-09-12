
import java.util.LinkedList;


public class Ordenador {

    public static void main(String[] args) {
        // cargar los datos utilizando el Manejador de Archivos
        // utilizar la clase TProducto
        String [] datos = ManejadorArchivosGenerico.leerArchivo("C:\\Users\\Mayra\\Desktop\\Parcial3MMontero\\Parcial3\\src\\datos_productos.txt", true);
        LinkedList<TProducto> productos = new LinkedList<>();
        for (int i = 0; i<datos.length ; i++)
        {
            String[] campos = datos[i].split(",");
            if (campos.length <= 4){
                long codigo = Long.parseLong(campos[0]);
                String descrip = campos[1];
                Double precio= Double.parseDouble(campos[2]);
                int cantidad= Integer.parseInt(campos[3]);
                TProducto p = new TProducto(codigo, descrip, precio,cantidad);
                productos.add(p);
            }
        }
        
        
       
        Ordenador c = new Ordenador();
        LinkedList<TProducto> ordenadoAscendente = c.ordenarPorHeapSort(productos, true);
        LinkedList<TProducto> ordenadoDescendente = c.ordenarPorHeapSort(productos, false);
        String[] texto = new String[ordenadoAscendente.size()];
        String[] texto2 = new String[ordenadoDescendente.size()];
        for(int i=0;i<ordenadoAscendente.size();i++){  
            System.out.print(i+"-");
                
            }
        int cantidades=0;
        for (int m=0; m<=500; m++)
        {
            TProducto auxi= ordenadoAscendente.get(m);
            cantidades+= auxi.getCantidad();
        }
        System.out.println(cantidades);
        for(int j=0;j<ordenadoDescendente.size();j++){
                    System.out.print(j+"-");
                
        }
        
        
        //ManejadorArchivosGenerico.escribirArchivo("src/parcial3/salidaNombresAscendete.txt", texto);
        //ManejadorArchivosGenerico.escribirArchivo("src/parcial3/salidaNombresDescendente.txt", texto2);
    }

    

        // Ordenar en forma ascendente
        // EMITIR POR CONSOLA EL VALOR TOTAL DE STOCK DE LOS PRIMEROS 500 ELEMENTOS
        // escribir el archivo de salida con los datos ordenados en forma ascendente, 
        //Y AL FINAL ESCRIBIR EL VALOR DE STOCK DE LOS PRIMEROS 500 ELEMENTOS
        
        
        // Ordenar en forma descendente
        // EMITIR POR CONSOLA EL VALOR TOTAL DE STOCK DE LOS PRIMEROS 300 ELEMENTOS
        // escribir el archivo de salida con los datos ordenados en forma descendente
        // Y AL FINAL ESCRIBIR EL VALOR DE STOCK DE LOS PRIMEROS 300 ELEMENTOS
  
        private void intercambiar(LinkedList <TProducto> vector, int pos1, int pos2) {
        TProducto temp = vector.get(pos2);
        vector.set(pos2, vector.get(pos1));
        vector.set(pos1, temp);
    }

    /**
     *
     * @param datosParaClasificar
     * @return
     */
    protected LinkedList<TProducto> ordenarPorHeapSort(LinkedList<TProducto> datosParaClasificar, boolean ascendente) {
		for (int i = (datosParaClasificar.size()- 1) / 2; i >= 0; i--) { //Armo el heap inicial de n-1 div 2 hasta 0
			armaHeap(datosParaClasificar, i, datosParaClasificar.size() - 1, ascendente);
		}
		for (int i = datosParaClasificar.size() - 1; i  >= 1; i--) {
			intercambiar(datosParaClasificar,0,i);
			armaHeap(datosParaClasificar, 0, i-1,ascendente);
		}
		return datosParaClasificar;
        
	
    }


	private void armaHeap(LinkedList<TProducto> datosParaClasificar, int primero, int ultimo, boolean ascendente) {
	if (ascendente){	
            if (primero < ultimo){
			int r = primero;
			while(r <= ultimo / 2){
				if (ultimo == 2*r){ //r tiene un hijo solo
                                    TProducto aux= datosParaClasificar.get(r);
                                    TProducto auxHijo = datosParaClasificar.get(r*2);
						if (aux.getCodigo() > auxHijo.getCodigo()){
							intercambiar(datosParaClasificar, r, 2 * r);      
						}
                                                r = ultimo;
				} else { //r tiene 2 hijos
					int posicionIntercambio = 0;
                                        TProducto aux= datosParaClasificar.get(r);
                                        TProducto auxHijoI = datosParaClasificar.get(r*2);
                                        TProducto auxHijoD = datosParaClasificar.get(r*2+1);
					if (auxHijoI.getCodigo() > auxHijoD.getCodigo()){
						posicionIntercambio = 2 * r +1;
					} else {
						posicionIntercambio = 2 * r;
					}
                                        TProducto auxIntercambio = datosParaClasificar.get(posicionIntercambio);
					if (aux.getCodigo() > auxIntercambio.getCodigo()){
						intercambiar(datosParaClasificar,r,posicionIntercambio);
						r = posicionIntercambio;
					} else {
						r = ultimo;
					}
				}
			}			
		}
	}
        else 
        {
            if (primero < ultimo){
			int r = primero;
			while(r <= ultimo / 2){
				if (ultimo == 2*r){ //r tiene un hijo solo
                                    TProducto aux= datosParaClasificar.get(r);
                                    TProducto auxHijo = datosParaClasificar.get(r*2);
						if (aux.getCodigo() < auxHijo.getCodigo()){
							intercambiar(datosParaClasificar, r, 2 * r);      
						}
                                                r = ultimo;
				} else { //r tiene 2 hijos
					int posicionIntercambio = 0;
                                        TProducto aux= datosParaClasificar.get(r);
                                        TProducto auxHijoI = datosParaClasificar.get(r*2);
                                        TProducto auxHijoD = datosParaClasificar.get(r*2+1);
					if (auxHijoI.getCodigo() < auxHijoD.getCodigo()){
						posicionIntercambio = 2 * r +1;
					} else {
						posicionIntercambio = 2 * r;
					}
                                        TProducto auxIntercambio = datosParaClasificar.get(posicionIntercambio);
					if (aux.getCodigo() < auxIntercambio.getCodigo()){
						intercambiar(datosParaClasificar,r,posicionIntercambio);
						r = posicionIntercambio;
					} else {
						r = ultimo;
					}
				}
			}			
		}
        }
        }
}