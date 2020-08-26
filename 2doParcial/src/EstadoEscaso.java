/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class EstadoEscaso implements IEstado{
    double Precio;

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public EstadoEscaso(double Precio) {
        this.Precio = Precio;
    }
    
    @Override
    public void CalcularPrecio(double Precio) {
       double NuevoPrecio=Precio;
       System.out.println("El precio Estado Escaso sera:"+NuevoPrecio);

    }
    
}
