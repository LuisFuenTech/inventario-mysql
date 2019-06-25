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
public class Producto {
    //Llenar los atributos (columnas en DDBB) de esta clase
    //Esta representa la tabla 'producto' en la DB
    private int id;
    private String nombre;
    private int cantidad;
    private double costo_unitario;
    private double costo_total;

    public Producto() {      
        System.out.println("Producto instanciado");
    }
    
    public Producto(int id, String nombre, int cantidad, double costo_unitario, double costo_total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo_unitario = costo_unitario;
        this.costo_total = costo_total;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public double getCosto_unitario() {
        return costo_unitario;
    }

    public void setCosto_unitario(double costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }
    
    public int calcularCantidad(int cantidad){
        return this.cantidad + cantidad;
    }

    public double calcularTotal(double total){
        return this.costo_total + total;
    }
    
    public int ventaCantidad(int cantidad){
        return this.cantidad - cantidad;
    }
    
    public double ventaTotal(double total){
        return this.costo_total - total;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", costo_unitario=" + costo_unitario + ", costo_total=" + costo_total + '}';
    }
     
}
