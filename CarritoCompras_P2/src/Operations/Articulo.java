/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.io.Serializable;

/**
 *
 * @author User1
 */
public class Articulo implements Serializable{
    private String Nombre; //Nombre del articulo (el que tiene el txt)
    private String alias; //El alias del producto
    private double precio;//Precio del producto
    private String Descripcion; //Descripcion del articulo
    private int Cantidad; //Cantidad en stock
    private String B64imagenFr;//Imagen frontal en base 64
    private String B64imagenLt;//Imagen Lateral en base 64

    public Articulo(String Nombre, String alias, double precio, String Descripcion, int Cantidad, String B64imagenFr, String B64imagenLt) {
        this.Nombre = Nombre;
        this.alias = alias;
        this.precio = precio;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.B64imagenFr = B64imagenFr;
        this.B64imagenLt = B64imagenLt;
    }

    public Articulo() {
    }
    

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public String getB64imagenFr() {
        return B64imagenFr;
    }

    public void setB64imagenFr(String B64imagenFr) {
        this.B64imagenFr = B64imagenFr;
    }

    public String getB64imagenLt() {
        return B64imagenLt;
    }

    public void setB64imagenLt(String B64imagenLt) {
        this.B64imagenLt = B64imagenLt;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Articulo{" + "Nombre=" + Nombre + ", alias=" + alias + ", precio=" + precio + ", Cantidad=" + Cantidad + '}';
    }    
    
}
