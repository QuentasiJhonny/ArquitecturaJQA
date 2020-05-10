
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
public class Carrera extends AbstracCurso{
    String NombreCarrera;
    String ModalidadGraduacion;
     private List<AbstracCurso> Listcursos;
     
     public Carrera(String NombreCarrera, String ModalidadGraduacion) {
       
        this.NombreCarrera = NombreCarrera;
        this.ModalidadGraduacion = ModalidadGraduacion;
        Listcursos = new ArrayList<AbstracCurso>();
    }

   
  
    

    public String getNombreCarrera() {
        return NombreCarrera;
    }

    public String getModalidadGraduacion() {
        return ModalidadGraduacion;
    }

    public void setNombreCarrera(String NombreCarrera) {
        this.NombreCarrera = NombreCarrera;
    }

    public void setModalidadGraduacion(String ModalidadGraduacion) {
        this.ModalidadGraduacion = ModalidadGraduacion;
    }
    
        public void addCurso(AbstracCurso cursos) {
        this.Listcursos.add(cursos);
    }

    public boolean removeCurso(AbstracCurso cursos) {
        return this.Listcursos.remove(cursos);
    }

    @Override
    public int getDuracion() {
         int duracion=0;
    for (AbstracCurso curso :Listcursos){
        duracion += curso.getDuracion();
        
        }
    return duracion;
    }

    @Override
    public double getCosto() {
        
         int costo=0;
    for (AbstracCurso curso :Listcursos){
        costo+= curso.getCosto();
        
        }
    return costo;
    }

    
   
    
}
