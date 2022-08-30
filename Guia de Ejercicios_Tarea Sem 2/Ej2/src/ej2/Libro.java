/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String ID;
    private String nombre;
    private String autor;
    private String descripcion;
    private double precio;

    @Override
    public String toString() {
        
        return  "|" + ID + "|" + nombre + "|" + autor + "|" + descripcion + "|" + precio + '\n';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Libro() {
    }

    public Libro(String ID, String nombre, String autor, String descripcion, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    
}
