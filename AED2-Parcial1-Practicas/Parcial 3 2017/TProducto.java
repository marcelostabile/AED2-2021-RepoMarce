/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public class TProducto implements IProducto {
    private long codigo;
    private String descripcion;
    private double precio;
    private int cantidad;

    public TProducto (long unCodigo, String unaDes, double  unprecio, int unaCant)
    {
        codigo = unCodigo;
        descripcion=unaDes;
        precio=unprecio;
        cantidad = unaCant;
    }
    
    @Override
    public long getCodigo() {
     return codigo;
             }

    
    @Override
    public String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCantidad() {
       return cantidad; }

    @Override
    public double valor() {
       return (this.cantidad * this.precio);
    }
    
    
            
}
