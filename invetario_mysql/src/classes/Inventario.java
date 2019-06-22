/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Luis Fuentes <luisfuau10@gmail.com>
 */
public class Inventario {
    //Esta clase representa la tabla 'inventario' en la DB
    private Producto producto;
    private Detalle detalle;
    private int id;

    public Inventario(Producto producto, Detalle detalle, int id) {
        this.producto = producto;
        this.detalle = detalle;
        this.id = id;
    }
    
    public Inventario(){
        
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   
    
}
