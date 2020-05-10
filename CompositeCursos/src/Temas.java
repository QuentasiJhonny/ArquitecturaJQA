/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Temas extends AbstracCurso{
    String nombre;
    String objetivoAprendisaje;
    String Contenido;


    public Temas(String nombre, String objetivoAprendisaje, String Contenido, int Duracion, double costo) {
        this.Duracion=Duracion;
        this.costo=costo;
        this.nombre = nombre;
        this.objetivoAprendisaje = objetivoAprendisaje;
        this.Contenido = Contenido;
    }
      
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetivoAprendisaje(String objetivoAprendisaje) {
        this.objetivoAprendisaje = objetivoAprendisaje;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObjetivoAprendisaje() {
        return objetivoAprendisaje;
    }

    public String getContenido() {
        return Contenido;
    }

    @Override
    public int getDuracion() {
        return Duracion;
        }

    @Override
    public double getCosto() {
        return costo;
    }
     public void setCosto(double costo) {
        this.costo = costo;
    }
    
   
  
   
    
}
