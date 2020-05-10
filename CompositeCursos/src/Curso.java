
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Curso extends AbstracCurso {
    String nombreC; 
    private List<AbstracCurso> ListTemas;

    public Curso(String nombreC) {
        this.nombreC = nombreC;
        ListTemas = new ArrayList<AbstracCurso>();
    }
        
 
 
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombreC() {
        return nombreC;
    }
    
      public void addTemas(AbstracCurso temas) {
        this.ListTemas.add(temas);
    }

    public boolean removeTemas(AbstracCurso temas) {
        return this.ListTemas.remove(temas);
    }

    @Override
    public int getDuracion() {
        
    int duracion=0;
    for (AbstracCurso curso :ListTemas){
        duracion += curso.getDuracion();
        
        }
    return duracion;
    }

    @Override
    public double getCosto() {
         int costo=0;
    for (AbstracCurso curso :ListTemas){
        costo += curso.getDuracion();
        
        }
    return costo;
    }
   
    
}
