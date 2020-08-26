/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Alimento  {
   private IEstado estado;

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public Alimento(IEstado estado) {
        this.estado = estado;
    }
   String Nombre;
   String Descripcion;
   double precio;

    public Alimento(String Nombre, String Descripcion, double precioBase) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precioBase) {
        this.precio = precio;
    }
   
    void CalcularPrecios(double precio){
    
       estado.CalcularPrecio(precio);
       
    }
    void NombreAlimentos(String Nombre, String Descripcion){
    
        System.out.println(""+Nombre+Descripcion);
    }
   
}
