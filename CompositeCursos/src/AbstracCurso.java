/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public abstract class AbstracCurso {
    
    int  Duracion;
    double costo;

    

    public abstract int getDuracion();
        

    public abstract double getCosto();

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
   
    
}
