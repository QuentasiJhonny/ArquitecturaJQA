/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstracPlantas;

/**
 *
 * @author Jhonny
 */
public class Rosa implements IPlantas {
    
     String Estado;
      int NroEspinas;
    public Rosa(String Estado, int NroEspinas) {
        this.Estado = Estado;
        this.NroEspinas = NroEspinas;
    }
 
    
    @Override
    public String Crecer() {
       return "La rosa esta Creciendo";
    }

    @Override
    public String Florecer() {
       return "La rosa esta floreciendo";
      
    }

    @Override
    public String Morir() {
       return "La rosa esta muerta";
    }

    @Override
    public String ObtenerValores() {
        return "La rosa esta "+this.Estado+"y tiene "+this.NroEspinas+"Espinas";
    }
    
}
